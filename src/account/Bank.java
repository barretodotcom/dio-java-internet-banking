package account;

import java.util.List;

public class Bank {
	
	public List<Cliente> clientsList;
	
	public void getAllClients() {
		clientsList.forEach((Cliente client) -> System.out.println(client));
	}
}
