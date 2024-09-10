package Week3.Assignments;

public class JavaConnecttion extends MySqlConnection {
	
	//Implementing methods 

	@Override
	public void connect() {
		System.out.println("Connecting with Database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting with Database");
	}

	@Override
	public void executeUpdate( String subject) {
		System.out.println("Updaing subject "+ subject );
	}

	
    public static void main(String[] args) {
	// TODO Auto-generated method stub
    	
    	//Creating object and calling methods
    	JavaConnecttion connect = new JavaConnecttion();
    	connect.connect();
    	connect.executeQuery(" Create table subject; ");
    	connect.executeUpdate("English");
    	connect.disconnect();
    	

       }
    }
