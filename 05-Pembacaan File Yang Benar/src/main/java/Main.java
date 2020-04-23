import com.sun.tools.jdeprscan.scan.Scan;
import sun.awt.InputMethodSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
    File file = new File("src/main/resources/dokumen.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        printFile(fileInputStream);
    }
    private static void printFile(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
