//Almicke Navarro 
//CST-323
//January 10, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/KaraokeMachine 
package SeniorCapstone.WhoAmI.model;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

public class Image {
	
	//attributes 
	private int ID; 
	
	@NotNull(message = "Name cannot be null.") 
	private String name; 
	
	@NotNull(message = "File cannot be null.")
	private MultipartFile file;

	//default constructor 
	public Image() {}
	
	//non-default constructor
	public Image(int iD) {
		super();
		ID = iD;
	}
	
	//setters & getters 
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getMultipartFile() {
		return file;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.file = multipartFile;
	}

}
