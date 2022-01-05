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

}
