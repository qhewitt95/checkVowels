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

    public Integer count(ListNode node) {
    int count = 0;
    ListNode current = node;
    while (current != null) {
        count++;
        current = current.next();
    }
    return count;
}

public  class  Solution {
    /**
   * @param T1, T2: The roots of binary tree.
   * @return: True if T2 is a subtree of T1, or false.
   */
      public static boolean is_Subtree(TreeNode T1, TreeNode T2) {
      if (T2 == null) return true;
      if (T1 == null) return false;
      if (is_Same(T1, T2)) return true;
      if (is_Subtree(T1.left, T2) || is_Subtree(T1.right, T2)) return true;
      return false;
  }
}
}
