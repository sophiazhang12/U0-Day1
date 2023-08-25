import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {

    public static void main (String [] args) throws IOException
    {
        writeToFile ();
        System.out.println ("\n\n\n");
        System.out.println (fileToString());
    }
    
    public static void writeToFile () throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter("FileToWriteTo.txt");
        writer.println("Hello");
        writer.println("World");
        writer.close();
    }

    public static String fileToString () throws IOException
    {
            BufferedReader reader = new BufferedReader(new FileReader ("ReadFromThis.txt"));
            StringBuilder sB = new StringBuilder ("");

            while (reader.ready())
            {
                sB.append ((char)reader.read());
            }
            reader.close();

            return sB.toString();
    }
}