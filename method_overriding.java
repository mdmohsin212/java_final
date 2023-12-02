class student {
    String name;
    int age;

    void dispaly() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class teacher extends student {
    int id;

    @Override
    void dispaly() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("id : " + id);
    }
}

public class method_overriding {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.name = "siam";
        t.id = 132;
        t.age = 23;
        t.dispaly();
    }
}
