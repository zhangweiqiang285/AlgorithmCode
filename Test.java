import java.util.Scanner;

class DuiShu
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String numStr = String.valueOf(num);
		
		char[] numArray = new char[numStr.length()];

		char[] numArray2 = new char[numStr.length()];
		
		for(int i = 0; i< numArray.length; i++)
		{
			numArray[i] = numStr.charAt(i);
			numArray2[i] = numArray[i];
		}

		for(int i = 0; i< numArray.length/2; i++)
		{
			char temp = numArray[i];
			numArray[i] = numArray[numArray.length - 1 - i];
			numArray[numArray.length - 1 - i] = temp;
		}

		for(int i = 0; i< numArray.length; i++)
		{
			if(numArray[i] != numArray2[i])
			{
				System.out.println("²»ÊÇ");
			}
			else
			{
				System.out.println("ÊÇ");
			}
				
		}
	}
}