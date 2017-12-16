import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Day2_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(new File("input.txt"));
	    int sum = 0;
		while (input.hasNextLine())
		{	
			String [] lst = input.nextLine().split("\t");
			int [] file = copy(lst);
			Arrays.sort(file);
			boolean bool = true;
			for (int i = 0 ; i < lst.length && bool;i++ )
			{
				for (int j = i+1 ;j < lst.length;j++)
				{
					if(file[j] % file[i] == 0) 
					{
						int div = file[j]/file[i];
				        sum+=div;
				        bool = false;
				        break;
					}
				}
			}
		}	
		System.out.println(sum);
	}

	private static int[] copy(String[] lst) {
		// TODO Auto-generated method stub
		int [] lst1 = new int [lst.length];
		for (int i = 0;i< lst.length;i++) lst1[i] = Integer.parseInt(lst[i]);
		return lst1;
	}

	private static void print(int[] lst) {
		// TODO Auto-generated method stub
		for (int i = 0;i< lst.length;i++)
			System.out.print(lst[i]+ " ");
		System.out.println("");
	}

}
