package problems;

public class Triangle {

	public static void main(String[] args) {
		int height = 5;
		
		for(int i=0; i<height; i++) {
			System.out.print(String.format("%1$"+(height-i)+"s", ""));
			for(int j=0; j <=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
