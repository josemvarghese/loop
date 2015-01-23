
public class Leapyear {
	
	public void leapyear()
	{
		int year=2000;
		
		if(year%100==0){
			if(year%400==0){
				System.out.println("It is a leap year");
			}
			else{
				System.out.println("It is not  a leap year");
			}
		}
		else if(year%4==0)
		{
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
		}
	}

}
