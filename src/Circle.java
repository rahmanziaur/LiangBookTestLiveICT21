public class Circle {

    private double radius;
    public static int call_count=0;

    public Circle() {
        setCall_count();
    }

    public static void setCall_count() {
        ++call_count;
    }

    public void Circle(){
        System.out.println("Hi! Do not get confused after seeing my name. I am NOT constructor. I am actually a Method");
    }


    // setting private field using Constructor
    public Circle(double radius) {
        this.radius = radius;
        setCall_count();
        //System.out.println("Hi! I am inside Circle(double radius) Constructor! Where are you?");
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

}
