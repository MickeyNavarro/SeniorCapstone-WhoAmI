//Almicke Navarro 
//CST-323
//January 10, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/KaraokeMachine
package SeniorCapstone.WhoAmI.model;

public class Cell {
	
	//attributes
	private int rowIndex; 
	private int colIndex;
	private String name; //name given to the 
	private String image;
	private Boolean isVisted; 
	
	//default constructor 
	public Cell() {}
	
	//non-default constructor to set the size of the board
	public Cell(int rowIndex, int colIndex) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
		this.isVisted = false; //must be set to false as the players have yet to "visit" this cell 
	}
	
	/* 
	//non-default constructor to set the name & image of the cell given 
	public Cell(int rowIndex, int colIndex, String name, String image) {
		super();
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
		this.name = name;
		this.image = image;
		this.isVisted = isVisted;
	}
	*/

	//setters & getters 
	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public int getColIndex() {
		return colIndex;
	}

	public void setColIndex(int colIndex) {
		this.colIndex = colIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getIsVisted() {
		return isVisted;
	}

	public void setIsVisted(Boolean isVisted) {
		this.isVisted = isVisted;
	} 	
}
