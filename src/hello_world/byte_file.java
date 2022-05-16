package hello_world;
import java.io.*;
import java.nio.file.Files;

public class byte_file {
		public static void byte_file(byte[] data, File destination) {
		try(FileOutputStream fos = new FileOutputStream(destination)){
			fos.write(data);
			fos.close();
		}
		catch(Exception e) {
			System.out.println("There is an error");
			}
		}
		public static void main(String[] args) throws IOException {
			String someText = "Sample text for byte array";
			byte[] data = someText.getBytes();
			File destination = new File("sample.txt");
			Files.write(destination.toPath(), data);
			
			System.out.println("Input a file using byte array, store it on local system.");
			System.out.println("Operation Completed !! ");
	}

}
