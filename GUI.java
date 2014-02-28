import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener{
	private JPanel boardPanel;
	private JButton button[] = new JButton[9];
	private JLabel tvResult; 
	private gameState game; 
	private JButton Reset; 
	private  int gameCount=0;
	public GUI(){
		intiObject();
		addToPanel();
		displayGUI();
		this.add(boardPanel, BorderLayout.CENTER);
		this.add(tvResult, BorderLayout.SOUTH);
		this.add(Reset, BorderLayout.NORTH);
	}
	private void displayGUI() {                          //Takes care of the GUI/frame component 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Tic-Tac-Toe");
	}
	private void intiObject(){					      //Initialize  all of the main object of the game
		game = new gameState(true, false);            //Object of gameState it initialize the player current state at the game 
		boardPanel = new JPanel(); 
		boardPanel.setLayout(new GridLayout(3,3));
		tvResult = new JLabel();
		for (int i = 0; i < 9; i++) {                   //Add an array of Button 
			button[i] = new JButton(""); 
			button[i].addActionListener(this);
			button[i].setFocusPainted(false);
		}
		Reset = new JButton("Reset the Game"); 
		Reset.addActionListener(this);
		Reset.setFocusPainted(false);
	}
	//Add all of the button to the GUI 
	private void addToPanel(){
		for (int i = 0; i < button.length; i++) {
			boardPanel.add(button[i]);
		}
	}
	public void actionPerformed(ActionEvent e){
		for (int i = 0; i < button.length; i++) {                 //Checks for the clicked button
			if(button[i]==e.getSource()){
				if(game.isPlayerOne()){
					button[i].setText("X");
					game.setPlayerOne(false);
					game.setPlayerTwo(true);
				}else{
					button[i].setText("O");
					game.setPlayerOne(true);
					game.setPlayerTwo(false);
				}
				gameCount++;                                      //Counts how many clicks/games has been played 
				button[i].setEnabled(false);                      //disable the clicked Button> to prevent future clicks
			}
		}

		Boolean winner = game.operation(button);                  //Start looking if anyone has win the game yet 
		if(winner){
			tvResult.setText("Congratulation "+game.Winner+" Won this game");
			for (int i = 0; i < button.length; i++) {
				button[i].setEnabled(false);
			}
		}else if(gameCount==9){
			tvResult.setText("It's a Draw!... Try again");
		}
		if(e.getSource() == Reset){
			resetTheGame();
		}
	}
	public void resetTheGame(){
		for (int i = 0; i < button.length; i++) {
			button[i].setText("");
			button[i].setEnabled(true);
			button[i].setBackground(null);
		}
		tvResult.setText("");
		gameCount=0; 
	}
	public static void main(String[] args) {
		new GUI();
	}
}