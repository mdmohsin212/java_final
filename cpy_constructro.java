class student{
    String name;
    int roll;
    int cls;
    student(String name, int roll, int cls){
        this.name = name;
        this.roll = roll;
        this.cls = cls;
    }
    student(student c){
        name = c.name;
        roll = c.roll;
        cls = c.cls;
    }
    void display(){
        System.out.println("Name is : " + name);
        System.out.println("Roll is : " + roll);
        System.out.println("Class is : " + cls);
    }
}
public class cpy_constructro {
    public static void main(String[] args) {
        student s1 = new student("Md Mohsin", 664900, 12);
        s1.display();

        student s2 = new student(s1);
        s2.display();
    }
}
