import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map=readIn();
		for (int i=0;i<4;i++) {
			map=rotate(map);
			if (isValid(map))
				printResult(map);
		}

	}

	private static int[][] rotate(int[][] map) {
		// TODO Auto-generated method stub
		int[][] newMap=new int[map.length][map[0].length];
		
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length;j++) {
				newMap[map.length-j][i] = map[i][j];
			}
		}
		return newMap;
	}

	private static void printResult(int[][] map) {
		// TODO Auto-generated method stub
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static boolean isValid(int[][] map) {
		// TODO Auto-generated method stub
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length-1;j++) {
				if (map[i][j]>map[i][j+1])
					return false;
			}
		}
		
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map.length-1;j++) {
				if (map[j][i]>map[j+1][i])
					return false;
			}
		}
		
		return true;
	}

	private static int[][] readIn() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] map=new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		return map;
	}

}
