/**
 * 
 */
package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Balaji Gurumurthy
 *
 */
public class WriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String dir = System.getProperty("user.dir");
		String fileName = "testFile.txt";
		File f = new File(dir + File.separator + fileName);
		Scanner sc = new Scanner(System.in);
		BufferedWriter br = null;
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			
			br = new BufferedWriter(new FileWriter(f, true));
			while(sc.hasNextLine()) {
				String in = sc.nextLine();
				br.write(in+"\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null) {
				try {
					br.close();
					System.out.println("Finished!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
