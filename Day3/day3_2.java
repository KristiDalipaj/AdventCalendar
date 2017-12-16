
public class Day3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10000;
		int num = 325489;
		int [][] lst = new int[a][a];
		int x = a/4, y = a/4;
		final int x0 = x,y0 = y;
		int layer = 0,cnt =1,breakcnt = 0;
		lst[x][y] = cnt;
		while (cnt <= num)
		{
			{
			y++;
			lst[x][y] = val(lst,x,y);
			cnt = lst[x][y];
			layer++;
			System.out.println(cnt);
			if (cnt >= num) {breakcnt++;break;};
			}
			for (int j = 0 ; j < 2*layer-1 && breakcnt == 0;j++)
			{
				x++;
				lst[x][y] = val(lst,x,y);
				cnt = lst[x][y];
				System.out.println(cnt);
				if (cnt >= num) {breakcnt++;break;};
			}
			for (int j = 0 ; j < 2*layer && breakcnt == 0;j++)
			{
				y--;
				lst[x][y] = val(lst,x,y);
				cnt = lst[x][y];
				System.out.println(cnt);
				if (cnt >= num) {breakcnt++;break;};
			}
			for (int j = 0 ; j < 2*layer && breakcnt == 0;j++)
			{
				x--;
				lst[x][y] = val(lst,x,y);
				cnt = lst[x][y];
				System.out.println(cnt);
				if (cnt >= num) {breakcnt++;break;};
			}
			for (int j = 0 ; j < 2*layer && breakcnt == 0;j++)
			{
				y++;
				lst[x][y] = val(lst,x,y);
				cnt = lst[x][y];
				System.out.println(cnt);
				if (cnt >= num) {breakcnt++;break;};
			}
			
			
		}
		System.out.println(cnt);
		}

	private static int val(int[][] lst, int x, int y) {
		
		int sum = 0;
		
		sum += lst[x+1][y-1];
		sum += lst[x][y-1];
		sum += lst[x-1][y-1];
		sum += lst[x+1][y];
		sum += lst[x-1][y];
		sum += lst[x+1][y+1];
		sum += lst[x][y+1];
		sum += lst[x-1][y+1];

		
		
		return sum;
	}
	
}
