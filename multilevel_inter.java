interface Person {
    void name();
}

interface Address extends Person {
    void address();
}

interface Contact extends Address {
    void phoneNumber();
}

class Info implements Contact {
    public void name() {
        System.out.println("My name is Mohsin");
    }

    public void address() {
        System.out.println("I am from Dhaka");
    }

    public void phoneNumber() {
        System.out.println("My phone number is 1111");
    }
}

public class multilevel_inter {
    public static void main(String[] args) {
        Info info = new Info();
        info.name();
        info.address();
        info.phoneNumber();
    }
}
