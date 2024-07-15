import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IO_operations {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
// Write data to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Hello, World!\n");
            writer.write("This is a Java I/O example.\n");
            writer.write("Using BufferedReader and BufferedWriter.\n");
            writer.write("Reading from input.txt and writing to output.txt.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
// Read data from the file and display it
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        System.out.println("Data has been read from " + inputFile + " and written to " + outputFile);
    }
}
