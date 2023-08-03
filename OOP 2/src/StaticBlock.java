public class StaticBlock {
    static int a = 5;
    static int b;

    static {
        System.out.println("I am static block");
        b = a*6;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
    }
}
