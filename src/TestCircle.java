public class TestCircle {
    public static void main(String[] args) {

        Circle circle;//reference
        circle = new Circle(12.5);//Creating object
        System.out.println("Constuctor(double rad) call count:"+Circle.call_count);
        System.out.println("Area using Radius 1:"+circle.getArea());

        circle = new Circle(23.5);
        System.out.println("Constuctor(double rad) call count:"+Circle.call_count);
        System.out.println("Area using Radius 2:"+circle.getArea());

        circle = new Circle(50.24);
        System.out.println("Constuctor(double rad) call count :"+Circle.call_count);
        System.out.println("Area using Radius 2:"+circle.getArea());

        // default constructor , no parameters
        // object name circle, Type Class Circle
        // cirle object contains all states and behaviour

        circle = new Circle();
        circle.Circle(); //Circle() is actually method
        System.out.println("Constuctor() call count:"+Circle.call_count);


    }
}
