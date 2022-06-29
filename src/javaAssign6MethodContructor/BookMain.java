package javaAssign6MethodContructor;

public class BookMain {

	public static void main(String[] args) 
	
	{
		
		//Book obj4 = new Book ("Kalam","Wings of Fire",180);
		//obj4.displayBookDetails();
		//obj4.author();
		
		Book bk = new Book("JAVA Programming", "Balagurusamy", 120);
	    System.out.println("Author " + bk.getAuthor());
	    System.out.println("Names " + bk.getName());
	    System.out.println("Pages " + bk.getPages());
	}

}
