package org.example.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        File file= new File("D:\\Programs\\filehandling\\test.txt");
        if(!file.exists())
            file.createNewFile();
        FileWriter writer= new FileWriter(file,true);
        writer.write(97);//when we write an integer, it is converted to its ascii character
        writer.write("\nHello World!"); // writing a string to the file... \n is used for a new line
        writer.flush();
        writer.close();
        FileReader fr= new FileReader(file);
        //int output= fr.read();//returns integer as long as it reads a character. if all the characters are read
        //it will print -1
        /*while(output!=-1){
            System.out.print((char)output);
            output= fr.read(); // reading the next character
        }*/
        char[]ch= new char[(int)file.length()]; // creating a character array to read multiple characters
        fr.read(ch);
        for(char c: ch) {
            ; // exit loop if end of file is reached
            System.out.print(c);
        }

    }
}
