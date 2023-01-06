import java.util.Random;


public class RockPaperScissors {
	String Rock = "Rock";
	String Paper = "Paper";
	String Scissors = "Scissors";
	String Chosen;
	String botChosen;
	int WinCounter = 0;
	
	public void chooseR() {
		Chosen = Rock;
	}
	void chooseP() {
		Chosen = Paper;
	}
	void chooseS() {
		Chosen = Scissors;
	}
	
	void randomBot() {
		 Random rand = new Random(); 
	      
	      int upperbound = 3;
	      
	      int bot = rand.nextInt(upperbound); 
	      
	      if(bot == 0) {
	    	  botChosen = Scissors;
	    	  System.out.println("Bot choose scissors");
	      }else if(bot == 1) {
	    	  botChosen = Paper;
	    	  System.out.println("Bot choose paper");
	      }else {
	    	  botChosen = Rock;
	    	  System.out.println("Bot choose rock");
	      }
	}
	
	String Play(String a, String b) {
		if(a==b) {
			System.out.println("Draw");
			return "Draw";
		}else if(a==Rock && b==Scissors) {
			System.out.println("You Win");
			WinCounter++;
			return "You Win";
			}else if(a==Paper && b==Rock) {
			System.out.println("You Win");
			WinCounter++;
			return "You Win";
			}else if(a==Scissors && b== Paper) {
			System.out.println("You Win");
			WinCounter++;
			return "You Win";
		}else {
			System.out.println("You Lose");
			return "You Lose";
		}
		
	}
	
}



