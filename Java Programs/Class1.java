
public class Class1 {
    // This is a concept nested classes
    public static class C1 {
        public void Hello() {
            System.out.print("Hello World");
        }
    }

    public static void main(String[] args) {
        C1 ca1 = new C1();
        ca1.Hello();
    }
}
