package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test5
{
	public static void main(String[] args)
	{
		String str = "中中国55kkfff";
		
		List list = new ArrayList();
		int[] count = new int[str.length()];
		char[] charArr = str.toCharArray();
		for(int i = 0; i< charArr.length; i++)
		{
			if(!list.contains(charArr[i]))
			{
				list.add(charArr[i]);
				count[list.size() - 1]++;
			}
			else
			{
				int tmp = list.indexOf(charArr[i]);
				count[tmp]++;
			}
		}
		
		Iterator iterator = list.iterator();
		int num = 0;
		while(iterator.hasNext())
		{
			
			Object next = iterator.next();
			System.out.println(next + ":" + count[num]);
			num++;
		}
	}
	
}