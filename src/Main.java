import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

/**
 * Demonstration of input and output from console and simple UI
 * */
    public static void main(String[] args) {

        System.out.println("Hello, world!");

        // reading from console, using BufferedReader
        try {
            System.out.println("What is your name?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // reading from console, using Scanner
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Next year, you will be " + (age + 1));

        // UI example using JOptionPane
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, name, "Name dialog", JOptionPane.INFORMATION_MESSAGE);

    }
}
