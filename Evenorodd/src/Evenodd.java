
public class Evenodd {

public void oddeven(){
	int Number=12;
	
	if(Number%2==0)
	{
		
		System.out.println("It is an even number");
		
	}
	else
	{
		System.out.println("It is an odd number");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("------------oddeven-------------------");
		Evenodd eo=new Evenodd();
		eo.oddeven();
		System.out.println("------------voter-------------------");
		voter vote=new voter();
		vote.Voter();
		System.out.println("------------Leap year-------------------");
		
		Leapyear lpyr=new Leapyear();
		lpyr.leapyear();
		System.out.println("------------vowel-------------------");
		Vowel vw=new Vowel();
		vw.voweel();
		System.out.println("------------vowel-------------------");
		
	}

}
