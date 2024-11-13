public class TimeCalc {
    public static void main(String[] args) {
        
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours*60) + minutes + minutesToAdd;
     //   System.out.println(totalMinutes);
        int total_hours = (totalMinutes/60);
        int new_hours = total_hours%24;
        int newMinutes = totalMinutes - total_hours*60;
        if (new_hours<10) {System.out.print("0"+new_hours+":");}else{System.out.print(new_hours+":");}
        if(newMinutes<10) {System.out.print("0"+newMinutes);}else{System.out.println(newMinutes);}
    }
}
