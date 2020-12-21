package contact;

import java.util.HashMap;

public class ContactService {
static HashMap<String, Contact> contactStore;
	
	public ContactService() {
		// HashMap to store contacts
		contactStore = new HashMap<String, Contact>();
	}
	/*
	 *  Create new contact if id is unique, returns contact object
	 */
	public Boolean createContact(String id, String firstName, String lastName, String phone, String address) {	
			if(contactStore.containsKey(id)) {
				throw new IllegalArgumentException("Invalid input");
			}
			else
			{
				//System.out.println("Id doesn't exist.");
				contactStore.put(id, new Contact(id, firstName, lastName, phone, address));
				return true;
			}
		}	
	
	// 
	public Boolean deleteContact(String id) {
		if(contactStore.containsKey(id)) {
			contactStore.remove(id);
			//System.out.println("Contact deleted.");
			return true;
		}
		else
		{
			//System.out.println("Id doesn't exist.");
			throw new IllegalArgumentException("Invalid input");
		}
		
	}

	// If contact id matches update name, description, and return contact object
	public Boolean updateContact(String id, String firstName, String lastName, String phone, String address) {
		if(contactStore.containsKey(id)) {
			// Delete contact and create new contact with same id but with updated name and description
			deleteContact(id);
			contactStore.put(id, new Contact(id, firstName, lastName, phone, address));
			//System.out.println("Contact updated.");
			return true;
		} else {
			//System.out.println("Id doesn't exist.");
			throw new IllegalArgumentException("Invalid input");
		}
	}
}
