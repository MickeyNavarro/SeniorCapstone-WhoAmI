package SeniorCapstone.WhoAmI.model;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GameBundle {
	
	//attributes
	private int ID; 
	private GameBoard theGame; 
	private List<Image> images; 
	
	@NotNull(message= "Username cannot be empty!")
	private String playerName; 
	
	//default constructor 
	public GameBundle() {}

	//non-default constructor to create the game bundle
	public GameBundle(GameBoard theGame, List<Image> images) {
		this.theGame = theGame;
		this.images = images; 
	}
	
	//getters & setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public GameBoard getTheGame() {
		return theGame;
	}

	public void setTheGame(GameBoard theGame) {
		this.theGame = theGame;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	

}
