package Demo;
import java.io.*;
import java.util.Scanner;

public class Decode {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        //Prompt user to enter the input file for the encrypted file
        //also for the output for the unencrypted version of it
        System.out.print("Enter the encrypted file name: ");
		String inFile = input.next();
		System.out.print("Enter the file name for the decrypted file: ");
		String outFile = input.next();

        try( //Create two random file
        RandomAccessFile source = new RandomAccessFile(inFile, "Source");
        RandomAccessFile target = new RandomAccessFile(outFile, "Target")
        ){
            //Add 5 to every byte read from Source then write to to Target
            int r = 0;
            source.seek(0); // move the file pointer to the start
            while ((r = source.read()) != -1) {
                target.write(((byte)r) - 5);
            }
        }
    }
    }