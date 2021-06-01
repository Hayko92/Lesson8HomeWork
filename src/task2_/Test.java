package task2_;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes   = new Shape[10];
        shapes[0] = new Rectangle(2,3,"Red",true);
        shapes[1] = new Rectangle(3,4,"Yellow",true);
        shapes[2] = new Rectangle(82,5,"Blue",false);
        shapes[3] = new Circle(2,"red",true);
        shapes[4] = new Circle(4,"black",true);
        shapes[5] = new Circle(5,"white",true);
        shapes[6] = new Square(6,"white", false);
        shapes[7] = new Square(5,"black", false);
        shapes[8] = new Square(3,"orange", true);
        shapes[9] = new Square(1,"white", false);

        for(Shape shape: shapes) {
            System.out.println("Area of shape is "+shape.getArea());
            System.out.println("Perimeter of shape is "+shape.getArea());
            System.out.println("Type of shape is "+ shape.getType());
            System.out.println("=================================================");

        }
    }
}
