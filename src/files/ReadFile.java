/**
 * 
 */
package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Balaji Gurumurthy
 *
 */
public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String dir = System.getProperty("user.dir");
		String fileName = "test.txt";
		File f = new File(dir + File.separator + fileName);
		BufferedReader bf = null;
		
		try {
			bf = new BufferedReader(new FileReader(f));
			String line;
			while((line = bf.readLine())!= null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if(bf != null) {
					bf.close();
				}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
