package Week3.Assignments;

public class basePage {
	
	
	public void findElement() {
		System.out.println("Finding Element");
	}
	public void clickElement() {
		System.out.println("Clicking Element");
	}
	
    public void entertext() {
    	System.out.println("Entering Text");
	}
    public void performCommonTasks() {
    	System.out.println("Perform Common Tasks of Base page");
	}

    
    public static void main(String[] args) {
    	basePage function = new basePage(); //Object for Base page
    	loginPage login = new loginPage();  //Object for Login page
    	
    	// Calling methods on BasePage object
    	function.findElement();
    	function.clickElement();
    	function.entertext();
    	function.performCommonTasks();
    	
    	// Calling methods on LoginPage object
    	login.clickElement();
    	login.findElement();
    	login.entertext();
    	login.performCommonTasks();
 
		
	}
}
