//Almicke Navarro 
//CST-452 
//

package SeniorCapstone.WhoAmI.business;

import SeniorCapstone.WhoAmI.model.Image;

public interface ImageBusinessInterface {
	//method to allow the creation of a new image in the database
	public boolean saveImage(Image i); 
	
	//method to get a single image from the database
	public Image findImage(int id); 

}
