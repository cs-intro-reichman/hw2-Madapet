// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int userNum = Integer.parseInt(args[0]);
		System.out.println("Api according to Java: 3.141592653589793");
		double sum=0;
		double sign=1.0;
		for(int i =1;i<=userNum+1;i+=2)
			{
				sum +=sign/i;
				sign *=-1;
			}
		
		System.out.println("Api, approximated: " +sum*4);
		
	}
}
