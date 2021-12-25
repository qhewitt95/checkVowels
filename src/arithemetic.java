public class arithemetic {

    public static void main(String[] args) {
        System.out.println(addMethod(12, 25));
        System.out.println(subtractMethod(20,10));
        System.out.println(multiplyMethod(3, 6));
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
        System.out.print("You entered " + a + " * " + b);
        return a*b;
    }
    static boolean checkMethod(boolean a){
        if(a % 3 == 0) {
            return true;
        } else{
            return false;
        }
    }

}
