package com.book.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public Contact searchByName(String name) throws Exception {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        throw new Exception("No contact found with the given name");
    }

    public Contact searchByOrganization(String organization) throws Exception {
        for (Contact contact : contactList) {
            if (contact.getOrganization().equalsIgnoreCase(organization)) {
                return contact;
            }
        }
        throw new Exception("No contact found with the given organization");
    }

    public void updateContact(String name, Contact contact) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equalsIgnoreCase(name)) {
                contactList.set(i, contact);
                break;
            }
        }
    }

    public void deleteContact(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equalsIgnoreCase(name)) {
                contactList.remove(i);
                break;
            }
        }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                '}';
    }
}
