package org.example.filehandling;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        File file = new File("D:\\Programs\\filehandling\\bufferedReaderAndWriter.txt");

        try {
            BufferedWriter bw= new BufferedWriter(new FileWriter(file,true));
            bw.write("This is a test file for BufferedReader and BufferedWriter.");
            bw.newLine();
            bw.write("This is the second line of the test file.");
            bw.newLine();
            bw.write("This is the third line");
            bw.flush();
            bw.close();

            BufferedReader br= new BufferedReader(new FileReader(file));
            String line=br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
