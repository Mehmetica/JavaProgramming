package day_34_Garbage_Collection;

public class Constructor_vs_StaticBlock {
    static {
        System.out.println("Static Block");



    }


    public Constructor_vs_StaticBlock() {
        System.out.println("Constructor");

    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new Constructor_vs_StaticBlock();//we invoked the constr method for 5 times.
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }


}
