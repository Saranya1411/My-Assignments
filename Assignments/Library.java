package Week2.Assignments;

//import Week2.day1.Library;

public class Library {

	public String addbook(String bookTitle) {
		System.out.println("Book Added Successfully");
        return bookTitle;
	}

	public void issueBook () {
		System.out.println("Book Issues Successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Library lib = new Library();
	  lib.addbook("bookTitle");
	  lib.issueBook();
	
	}

}
