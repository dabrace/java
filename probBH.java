import java.util.*;
import pathfinding.Grid2d;

public class probBH
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int height, width;
		int i, j;

		rows = scan.nextInt();
		cols = scan.nextInt();
		planet = new char[rows][cols];

		mapWorld = new WorldSquare[rows][cols];
		Vector pathToFollow = new Vector();

		for (height = 0; height < rows; height++) { // Height
			String s = scan.next();
			for (width = 0; width < cols; width++) {
				planet[height][width] = s.charAt(width);

					mapWorld[height][width] = new WorldSquare();
					mapWorld[height][width].terrainType = s.charAt(width);
					mapWorld[height][width].myX = width;
					mapWorld[height][width].myY = height;
					mapWorld[height][width].myMapX = width;
					mapWorld[height][width].myMapY = height;
					mapWorld[height][width].parentX = 0;
					mapWorld[height][width].parentY = 0;
					mapWorld[height][width].islandHeight = 1;
					//System.out.print("myX = " + height + " myY = " + width);
				}
				//System.out.println();
			}

			numTrips = scan.nextInt();

			trips = new int[numTrips][4];

			for (i = 0; i < numTrips; i++)
				for (j = 0; j < 4; j++)
					trips[i][j] = scan.nextInt();

			print_hog_input();
			print_islands();


			for (i = 0; i < numTrips; i++) {
				Path p = new Path();
				p.startX = trips[i][0];
				p.startY = trips[i][1];
				p.endX = trips[i][2];
				p.endY = trips[i][3];
				p.startJavaX = p.startX;
				p.startJavaY = p.startY;
				p.endJavaY = p.endY;
				p.endJavaX = p.endX;
				pathToFollow.add(p);
		}
		System.out.println("Height = " + rows + " Width = " + cols);
		//PrintAllTerrain(mapWorld, rows, cols);
		FindShortestPath(mapWorld, rows, cols, pathToFollow);
	}
                double[][] map = { { 0, 1, 2 }, { 3, 3, 2 }, { 0, -1, 0 } };
                Grid2d map2d = new Grid2d(map, false);
                System.out.println(map2d.findPath(0, 0, 2, 2));
	}
}
