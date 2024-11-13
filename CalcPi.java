// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int userNum = Integer.parseInt(args[0]);
		double computNum = 3.0;
		double printedNum = 1;
		double pi = Math.PI;
		System.out.println(Math.PI);
		double sum=0;
		double sign=1.0;
		for(int i =1;i<=userNum;i+=2)
			{
				sum +=sign/i;
				sign *=-1;
			}
		
		System.out.println(sum*4);

	}
}
