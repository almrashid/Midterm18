package math.problems;

public class Fibonacci {
    static int first=0;  //0
    static  int second=1;  //1
    static int third=0;
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        print(40);
    }

    public static  void print(int n){
        //0 ---1
        if(n>0){
            third=first+second;
            first=second;
            second=third;
            System.out.print("  " +third);
            print(n-1);
        }

    }
}
