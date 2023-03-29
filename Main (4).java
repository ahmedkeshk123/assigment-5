import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args)
    {
        try (
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("Heba.txt"), true));
        ) {
            for (int i = 0; i < 100; i++) {
                pw.print((int)(Math.random() * 100) + " ");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Can not create the file");

        }
    }
}