package gamesAssignmentProgram;
import java.util.ArrayList;
import java.util.Scanner;

public class gameMovieNew {
			
		String movieToGuess,correctLetters,wrongLetters;
		int count;  
		boolean gameWon;

		//gameMovie is the constructor of class gameMovie
		    public gameMovieNew() {
		    	
		        ArrayList<String> movieList = new ArrayList<String>();//new MovieList(pathname);
		        movieList.add("the shawshank redemption");
		        movieList.add("the godfather");
		        movieList.add("the dark knight");
		        movieList.add("schindler's list");
		        movieList.add("pulp fiction");
		        movieList.add("the lord of the rings");
		        movieList.add("the good the bad and the ugly");
		        movieList.add("fight club");
		        movieList.add("the lord of the rings");
		        movieList.add("forrest gump");
		        movieList.add("star wars");
		        movieList.add("inception");
		        movieList.add("the lord of the rings");
		        movieList.add("the matrix");
		        movieList.add("samurai");
		        movieList.add("star wars");
		        movieList.add("city of god");
		        movieList.add("the silence of the lambs");
		        movieList.add("batman begins");
		        movieList.add("die hard");
		        movieList.add("chinatown");
		        movieList.add("room");
		        movieList.add("dunkirk");
		        movieList.add("fargo");
		        movieList.add("no country for old men");
		        movieToGuess = getRandomMovie(movieList).trim();
		      //  System.out.println("movieToGuess = " + movieToGuess);
		        count = 0;
		        correctLetters = "";
		        wrongLetters = "";
		        gameWon = false;
		    }
		     String getRandomMovie(ArrayList<String> movies ) {
		        int movieIndex = (int) (Math.random() * movies.size());
		        return movies.get(movieIndex);
		    }
		    
		    		     
		     String getMovieTitle() {
		        return movieToGuess;
		    }

		  	    
		     String getHiddenMovieTitle() {
		        if(correctLetters.equals(""))
		        {
		            return movieToGuess.replaceAll("[a-zA-Z]", "_");
		        }
		        else{
		        	String pattern = "[a-zA-Z&&[^" + correctLetters +"]]";
		            return movieToGuess.replaceAll(pattern, "_");
		        }
		    }

		    // Method that returns letters guessed that are not in the movie title.
		    
		     String getWrongLetters() {
		        return wrongLetters;
		    }

		   
		     // Method that returns true if the game was won and false otherwise.
		    
		    boolean WonGame() {
		        if(gameWon) {
		        	return true;
		        }
		        else
		        	return false;
		    }

		   
		        boolean gameEnded() {
		        if (count >= 10) {
		            return true;
		        }

		        if(!getHiddenMovieTitle().contains("_")) {
		            gameWon = true;
		            return true;
		        }
		        return false;
		    }

		        String inputLetter(){

		        System.out.println("Guess a letter:");
		        Scanner scanner = new Scanner(System.in);
		        String letter = scanner.nextLine().toLowerCase();

		     	    if(!letter.matches("[a-z]")){
		            System.out.println("That is not a letter.");
		            return inputLetter();
		        }
		        
		        else if(wrongLetters.contains(letter) || correctLetters.contains(letter)){
		            System.out.println("You already guessed that letter.");
		            return inputLetter();
		        }
		        else{
		            return letter;
		        }
		    }

		        void guessLetter() {

		        String guessedLetter = inputLetter();

		        if (movieToGuess.toLowerCase().contains(guessedLetter)) {
		        	correctLetters += guessedLetter + guessedLetter.toUpperCase();
		            		        }
		        else {
		        	  count++;
		        	  wrongLetters += " " + guessedLetter;
		        		
		        }
    }
		        
		        
}
		     
//	public static void main( String[] str ) {
//		int size = 15;
//		for( int i = 0; i< 10 ;i++ ) {
//			System.out.println(  Math.random() * size );
//		}
//	}


	