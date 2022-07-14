package gamesAssignmentProgram;

//private String wrongLetters;

//private boolean gameWon;

	import java.util.ArrayList;
    public class gameMovie 
	{
    	
   
	//	public String[] movieList;

    
	public gameMovie() {
	    	
	        ArrayList<String> movieList = new ArrayList<String>();
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
	        System.out.println(movieList);
	         //getRandomMovie(movieList);
	       
	        
	        for (int i = 0; i < movieList.size(); i++) 
        	
	        {
	        	getRandomMovie(movieList);
	        }
        
	}
	        
	        public String getRandomMovie(ArrayList<String> movieList)
	        {
	    	int movieIndex = (int) (Math.random() * movieList.size());
	        System.out.println("movieIndex :" + movieIndex + " , Item: " + movieList.get(movieIndex));
	        return movieList.get(movieIndex);      	 
	    	}
	      
	}

	  
  
