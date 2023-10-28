package Java_Barry_Burd.chapter13.files;
import java.io.*;
public class WorkingWithFiles {
    public static void main(String[] args) {

        // Opening input file and stream........................................
        File fileIn = new File("input.txt");
        FileInputStream fileInStream = null;
        try {
            fileInStream = new FileInputStream(fileIn);
        } catch(FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        }
        DataInputStream dataInStream = new DataInputStream(fileInStream);

        // Opening output file and stream.......................................
        File fileOut = new File("output.txt");
        FileOutputStream fileOutStream = null;
        try {
            fileOutStream = new FileOutputStream(fileOut);
        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        }
        DataOutputStream dataOutStream = new DataOutputStream(fileOutStream);

        int numFilesCopied = 0;

        try {
            // Copying data from input to output................................
            while(true) {
                dataOutStream.writeByte(dataInStream.readByte());
            }
        } catch (EOFException e) {
            numFilesCopied = 1;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Displaying the number of files copied................................
        System.out.println("Number of files copied: " + numFilesCopied);
    }
}

/*
DataInputStream class from the java.io package. The DataInputStream class allows
    you to read primitive data types from an input stream, such as integers,
    floats, and characters.

DataOutputStream class allows you to write primitive data types to an output stream.

EOFException class is an exception that is thrown when the end of a file or
    stream is reached unexpectedly.

File class represents a file or directory path in the file system.

FileInputStream class is used to read data from a file.

FileOutputStream class is used to write data to a file.


    */
