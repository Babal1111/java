package ExceptionHandeling;

import java.io.*;

public class FileNotFound{
 public static void main(String args[]){
                File fs = new File("abcsc.txt");

    try{
            FileReader fd = new FileReader(fs);
    }
    catch(IOException e){
        System.out.println("An I/O error occurred.");
    }
    finally{
       
    }
 }   
}