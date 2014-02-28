import javax.swing.JButton;
public class gameState{
	String Winner; 
	public boolean playerOne , playerTwo; 
	public gameState(boolean playerOne, boolean playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public boolean isPlayerOne() {
		return playerOne;
	}
		
	public void setPlayerOne(boolean playerOne) {
		this.playerOne = playerOne;
	}
	
	public boolean isPlayerTwo() {
		return playerTwo;
	}
	
	public void setPlayerTwo(boolean playerTwo) {
		this.playerTwo = playerTwo;
	}
	//all of the possible answers 
	public boolean operation(JButton[] button){
		if(		button[0].getText().equalsIgnoreCase("O") && 
				button[1].getText().equalsIgnoreCase("O")&&
				button[2].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("O") && 
				button[3].getText().equalsIgnoreCase("O") &&
				button[6].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[8].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[1].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[7].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("O") && 
				button[5].getText().equalsIgnoreCase("O") &&
				button[8].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[6].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[3].getText().equalsIgnoreCase("O") && 
				button[4].getText().equalsIgnoreCase("O") &&
				button[5].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(		button[6].getText().equalsIgnoreCase("O") && 
				button[7].getText().equalsIgnoreCase("O") &&
				button[8].getText().equalsIgnoreCase("O")){
					Winner = "(O)";
					return true; 
		}
		if(button[0].getText().equalsIgnoreCase("X") && 
				button[1].getText().equalsIgnoreCase("X") &&
				button[2].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("X") && 
				button[3].getText().equalsIgnoreCase("X") &&
				button[6].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		if(		button[0].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[8].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		if(		button[1].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[7].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("X") && 
				button[5].getText().equalsIgnoreCase("X") &&
				button[8].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		if(		button[2].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[6].getText().equalsIgnoreCase("X")){
				
					Winner = "(X)";
					return true; 
		}
		if(		button[3].getText().equalsIgnoreCase("X") && 
				button[4].getText().equalsIgnoreCase("X") &&
				button[5].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		if(		button[6].getText().equalsIgnoreCase("X") && 
				button[7].getText().equalsIgnoreCase("X") &&
				button[8].getText().equalsIgnoreCase("X")){
					Winner = "(X)";
					return true; 
		}
		return false;
	}
	
}
