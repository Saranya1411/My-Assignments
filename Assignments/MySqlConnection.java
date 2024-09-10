package Week3.Assignments;

public abstract class MySqlConnection implements DatabaseConection{
	//implementing method
	public void executeQuery(String Query) {
	   
		System.out.println("Executing Query " +Query);
	}

}
