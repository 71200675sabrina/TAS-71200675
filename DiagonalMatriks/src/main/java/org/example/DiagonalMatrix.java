package org.example;

/**
 * Hello world!
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\Laptop PCs\\IdeaProjects\\TAS-(71200675)\\DiagonalMatriks\\filematrix.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                String getDataString = scan.nextLine();
                System.out.println(getDataString);
            }

            scan.close();
        } catch (FileNotFoundException ex){
            System.out.println("File Tidak Ditemukan");
        }
    }
}
