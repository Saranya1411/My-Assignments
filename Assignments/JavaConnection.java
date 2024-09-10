package Week3.Assignments;

    //implementing DatabaseConnection in JavaConnection
public class JavaConnection implements DatabaseConnection { 
	//Implementing methods of DatabaseConnection interface
     @Override
    public  void connect() {
    	System.out.println("connecting database");
    }
     @Override
	public  void disconnect() {
		System.out.println("disconnecting database");
	}
     @Override
	public void executeUpdate(String update) {
		System.out.println("Update Name as " +update );
	}
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling methods on the JavaConnection object
		JavaConnection connect = new JavaConnection();
		connect.connect();
		connect.disconnect();
		connect.executeUpdate("Saranya");
		
	}

}
