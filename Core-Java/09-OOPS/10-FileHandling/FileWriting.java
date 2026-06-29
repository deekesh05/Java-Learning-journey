import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        String fileName = "Java.txt";


        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello Welcome to the file \n");
            for (int i = 1;i<=10;i++)
            {
                writer.write((int)i*2 + "  ");
            }
            System.out.println();
            writer.flush();
            System.out.println("File written success");
        }
        catch(IOException e)
        {
            System.out.println("Error Occurred " + e.getMessage());
        }
    }
}
