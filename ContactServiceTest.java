package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.ContactService;

class ContactServiceTest {
	@Test
	void testContactService() {
		ContactService contactService = new ContactService();
		assertTrue(contactService.createContact("123456789", "Glenn", "Bacon", "5555555555", "15 Main Street"));
		assertTrue(contactService.updateContact("123456789", "Glenn", "Bacon", "6035555555", "20 Main Street"));
		assertTrue(contactService.deleteContact("123456789"));
	}
}
