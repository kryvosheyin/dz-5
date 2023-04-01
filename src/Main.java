public class Main {

     static int a = 1;
     static int b = 2;
     static int c = 2;
     static int d = 2;

    public static void main(String[] args) {
        int sum1 = a+b;
        int sum2 = c+d;
        System.out.println(sum1>sum2);
        sum1+=1;
        sum2-=2;
        System.out.println(sum1 > sum2);
        System.out.println((sum1%2==0 || sum2%2==0));
    }
}
