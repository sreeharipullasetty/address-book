package com.book.address;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public String getLabel() {
        return label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setLabel(String label) throws Exception {
        if (label.length() == 0) {
            throw new Exception("label cannot be empty");
        } else if (label.length() > 255) {
            throw new Exception("label length cannot be 255 characters");
        } else {
            for (char ch : label.toCharArray()) {
                int ascii = ch;
                if (!((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 90) || (ascii == 32))) {
                    throw new Exception("invalid label");
                }
            }
        }
        this.label = label;
    }

    public void setPhoneNumber(String phoneNumber) throws Exception {
        if (phoneNumber.length() != 10) {
            throw new Exception("phone must contain exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "label='" + label + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
