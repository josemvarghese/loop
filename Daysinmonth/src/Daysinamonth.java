
public class Daysinamonth {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		
		String mnth ="feb"; 
		switch(mnth){
			case  "jan" : System.out.println("31 days");
			break;
			case  "feb" : System.out.println("28 days");
			break;
			case  "mar" : System.out.println("31 days");
			break;
			case  "apr" : System.out.println("30 days");
			break;
			case  "may" : System.out.println("31 days");
			break;
			case  "jun" : System.out.println("30 days");
			break;
			case  "july" : System.out.println("31 days");
			break;
			case  "Aug" : System.out.println("31 days");
			break;
			case  "sep" : System.out.println("30 days");
			break;
			case  "oct" : System.out.println("31 days");
			break;
			case  "nov" : System.out.println("30 days");
			break;
			case  "dec" : System.out.println("31 days");
			break;
			default: System.out.println("this is not a month");		break;
		}
	}

}
