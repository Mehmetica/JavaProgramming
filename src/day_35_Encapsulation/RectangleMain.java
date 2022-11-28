package day_35_Encapsulation;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8,5);
        System.out.println("rectangle.calcPerimeter() = " + rectangle.calcPerimeter());
        System.out.println("rectangle.calcArea() = " + rectangle.calcArea());
//        rectangle.setLength(-1);//error
        //rectangle.setWidth(0);//error

        rectangle.setWidth(3);
        rectangle.setLength(4);
        System.out.println(rectangle);


    }
}
