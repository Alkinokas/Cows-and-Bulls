import java.util.Scanner;

// Define the base class Shape
class Shape {

    protected String name;
    // TODO: Add a constructor that takes the shape's name as a parameter
    public Shape (String name){
        this.name = name;
    }

    // TODO: Add a getter method to retrieve the shape's name
    public String getName () {
        return name;
    }
}

// Define the derived class Rectangle
class Rectangle extends Shape {

    protected int width;
    protected int height;

    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
    // TODO: Call the base class constructor using the super keyword
    // TODO: Add getter methods to retrieve the rectangle's width and height

    public Rectangle (String name, int width, int height){
        super(name);
        this.width = width;
        this.height = height;
    }

    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the shape's name, width, and height from the user input

        String userInput1 = scanner.nextLine();
        int userInput2 = scanner.nextInt();
        scanner.nextLine();
        int userInput3 = scanner.nextInt();

        // TODO: Create a Rectangle object using the user input

        Rectangle rectangle = new Rectangle(userInput1, userInput2, userInput3);

        // TODO: Print out the rectangle's name, width, and height

        System.out.println("Name: " + rectangle.getName());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
    }
}