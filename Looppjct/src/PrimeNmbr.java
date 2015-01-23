
public class PrimeNmbr {

	/**
	 * @param args
	 */
	
	public void prmenumber()
	{
		int limit = 100;
        for(int i=1; i < 100; i++){
               
            boolean isprime = true;
            for(int j=2; j < i ; j++){
                   
                    if(i % j == 0){
                            isprime = false;
                            break;
                    }
            }
            if(isprime)
                    System.out.println(i + " ");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern ptn=new pattern();
		ptn.pattern();
//PrimeNmbr pn=new PrimeNmbr();
//pn.prmenumber();
	}

}
