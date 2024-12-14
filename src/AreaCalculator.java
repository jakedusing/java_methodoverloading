public class AreaCalculator {
    public static void main(String[] args) {
        // testing the area of a circle (radius)
        double circleArea = area(5.0);
        System.out.println("The area of the circle is: " + circleArea);

        double invalidCircleArea = area(-1.0);
        System.out.println("The area of the circle with invalid radius is: " + invalidCircleArea);

        // testing area of a rectangle (x, y)
        double rectangleArea = area(4.0,6.0);
        System.out.println("The area of the rectangle is: " + rectangleArea);

        double invalidRectangleArea = area(4.0, -2.0);
        System.out.println("The area of the rectangle with invalid side is: " + invalidRectangleArea);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * (radius * radius);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
