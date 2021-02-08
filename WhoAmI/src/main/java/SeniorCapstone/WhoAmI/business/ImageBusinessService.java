//Almicke Navarro 
//CST-323
//January 12, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/ArtistWebsiteV3/blob/master/src/com/business/EventBusinessService.java

//SongBusinessService will persist any CRUD operations to the data service

package SeniorCapstone.WhoAmI.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SeniorCapstone.WhoAmI.data.ImageDataInterface;
import SeniorCapstone.WhoAmI.model.Image;

public class ImageBusinessService implements ImageBusinessInterface {
	@SuppressWarnings("rawtypes")
	@Autowired
	ImageDataInterface dao; 

	//creates a song in the database
	@SuppressWarnings("unchecked")
	public boolean saveImage(Image i) {
		System.out.println("Processing ImageBusinessService.saveImage()...");
		return dao.create(i);
	}

	//reads a single song from the database by its id
	@SuppressWarnings("unchecked")
	public Image findImage(int id) {
		System.out.println("Processing ImageBusinessService.findImage()...");
		return dao.read(id);
	}

}
