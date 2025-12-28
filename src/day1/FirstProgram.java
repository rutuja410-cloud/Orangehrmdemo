package day1;

public class FirstProgram
{
    static void displayMessage() {
        System.out.println("Hello! This is a static method.");
    }
    public static void main(String[]args)
    {
        // Calling the static method
        FirstProgram.displayMessage();
    }
}
