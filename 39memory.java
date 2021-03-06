//Implement a Java program that reads via CLA (size type) example: 1 KB / 1 MB, calculate the memory in bytes.
import java.io.File;
 
class memoryinbytes {
 
      public static void main(String[] args) 
      {
        File file = new File("/Users/moksh/Documents/ESD JAVA PROG.txt");
        if(file.exists())
        {
        System.out.println(filesize_in_Bytes(file));
        System.out.println(filesize_in_kiloBytes(file));
        System.out.println(filesize_in_megaBytes(file));
        }
        else 
        System.out.println("File doesn't exist");
         
    }
 
    private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }
 
    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }
 
    private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";
    }
 }