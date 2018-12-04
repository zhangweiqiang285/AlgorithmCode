package com.zhangweiqiang;
/*
 * 获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长的串比较。

 */
import org.junit.Test;

public class Test4
{
	@Test
	public void test4()
	{
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";
		String res = FindMaxSubString(str1, str2);
		System.out.println(res);
		System.out.println(str2.substring(2, 7));
	}
	
	public String FindMaxSubString(String str1, String str2)
	{
		String longStr = str1.length() > str2.length() ? str1 : str2;
		String shortStr = str1.length() <= str2.length() ? str1 : str2;
		String maxSub = "";
		String temp = "";
		
		for(int left = 0; left < shortStr.length() - 1; left++)
		{
			for(int right = shortStr.length() - 1; right > left; right--)
			{
				temp = shortStr.substring(left, right+1);
				if(longStr.contains(temp))
				{
					if(temp.length() > maxSub.length())
					{
						maxSub  = temp;
					}
				}
				

			}
		}
		return maxSub;
	}
}
