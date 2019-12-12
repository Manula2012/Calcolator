
public class Cal {
     static int a; // static class variable declared outside method and inside the class
    static int b; // static class variable declared outside method and inside the class

      // No return type - with parameters STATIC Method
       public static void addition(int a, int b) {
        System.out.print("Addition of "+a+" and "+b+" = ");
        System.out.println(a+b);
    }
      // No return type - with parameters STATIC Method
       public static void sub(int a, int b) {
           System.out.print("Substracion of "+a+" and "+b+" = " );
           System.out.println(a-b);
       }
      // No return type - with parameters STATIC Method
       public static void mult(int a, int b) {
           System.out.print("Multification of "+a+" and "+b+" = ");
           System.out.println(a*b);
    }
       // No return type - with parameters STATIC Method
       public static void div(int a, int b) {
           System.out.print("Division of "+a+" and "+b+" = " );
           System.out.println(a/b);
       }
        // main method
        public static void main(String[]  args) {
           System.out.println("       Calculator     ");
           addition(a =10, b= 30);
           sub(a=50, b=20);
           mult(a=20, b=20);
           div(a=50, b=10);
              }
}
