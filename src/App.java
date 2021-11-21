import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Enter a string please. ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println("you entered " + string);
        

        for (int i = 0; i < string.length(); i++) {
           
            if(string.charAt(i) == 'a'|| string.charAt(i) == 'e'|| string.charAt(i) == 'i'|| string.charAt(i) == 'o'|| string.charAt(i) == 'u'){
            System.out.println("Given string contains " + string.charAt(i) + " at index " + i);
            }
            System.out.println("------------------------");
            if(string.charAt(i) == 'a'|| string.charAt(i) == 'e' ) {
                String newString = string.replace("a", "");
                System.out.println("your new string is " + newString );
            }
           
           

        }
    
    }

    
    
}
