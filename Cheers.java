// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String userWord = args[0];
                userWord = userWord.toUpperCase();
                int num = Integer.parseInt(args[1]);
                int i = userWord.length();
                while (i>0){
                        char letter = userWord.charAt(userWord.length()-i);
                        System.out.println("Give me an "+letter+": "+letter+"!");
                        i--;
                }
                System.out.println("What does at spell?");
                while(num>0){
                        System.out.println(userWord+"!!!");
                        num--;
                }
        }
}
