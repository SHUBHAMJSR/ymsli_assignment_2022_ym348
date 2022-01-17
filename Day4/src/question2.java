import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class question2 {

	private static void writeData(File file) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			Scanner in = new Scanner(System.in)){
			String writeToFile = "";
			System.out.println("Enter text to write to file");
			writeToFile = in.nextLine();
			writer.write(writeToFile);
			System.out.println("\nFile written Succesfully\n");
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Cannot write to File");
		}
	}
	
	private static String readData(File file) {
		String line = null;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("File Reading Complete");
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Cannot read from File");
		}
		return line;
	}
	public static void main(String[] args) {
		File file = new File("char.txt");
		writeData(file);
		readData(file);
	}
}
