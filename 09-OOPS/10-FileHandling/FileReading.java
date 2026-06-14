import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter File Name : ");
        String fileName = input.nextLine();
        System.out.println();
        try(FileReader reader = new FileReader(fileName))
        {
            int read ;
//            do {
//                read = reader.read();
//                System.out.print((char)read);
//            }
//            while(read!=-1);

            while ((read = reader.read()) != -1)
            {
                System.out.print((char)read);

            }
        }
        catch (FileNotFoundException f)
        {
            System.out.println("Error Occurred : " + f.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Error Occurred : " + e.getMessage());
        }
    }
}
