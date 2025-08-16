package org.example.filehandling;

import java.io.*;

public class InputStreamAndOutPutStream {
    public static void main(String[] args)  {
        InputStream inputStream= null;
        try {
            inputStream = new FileInputStream("D:\\Programs\\filehandling\\originalImage.jpg");
            OutputStream outputStream= new FileOutputStream("D:\\Programs\\filehandling\\copiedImage.jpg");
            int content=inputStream.read();
            while (content != -1) {
                outputStream.write(content);
                content = inputStream.read();
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
