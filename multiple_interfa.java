interface Person {
    void name();
}

interface Address {
    void address();
}

interface Contact {
    void phoneNumber();
}

class Info implements Person {
    public void name() {
        System.out.println("My name is Mohsin");
    }
}

class AddressImpl implements Address {
    public void address() {
        System.out.println("I am from Dhaka");
    }
}

class ContactImpl implements Contact {
    public void phoneNumber() {
        System.out.println("My phone number is 1111");
    }
}

public class multiple_interfa {
    public static void main(String[] args) {
        Info info = new Info();
        info.name();

        AddressImpl address = new AddressImpl();
        address.address();

        ContactImpl contact = new ContactImpl();
        contact.phoneNumber();
    }
}
