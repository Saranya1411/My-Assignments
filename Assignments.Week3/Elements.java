package Week3.Assignments;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElement element = new WebElement();
		
		Button button= new Button();
		textField text = new textField();
		CheckBoxButton checkbox = new CheckBoxButton();
		RadioButton radio = new RadioButton();
		
		//Calling Methods 
		 element.click();
		 element.setText("Saranya");
		 
		  button.click();
		  button.submit();
		  
		  text.click();
		  text.setText("Saranya");
		  text.getText();
		  
		  checkbox.click();
		  checkbox.clickCheckButton();
		  checkbox.submit();
		  
		  radio.click();
		  radio.selectRadioButton();
		  radio.submit();
		  
	}

}
