package gamesAssignmentProgram;

public class MainNew 
{

	public static void main(String[] args) {
		
		        gameMovieNew gameMovie = new gameMovieNew();
		        while(!gameMovie.gameEnded()){
		            System.out.print("You are guessing:" + gameMovie.getHiddenMovieTitle());
		            System.out.println("You have guessed (" + gameMovie.getWrongLetters().length()/2 + ") wrong letters:"
		                    + gameMovie.getWrongLetters());
		            gameMovie.guessLetter();
		        }
		     
		        if(gameMovie.WonGame()){
		            System.out.println("You win!");
		            System.out.println("You have guessed " + gameMovie.getMovieTitle() + " correctly.");
		        }
		        else{
		            System.out.println("You have guessed (" + gameMovie.getWrongLetters().length()/2 + ") wrong letters:" +
		                    gameMovie.getWrongLetters());
		            System.out.println("You lost!");
		            System.out.println("The movie title was " + gameMovie.getMovieTitle());
		            System.out.println("Better luck next time.");
		        }
		    }
	
}
