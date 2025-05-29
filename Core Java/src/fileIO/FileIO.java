package fileIO;
import java.io.*;

public class FileIO {
	private static final String FILE_PATH = "sample.txt";

    public static void main(String[] args) {
        writeToFile("Hello, Ilham! This is a sample text file.\nWelcome to Java File I/O.\nI live in Mumbai");
        readFromFile();
    }

    /**
     * Writes the given content to the file.
     *
     * @param content The string content to write to the file.
     */
    public static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads the content from the file and prints it line by line.
     */
    public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            System.out.println("Reading from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(">> " + line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error while reading the file: " + e.getMessage());
        }
    }
    
}
