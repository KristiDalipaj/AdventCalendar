
public class Day3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10000;
		int num = 325489;
		int [][] lst = new int[a][a];
		int x = a/4, y = a/4;
		final int x0 = x,y0 = y;
		int layer = 0,cnt =1;
		while (cnt <= num)
		{
			if (cnt == (2*layer+1)*(2*layer+1))
			{
				lst[x][y] = cnt;
				y++;
				layer++;
				cnt++;
			}
			for (int j = 0 ; j < layer*2-1;j++)
			{
				lst[x][y] = cnt;
				x++;
				cnt++;
			}
			for (int j = 0 ; j < layer * 2;j++)
			{
				lst[x][y] = cnt;
				y--;
				cnt++;
			}
			for (int j = 0 ; j < layer * 2;j++)
			{
				lst[x][y] = cnt;
				x--;
				cnt++;
			}
			for (int j = 0 ; j < layer * 2;j++)
			{
				lst[x][y] = cnt;
				y++;
				cnt++;
			}
		}
		
		
		
		
		int finalX = findx(lst,num);
		int finalY = findy(lst,num);
		System.out.println(Math.abs(finalY - y) + (finalX - x));
	}

	private static int findy(int[][] lst, int num) {
	
		for (int i = 0 ; i < lst.length;i++)
		{
			for (int j = 0 ; j < lst.length;j++)
			{
				if (lst[i][j] == num) return j;
			}
		}
		
		return -1;
	}

	private static int findx(int[][] lst, int num) {
		
		for (int i = 0 ; i < lst.length;i++)
		{
			for (int j = 0 ; j < lst.length;j++)
			{
				if (lst[i][j] == num) return i;
			}
		}
		return -1;
	}

}
