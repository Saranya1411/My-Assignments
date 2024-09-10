package Week3.Assignments;

public interface DatabaseConnection {

	//Creating abstract methods
	public abstract void connect();
	
	public abstract void disconnect();
	
	public abstract void executeUpdate(String update);
	
		
}
