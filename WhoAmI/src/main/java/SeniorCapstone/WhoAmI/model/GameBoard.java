package SeniorCapstone.WhoAmI.model;

public class GameBoard {
	
	//attributes
	private Cell[][] cells; 
	private int size; 
	
	//default constructor 
	public GameBoard() {} 
	
	//non-default contrustor 
	public GameBoard(int size) {
		
		//set the row & column sizes
		this.size = size; 
		
		//set the cells of this gameboard to the size chosen by the user 
		this.cells = new Cell[size][size]; 
		
		//loop to add each cell to the array based on the given size
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                this.cells[i][j] = new Cell(i, j);
            }
        }
	}
	
	//setters & getters 
	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	//method to visit a single cell by "flipping the card down"
    public Boolean FlipCell(int x, int y)
    {
    	if (cells[x][y].getIsVisted() == false) {
    		cells[x][y].setIsVisted(true);
    		return true; 
    	}
    	return false; 
    }
    
    //method to check if a given cell is valid in the game board
    public Boolean ValidCell(int i, int j)
    {
        if (i >= 0 && i < size && j >= 0 && j < size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //method to choose a random photo
	

    

}
