// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String userWord = args[0];
                userWord = userWord.toUpperCase();
                int num = Integer.parseInt(args[1]);
                int i = userWord.length();
                String char_an = "AEFHILMNORSX";
                while (i>0){
                        char letter = userWord.charAt(userWord.length()-i);
                        if (char_an.indexOf(letter) != -1) {System.out.println("Give me an "+letter+": "+letter+"!");}
                        else {System.out.println("Give me a "+letter+": "+letter+"!");}
                                
                        i--;
                }
                System.out.println("What does that spell?");
                while(num>0){
                        System.out.println(userWord+"!!!");
                        num--;
                }
        }
}
