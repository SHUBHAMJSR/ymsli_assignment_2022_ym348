import java.io.*;

public class question1 {

	private static byte[] readContent(File file)
	{
		byte[] arr = new byte[(int)file.length()];
		try(FileInputStream input = new FileInputStream(file)){
			//convert file into array of bytes
			input.read(arr);
			//Printing in byte format
			for(byte a: arr) {
				System.out.print(a);
			}
			System.out.println();
			//Printing in char format
			for(byte a: arr) {
				System.out.print((char)a);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\ve00ym348\\Desktop\\ASSIGNMENTS_YM348\\Day4\\src\\file.txt");
		readContent(file);
	}
}
