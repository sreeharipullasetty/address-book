package com.book.address;

public class Address {
    private String label;

    private String address;

    public String getLabel() {
        return label;
    }

    public String getAddress() {
        return address;
    }

    public void setLabel(String label) throws Exception {
        if (label == null || label.length() == 0) {
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

    public void setAddress(String address) throws Exception {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "label='" + label + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
