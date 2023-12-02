// interface person{
//     void name();
// }
// class info implements person{
//     public void name(){
//         System.out.println("My name is Mohsin");
//     }
// }
// public class interfac {
//     public static void main(String[] args) {
//         info d1 = new info();
//         d1.name();

//     }
// }

interface person {
    void name();

    interface Address {
        void Address();
    }
}

class info implements person {
    public void name() {
        System.out.println("My name is Mohsin");
    }
}

class address implements person.Address{
    public void Address(){
        System.out.println("I am from Dhaka");
    }
}

public class interfac {
    public static void main(String[] args) {
        info d1 = new info();
        d1.name();

        address a1 = new address();
        a1.Address();

    }
}
