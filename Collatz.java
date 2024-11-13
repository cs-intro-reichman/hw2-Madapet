// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int numOfSequences = Integer.parseInt(args[0]);
		String v_or_c = args[1];
		if(v_or_c.equals("v")){
			int counter1 =1;
			while (counter1 <= numOfSequences){
				int i =counter1;
				int counter2 = 1;
				while (i != 1 || counter2 == 1){
					System.out.print(i+" ");
					if (i%2 == 0){i /= 2;}else{i = i*3+1;}
					counter2 ++;
					
		
				}
				System.out.print(i);
				System.out.println(" ("+(counter2)+")");
				counter1++;
			}
		}
		else{
		System.out.println("Every one of the first "+numOfSequences+" hailstone sequences reached 1.");}
	}
}
