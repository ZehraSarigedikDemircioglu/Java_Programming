package day10_scannerContinueAndStringIntro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_ScannerContinueAndStringIntro/Test.txt"));

        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());


        System.out.println(scan.hasNext()); //textte devami var mi diye gosterir, true or false olarak

        scan.close();


    }


}
