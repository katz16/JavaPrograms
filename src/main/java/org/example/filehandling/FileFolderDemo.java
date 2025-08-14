package org.example.filehandling;

import java.io.File;
import java.io.IOException;
//Uncomment each code block one by one to see the output
public class FileFolderDemo {
    public static void main(String[] args) {
        /*File file= new File("D:\\Programs\\filehandling\\subfolder\\inside"); //this will create a folder in D drive
        boolean present=file.exists();//checks if the file or folder exists
        System.out.println("Folder exists: " + present);
        if(!present)
            //file.mkdir(); //creates the folder if it does not exist
            file.mkdirs();//make directories, creates all the folders in the path if they do not exist*/

        //***** to create a file in "D:\\Programs\\filehandling *****

        /*File file= new File("D:\\Programs\\filehandling\\sample.txt");
        boolean present=file.exists();
        if(!present){
            try {
                boolean created=file.createNewFile();
                System.out.println("File created: " + created);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

        //***** to delete a file" *****
        /*File file = new File("D:\\Programs\\filehandling\\sample.txt");
        System.out.println("File exists: " + file.exists());
        file.delete();
        System.out.println("File deleted: " + !file.exists());*/

        //***** to rename a file" *****
       /* File file= new File("D:\\Programs\\filehandling\\sample.txt");
        boolean present=file.exists();
        if(!present){
            try {
                boolean created=file.createNewFile();
                System.out.println("File created: " + created);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        File f= new File("D:\\Programs\\filehandling\\sample_renamed.txt");
        boolean renamed=file.renameTo(f);
        System.out.println("File renamed: " + renamed);

        System.out.println("File name is "+f.getName());
        System.out.println("File path is "+f.getAbsolutePath());
        System.out.println("File size is "+f.length() + " bytes");
        System.out.println("Is file readable? " + f.canRead());
        System.out.println("Is file writable? " + f.canWrite());
        System.out.println("Is file executable? " + f.canExecute());
        System.out.println("Is file hidden? " + f.isHidden());*/

        //***** to list files in a folder" *****
        /*File file = new File("D:\\Programs");
        String[]listOfFilesAndFolders= file.list();
        for(String i: listOfFilesAndFolders){
            System.out.println(i);
        }*/

        //***** to list files and folder separately" *****
        /*File file = new File("D:\\Programs");
        File[] listOfFiles = file.listFiles();
        for(File fi: listOfFiles){
            if(fi.isFile()){// checks if it is a file
                System.out.println("File: " + fi.getName());
            } else if(fi.isDirectory()){//checks if it is a folder
                System.out.println("Folder: " + fi.getName());
            }
        }*/
        //***** print only .txt file present in the folder" *****
        File file = new File("D:\\Programs");
        File[] listOfFiles = file.listFiles();
        for(File f:listOfFiles){
            String fileName=f.getName();
            /*if(fileName.endsWith(".txt"))
                System.out.println("File: " + f.getName());*/
            //filtering using substring
            int index=fileName.lastIndexOf(".");
            String extension=fileName.substring(index+1);
            if(extension.equals("txt")){
                System.out.println("File: " + f.getName());
            }
        }
    }

}
