class calculator{
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(){
        System.out.println("Nothing to add");
    }
}
public class method_overloading {
    public static void main(String[] args) {
        calculator s = new calculator();
        s.sum(15, 10, 40);
        s.sum(15,40);
        s.sum();
    }
}
