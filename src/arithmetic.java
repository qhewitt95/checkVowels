import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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


      if()
      return false;
  }
}
public Integer fibonacci(Integer n) {
if (n == 1) {
    return 1;
} else if (n == 0) {
    return 0;
} else {
    return fibonacci(n - 1) + fibonacci(n - 2);
}
public int bunnyEars(int bunnies) {
    // Base case: if bunnies==0, just return 0.
    if (bunnies == 0) return 0;
    
    // Recursive case: otherwise, make a recursive call with bunnies-1
    // (towards the base case), and fix up what it returns.
    return 2 + bunnyEars(bunnies-1);
  
}
public Integer maximum(Integer[] list) {
int maximum = list[0];
for (int i : list) {
    if (i > maximum) {
        maximum = i;
    }



}
return maximum;


String backpack[] = {"Shotgun", "Assualt Rifle", "Sniper"};
String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
int numbersZombiesHATE[] = {4, 64, 2, 80, 120};

System.out.println(numbersZombiesHATE[6]);

System.out.println("Backpack Items");
System.out.println(backpack[0]);
System.out.println(backpack[1]);
System.out.println(backpack[2]);

System.out.println("Theses are the zombies!");
System.out.println(zombies[1]);
System.out.println(zombies[2]);
System.out.println(zombies[3]);

System.out.println(backpack[2]);

public static int count_Words(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 2))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; // returns 0 if string starts or ends with space " ".
}
public boolean aIsBigger(int a, int b) {
    if (a > b && (a - b) >= 2) {
      return true;
    }
  
    return false;
  }
  Alternately it can be done with an if/else structure like this:
  
  public boolean aIsBigger(int a, int b) {
    if (a > b && (a - b) >= 2) {
      return true;
    } else {
      return false;
    }
  }


