//Almicke Navarro 
//CST-323
//January 23, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/ArtistWebsiteV3

package SeniorCapstone.WhoAmI.business;

import SeniorCapstone.WhoAmI.model.Image;

public interface ImageBusinessInterface {
	//method to allow the creation of a new image in the database
	public boolean saveImage(Image i); 
	
	//method to get a single image from the database
	public Image findImage(int id); 

}
