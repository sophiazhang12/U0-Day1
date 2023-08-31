import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {

    public static void writeToFile (String file) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter(file);
        writer.println("Hello");
        writer.println("World");
        writer.close();
    }

    public static String fileToString (String file) throws IOException
    {
            BufferedReader reader = new BufferedReader(new FileReader (file));
            StringBuilder sB = new StringBuilder ("");

            while (reader.ready())
            {
                sB.append ((char)reader.read());
            }
            reader.close();

            return sB.toString();
    }

    public static int countCharacters(String fileName) throws IOException{
        String fileToString = fileToString(fileName);
        return fileToString.length();
    }

    public static void main (String [] args) throws IOException
    {
        writeToFile ("FileToWrite.txt");
        System.out.println("\n\n\n");
        System.out.println(fileToString("ReadFromThis.txt"));
        System.out.println(countCharacters("ReadFromThis.txt"));
    }
    
}