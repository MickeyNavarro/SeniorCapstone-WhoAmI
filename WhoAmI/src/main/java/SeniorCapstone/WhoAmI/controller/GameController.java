//https://www.codejava.net/frameworks/spring-boot/upload-multiple-files-example


package SeniorCapstone.WhoAmI.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SeniorCapstone.WhoAmI.business.ImageBusinessInterface;
import SeniorCapstone.WhoAmI.model.GameBoard;
import SeniorCapstone.WhoAmI.model.GameBundle;
import SeniorCapstone.WhoAmI.model.Image;

@Controller
public class GameController {
	
	//initialize gameboard 
	private static GameBoard theGame = new GameBoard();
	
	//initialize the game board bundle 
	private static GameBundle theGameBundle = new GameBundle(); 
	
	//spring bean declaration 
	ImageBusinessInterface imageService; 
		
	//set the spring bean
	public void setImageService(ImageBusinessInterface service) { 
		this.imageService = imageService; 
	}
	
	
	//method to display game creation form 
	@RequestMapping(value="/createGame-chooseSize")
	public ModelAndView displayChooseSizePage(HttpServletResponse response) throws IOException{
		return new ModelAndView("createGame_size", "gameBoard", new GameBoard());
	}
	
	//method to display upload images form if the size chosen was successful
	@RequestMapping(value="/createGame-uploadImages", method=RequestMethod.POST)
	public ModelAndView displayUploadImagesPage(@ModelAttribute("gameBoard") GameBoard gameboard, BindingResult result) throws IOException{
		//validate the form 
		if(result.hasErrors()) { 
			
			//return to choose size form to show any game creation errors
			return new ModelAndView("createGame_size", "gameBoard", gameboard); 
		}
		try { 
			//set the static gameboard to a new game
			theGame = new GameBoard(gameboard.getSize()); 
			
			//create a new gamebundle
			GameBundle gameBundle = new GameBundle();
			
			//create a modelandview 
			ModelAndView imagesMV = new ModelAndView("createGame_images", "gameBundle",gameBundle); 
			
			//create a size object
			int numOfImages = theGame.getSize() * theGame.getSize(); 
			
			//create list of images object 
			List<Image> listOfImages = new ArrayList<Image>();
			
			//loop through the total number of cells to add an image to the list 
			for (int i = 1; i <= numOfImages; i++) { 
				listOfImages.add(new Image(i)); //id will be temporary; will auto-increment during creation to db 
			}
			
			//set the list
			gameBundle.setImages(listOfImages);
			
			//add the object to the imagesMV
			//imagesMV.addObject("listOfImages", listOfImages); 
					
			//return to the upload images form 
			return imagesMV;
			
		}
		//catch all exceptions 
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			
			//return to choose size form to show any game creation errors
			return new ModelAndView("createGame_size", "gameBoard", gameboard);
		}
				
	}
	
	//method to display enter username form if the photos uploads were successful
		@RequestMapping(value="/createGame-enterUsername", method=RequestMethod.POST)
		public ModelAndView displayEnterUsernamePage(@ModelAttribute("gameBundle") GameBundle gameBundle, BindingResult result, HttpServletRequest servletRequest) throws IOException{
			//validate the form 
			if(result.hasErrors()) { 
				
				//return to upload images form to show any game creation errors
				return new ModelAndView("createGame_images", "gameBundle", gameBundle); 
			}
			
			try {
				//get the uploaded files from the gamebundle
		        List<Image> images = gameBundle.getImages(); 
		        
		        //check if the list of images is not empty or null 
		        if (null != images && images.size() > 0) 
		        {
		        	
		        	//for each image in the list of images
		            for (Image i : images) {
		 
		            	//get the original file name & add it to the list of fileNames 
		                String fileName =  StringUtils.cleanPath(i.getMultipartFile().getOriginalFilename()); 
		                
		                String uploadDir = "images/" + fileName;
		                
		                Path uploadPath = Paths.get(uploadDir);
		                
		                if (!Files.exists(uploadPath)) {
		                    Files.createDirectories(uploadPath);
		                }
		                  
		                try (InputStream inputStream = i.getMultipartFile().getInputStream()) {
		                    Path filePath = uploadPath.resolve(fileName);
		                    Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
		                } catch (IOException ioe) {       
		                    throw new IOException("Could not save image file: " + fileName, ioe); 
		                }  
		            }

		        }	
		        
		        return new ModelAndView("createGame_username");
	        } 
			//catch all exceptions 
			catch (Exception e) {
				System.out.println("Error in uploading images! Exception message: " + e.getMessage());
				
				//return to upload images form to show any game creation errors
				return new ModelAndView("createGame_images", "gameBundle", gameBundle); 
					
			}
								
	}
			
	//method to display join game form 
	@RequestMapping(value="/joinGame")
	public ModelAndView displayJoinGamePage(HttpServletResponse response) throws IOException{
		return new ModelAndView("joinGame");
	}
	
	//method to deal with click action 
	
	//method to display game page - must be accessed via CreateGame or JoinGame
	@RequestMapping(value="/gamePage", method=RequestMethod.POST)
			public ModelAndView displayMainGamePage(@ModelAttribute("gameBundle") GameBundle gameBundle, BindingResult result) throws IOException{
				//validate the form 
				if(result.hasErrors()) { 
					
					//return to choose size form to show any game creation errors
					return new ModelAndView("createGame_username", "gameBundle", gameBundle); 
				}
				
				try {
					//set the static gamebundle to the new gameBundle
					theGameBundle = gameBundle; 

					//return to mainGame 
			        return new ModelAndView("mainGame","gameBundle", gameBundle);
		        } 
				//catch all exceptions 
				catch (Exception e) {
					System.out.println("Error! Exception message: " + e.getMessage());
					
					//return to enter username form to show any game creation errors
					return new ModelAndView("createGame_username", "gameBundle", gameBundle); 
						
				}
									
		}
	

	//method to display the winner page which indicates game completion 

}
