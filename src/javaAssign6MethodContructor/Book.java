package javaAssign6MethodContructor;

public class Book {

	String author;
	String title;
	int  pagecount;
	
//	●	Constructor public Book (String author, String name, int pages)
//	●	Method String getAuthor() that returns the book's author's name.
//	●	Method String getName() that returns the name of the book.
//	●	Method int getPages() that returns the number of pages in the book.
	
//	Book(String cauthor, String cname, int cpages)
//	{
//     author = cauthor;
//     title = cname;
//     pagecount = cpages;
//	}
	
	public Book(String cauthor, String ctitle, int cpages) {
		author = cauthor;
	    title = ctitle;
	    pagecount = cpages; 
	}

	void displayBookDetails()
	{
		System.out.println("The name of the author is : " + author);
		System.out.println("The name of the book is : " + title);
		System.out.println("The number of the pages is : " + pagecount);
	}
	
	String getAuthor()
	{
		return author ; // name of the author
	}
	
	
	String getName()
	{
	  return title;  //name of book;
		
	}
	
	int getPages()
	
	{
		return pagecount;  //Total Nos. of pages in the Book
					
	}
}



//String getAuthor(String cauthor)
//{
//	author = cauthor;
//	return author ; // name of the author
//	
//}
