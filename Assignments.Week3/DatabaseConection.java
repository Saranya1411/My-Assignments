package Week3.Assignments;

public interface DatabaseConection {
 //Creating abstract methods
 public abstract void connect();
 public abstract void disconnect();
 public abstract void executeUpdate( String subject);
	
}
