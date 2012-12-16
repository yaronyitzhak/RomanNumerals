
public class RomanNumerals {

	public String toRoman(int number) {
		String toRoman="";
		if(number>3)
		{
			while(number>=5)
			{
				toRoman+="V";
				number-=5;
			}
			if(number== 4)
			{
				toRoman+= "IV";
				number-=4;
			}

		}
		
		if (number <= 3)
		{
			for(int i=0;i<number;i++)
				toRoman+= "I";
		}
		return toRoman;
	}

}
