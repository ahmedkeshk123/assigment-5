import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String removeW = "";
        File file1 = new File("C:\\Users\\am282\\OneDrive\\Desktop\\New folder (2)");
        try {
            Scanner input = new Scanner(file1);
            while (input.hasNextLine()){
                removeW=input.next();
                if (input.next("John") != null ){
                    removeW.replaceAll("John","");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("not found");
        }
    }
}