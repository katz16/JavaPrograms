package org.example.filehandling;

import java.io.*;

public class DataReader {
    public static void main(String[] args) {
        File file= new File("src/main/resources/readme.txt");
        if(file.exists()){
            System.out.println("File exist");

        }
        try {
            BufferedReader br= new BufferedReader(new FileReader(file));
            while(br.readLine()!=null){
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
