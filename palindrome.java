import java.util.*;
class palindrome{

	static char MAX_CHAR = 26;

	
	static void countFreq(String str, int freq[], int len)
	{
		for (int i = 0; i < len; i++)
		{
			freq[str.charAt(i) - 'a']++;
		}
	}

	
	static boolean canMakePalindrome(int freq[], int len)
	{
		
		int count_odd = 0;
		for (int i = 0; i < MAX_CHAR; i++)
		{
			if (freq[i] % 2 != 0)
			{
				count_odd++;
			}
		}

		
		if (len % 2 == 0)
		{
			if (count_odd > 0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}

		
		if (count_odd != 1)
		{
			return false;
		}

		return true;
	}

	
	static String findOddAndRemoveItsFreq(int freq[])
	{
		String odd_str = "";
		for (int i = 0; i < MAX_CHAR; i++)
		{
			if (freq[i] % 2 != 0)
			{
				freq[i]--;
				odd_str = odd_str + (char) (i + 'a');
				return odd_str;
			}
		}
		return odd_str;
	}


	static String findPalindromicString(String str)
	{
		int len = str.length();
		int freq[] = new int[MAX_CHAR];
		countFreq(str, freq, len);

		if (!canMakePalindrome(freq, len))
		{
			return "No Palindromic String";
		}

		
		String odd_str = findOddAndRemoveItsFreq(freq);

		String front_str = "", rear_str = " ";

		
		for (int i = 0; i < MAX_CHAR; i++)
		{
			String temp = "";
			if (freq[i] != 0)
			{
				char ch = (char) (i + 'a');

				
				for (int j = 1; j <= freq[i] / 2; j++)
				{
					temp = temp + ch;
				}

				// creating front string
				front_str = front_str + temp;

				// creating rear string
				rear_str = temp + rear_str;
			}
		}

		return (front_str + odd_str + rear_str);
	}

	// Driver program
	public static void main(String[] args)
	{
		String str = "malayalam";
		System.out.println(findPalindromicString(str));
	}
}

