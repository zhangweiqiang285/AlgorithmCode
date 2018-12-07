/*
## �ж������ַ����Ƿ�Ϊ���δ�

**��Ŀ��**
>���������ַ���str1��str2�����strl��str2�г��ֵ��ַ�����һ����ÿ���ַ����ֵĴ���Ҳһ������ôstr1��str2��Ϊ���δʡ���ʵ�ֺ����ж������ַ����Ƿ�Ϊ���δʡ�
*/
import java.util.Scanner;

class EachOtherString{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ���ַ���");
		String str1 = sc.next();
		System.out.println("������ڶ����ַ���");
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
			if(num[cStr2[i]]-- == 0)    //�����һ�γ��ֵ���ĸ������return
			{
				return false;
			}
		}
		return true;
	}	
}
/*
����ַ������ͺܶ࣬���ù�ϣ����泤��Ϊ256���������飬��������̲��䡣
����ַ�������ΪM��str1��str2�ĳ���ΪN����ô�÷�����ʱ�临�Ӷ�ΪO(N)���ռ临�Ӷ�ΪO(M)
*/
