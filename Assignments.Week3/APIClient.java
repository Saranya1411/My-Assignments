package Week3.Assignments;

public class APIClient {
	
	public void sendRequest ( String endpoint ) {
		
		System.out.println("Endpoint is " + endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus ) {
		System.out.println("API Request is " + endpoint +" " + requestBody + " " + requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api = new APIClient();
		api.sendRequest("www.google.com");
		api.sendRequest("www.google.com", "Saranya", true);
           
	}

}
