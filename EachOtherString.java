/*
## 判断两个字符串是否互为变形词

**题目：**
>给定两个字符串str1和str2，如果strl和str2中出现的字符种类一样且每种字符出现的次数也一样，那么str1与str2互为变形词。请实现函数判断两个字符串是否互为变形词。
*/
import java.util.Scanner;

class EachOtherString{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String str1 = sc.next();
		System.out.println("请输入第二个字符串");
		String str2 = sc.next();
		
		if(isChange(str1,str2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	public static boolean isChange(String str1, String str2)
	{
		if(str1.length() != str2.length() || str1 == null || str2 == null)
		{
			return false;
		}
		
		char[] cStr1 = str1.toCharArray();
		char[] cStr2 = str2.toCharArray();
		
		int[] num = new int[256];
		for(int i = 0; i < cStr1.length; i++)
		{
			num[cStr1[i]]++;
		}
		
		for(int i = 0; i< cStr2.length; i++)
		{
			if(num[cStr2[i]]-- == 0)    //如果第一次出现的字母会立马return
			{
				return false;
			}
		}
		return true;
	}	
}
/*
如果字符串类型很多，可用哈希表代替长度为256的整型数组，但整体过程不变。
如果字符的种类为M，str1和str2的长度为N，那么该方法的时间复杂度为O(N)，空间复杂度为O(M)
*/
