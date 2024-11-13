// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int userNum = Integer.parseInt(args[0]);
		double computNum = 3.0;
		double printedNum = 1;
		double pi = Math.PI;
		System.out.println(Math.PI);
		while (userNum >0){
			System.out.println(1/computNum +"  "+ 1/(computNum+2));

			printedNum =printedNum - ((1/computNum) + (1/(computNum+2)));
			userNum --;
			System.out.println(computNum);
			computNum +=4;
		}
		System.out.println(printedNum*4);

	}
}
