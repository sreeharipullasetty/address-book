package com.book.address;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {

    private String name;

    private String organization;

    private List<PhoneNumber> phoneNumbers;

    private List<Address> addresses;

    public String getName() {
        return name;
    }

    public String getOrganization() {
        return organization;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumber);
    }

    public void addAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(address);
    }

    public void setName(String name) throws Exception {
        if (name == null || name.length() == 0) {
            throw new Exception("name cannot be empty");
        } else if (name.length() > 255) {
            throw new Exception("name length cannot be 255 characters");
        } else {
            for (char ch : name.toCharArray()) {
                int ascii = ch;
                if (!((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 90) || (ascii == 32))) {
                    throw new Exception("invalid name");
                }
            }
        }
        this.name = name;
    }

    public void setOrganization(String organization) throws Exception {
        if (organization.length() > 255) {
            throw new Exception("organization length cannot exceed 255 characters.");
        }
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", organization='" + organization + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName()) && Objects.equals(getOrganization(), contact.getOrganization()) && Objects.equals(getPhoneNumbers(), contact.getPhoneNumbers()) && Objects.equals(getAddresses(), contact.getAddresses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOrganization(), getPhoneNumbers(), getAddresses());
    }
}
