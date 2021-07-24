package com.book.address;

public class AddressBookDemo {
    public static void main(String[] args) throws Exception {

        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setLabel("home");
        phoneNumber1.setPhoneNumber("9123567812");

        Address address1 = new Address();
        address1.setLabel("home");
        address1.setAddress("bangalore");

        Contact contact1 = new Contact();
        contact1.setName("home");
        contact1.setOrganization("org1");

        contact1.addPhoneNumber(phoneNumber1);
        contact1.addAddress(address1);

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact1);

        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setLabel("office");
        phoneNumber2.setPhoneNumber("9000000000");

        Address address2 = new Address();
        address2.setLabel("office");
        address2.setAddress("hyderabad");

        Contact contact2 = new Contact();
        contact2.setName("office contact");
        contact2.setOrganization("org2");

        contact2.addPhoneNumber(phoneNumber2);
        contact2.addAddress(address2);

        addressBook.addContact(contact2);

        System.out.println(addressBook.getContactList());

        System.out.println(addressBook.searchByName("home"));
        System.out.println(addressBook.searchByOrganization("org2"));

        addressBook.updateContact("office contact", contact1);

        System.out.println(addressBook.getContactList());

        addressBook.deleteContact("home");

        System.out.println(addressBook.getContactList());
    }
}
