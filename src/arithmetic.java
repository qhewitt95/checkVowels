public class arithmetic {

    public static void main(String[] args) {
        System.out.println(addMethod(12, 25));
        System.out.println(subtractMethod(20,10));
        System.out.println(multiplyMethod(3, 6));
        System.out.println(checkMethod(24));
    }

     static int addMethod(int a, int b){
         System.out.println("You sum is " + a + " + " + b );
        return a+b;
    }
    static int subtractMethod(int a,int b){
        System.out.println("You entered " + a);
        System.out.println("You entered " + b);
        System.out.println("The answer is " + a + " - " + b);
        return a-b;
    }
    static int multiplyMethod(int a,int b){
        System.out.print("You entered " + a + " * " + b  +" = ");
        return a*b;
    }
    static boolean checkMethod(int a){
        if(a % 3 == 0) {
            System.out.println("you entered " + a + " and that is true");
            return true;
        } else{
            System.out.println("you entered " + a + " and that is false");
            return false;
        }
    }
//Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
        public Integer sum(Integer n) {
            Integer sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            return sum;
    }
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
   // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    //sleepIn(false, false) → true
   // sleepIn(true, false) → false
    //sleepIn(false, true) → true
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
          return true;
        }
        return false;
      }
      
      public String fizzBuzz(Integer i) {
      String result = "";
if (i % 3 == 0) {
    result += "Fizz";
}
if (i % 5 == 0) {
    result += "Buzz";
}
if (result.equals("")) {
    result = i.toString();
}
return result;
      }

      public Integer factorial(Integer n) {
      int factorial = n;
      for (int j = n - 1; j > 0; j--) {
          factorial = factorial * j;
      }
      return factorial;
    }
}
