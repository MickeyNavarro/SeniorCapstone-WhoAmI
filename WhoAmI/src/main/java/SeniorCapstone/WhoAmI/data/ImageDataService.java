//Almicke Navarro 
//CST-323
//January 12, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/KaraokeMachine
package SeniorCapstone.WhoAmI.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import SeniorCapstone.WhoAmI.exception.DatabaseException;
import SeniorCapstone.WhoAmI.model.Image;

public class ImageDataService implements ImageDataInterface {
	
	@SuppressWarnings("unused")
	private DataSource dataSource; 
	private JdbcTemplate jdbcTemplate;
	
	//set the spring bean
	public void setDataSource(DataSource dataSource) { 
		this.dataSource = dataSource; 
	}
	
	//get and set the JDBC template object 
	public JdbcTemplate getJdbcTemplate() {
	    return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}

	//default constructor 
	public ImageDataService() {}
	
	//create a song to the database; returns if successful or not
	@Override
	public boolean create(Image i) {
		String sql = "INSERT INTO WhoAmI.Image (Name, File) VALUES (?,?)";
		try { 
			//output statement for console
			System.out.println("Successful connection for ImageDataService.create()!");
			
			//Execute SQL Insert 
			int rows = jdbcTemplate.update(sql, 
					i.getName(), i.getMultipartFile().getOriginalFilename()); 
			
			//Return result of Insert
			return rows == 1 ? true:false; 
		}
		catch (Exception e) { 
			//output statement for console
			System.out.println("Failed connection for ImageDataService.create()!");
			e.printStackTrace();
			throw new DatabaseException(e); 
		}
	}

	//read a song from the database; returns the song info
	@Override
	public Image read(int id) {
		/*
		String sql = "SELECT * FROM KaraokeMachine.Song WHERE ID = ?"; 

		//create a song object to hold the song found from the database
		Image image = null; 

		try { 
			//output statement for console
			System.out.println("Successful connection for SongDataService.read()!");

			//Execute SQL Query and check if an Event was returned
			SqlRowSet srs = jdbcTemplate.queryForRowSet(sql, id); 
			if(srs.next()) { 
				image = new Image(id,
						srs.getString("Name"), 
						srs.getString("File")); 

			}

		}
		catch (Exception e) { 
			//output statement for console
			System.out.println("Failed connection for SongDataService.read()!");
			e.printStackTrace();
			throw new DatabaseException(e); 
		}
		return image;  
		*/
		return null;
	}

	
	//update a song in the database; returns if successful or not - out of scope
	@Override
	public boolean update(Image p) {
		// TODO Auto-generated method stub
		return false;
	}

	//delete a song in the database; returns if successful or not - out of scope
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
