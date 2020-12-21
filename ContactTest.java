package test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContactTest() {
		Contact contact = new Contact("12345", "Tom", "Jones", "6035534521", "17 Main Street");
		assertTrue(contact.getId().equals("12345"));
		assertTrue(contact.getFirstName().equals("Tom"));
		assertTrue(contact.getLastName().equals("Jones"));
		assertTrue(contact.getPhone().equals("6035534521"));
		assertTrue(contact.getAddress().equals("17 Main Street"));
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "Tom", "Jones", "6035534521", "17 Main Street");
		});  
	}
	
	@Test
	void testContactIdTooTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1234567891011", "Tom", "Jones", "6035534521", "17 Main Street");
		});  
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", null, "Jones", "6035534521", "17 Main Street");
		});  
	}
	
	@Test
	void testContactFirstNameTooTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Tommysnametoolong", "Jones", "6035534521", "17 Main Street");
		});  
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Jones", null, "6035534521", "17 Main Street");
		});  
	}
	
	@Test
	void testContactLastNameTooTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Tom", "Jonesnameistoolong", "6035534521", "17 Main Street");
		});  
	}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Jones", "Jones", null, "17 Main Street");
		});  
	}
	
	@Test
	void testContactPhoneTooTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Tom", "Jones", "603553452112345", "17 Main Street");
		});  
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Jones", "Jones", "6035534521", null);
		});  
	}
	
	@Test
	void testContactAddressTooTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("12345", "Tom", "Jones", "6035534521", "17 Main Street is way way way way way way too long!");
		});  
	}
}
