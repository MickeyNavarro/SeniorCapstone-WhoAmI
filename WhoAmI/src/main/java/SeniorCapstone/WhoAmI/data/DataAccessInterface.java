//Almicke Navarro 
//CST-323
//January 12, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/KaraokeMachine
package SeniorCapstone.WhoAmI.data;

public interface DataAccessInterface<T> {
		//create will be used to create a new type of object to the database
		public boolean create(T t); 
		
		//read will be used to read a type of object  from the database
		public T read(int id); 
		
		//update will be used to update a type of object  in the the database - out of scope
		public boolean update(T t); 
		
		//delete will be used to delete a type of object from the database - out of scope
		public boolean delete(int id);  
}
