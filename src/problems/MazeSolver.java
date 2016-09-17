/**
 * 
 */
package problems;

/**
 * @author Balaji Gurumurthy
 *
 */
public class MazeSolver {

	/**
	 * @param args
	 */
	
	private static int[][] maze;
	public static void main(String[] args) {

		maze = new int[3][4];
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				maze[i][j] = 0;
		maze[0][3] = 2;
		maze[2][0] = 1;
		maze[1][1] = -1;
		maze[1][2] = -1;
		maze[1][3] = -1;
		maze[0][2] = -1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++)
				System.out.print(maze[i][j] + " ");
			System.out.println();
		}
			
		boolean reachable = solveMaze(2, 0);
		System.out.println(reachable);

	}
	
	
	public static boolean solveMaze(int x, int y) {
		if(!checkBounds(x, y))
			return false;
		if(maze[x][y] == -1)
			return false;
		if(maze[x][y] == 2)
			return true;
		maze[x][y] = 1;
		if(checkBounds(x+1, y) && maze[x+1][y] !=1)
			if(solveMaze(x+1, y))
				return true;
		if(checkBounds(x-1, y) && maze[x-1][y] !=1)
			if(solveMaze(x-1, y))
				return true;
		if(checkBounds(x, y-1) && maze[x][y-1] !=1)
			if(solveMaze(x, y-1))
				return true;
		if(checkBounds(x, y+1) && maze[x][y+1] !=1)
			if(solveMaze(x, y+1))
				return true;
		return false;
	}
	
	public static boolean checkBounds(int x, int y) {
		if(x<0 || y <0)
			return false;
		if(x >=maze.length || y >= maze[0].length)
			return false;
		else
			return true;
	}

}
