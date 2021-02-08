//Almicke Navarro 
//CST-323
//January 10, 2020 
//I used the source code from the following website: https://github.com/MickeyNavarro/KaraokeMachine 
package SeniorCapstone.WhoAmI.model;

public class User {
	
	//attributes
	private int ID; 
	private String PlayerType; 
	private String PlayerName; 
	private int RoomID; 
	
	//default constructor 
	public User() {}

	//non-default constructor
	public User(int iD, String playerType, String playerName, int roomID) {
		super();
		ID = iD;
		PlayerType = playerType;
		PlayerName = playerName;
		RoomID = roomID;
	}
	
	//getters and setters 
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPlayerType() {
		return PlayerType;
	}

	public void setPlayerType(String playerType) {
		PlayerType = playerType;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	
}
