import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {

    public static void main (String [] args) throws FileNotFoundException
    {
        writeToFile ();
    }
    
    public static void writeToFile () throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter("FileToWriteTo.txt");
        writer.println("Hello");
        writer.println("World");
        writer.close();
    }
}