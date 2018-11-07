import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        method1();
        method2();
        String resultOfMethod2 = method2();
        method3(resultOfMethod2);
        printSumm(5, 10);
        printSumm(100, 16);
        concatString("a", "b");

    }

    public static void method1() {
        int a=5;
        int b=10;
        System.out.println(a+b);

    }

    public static String method2(){
        String s1 = "s1";
        String s2 = "s2";
        String s3 = s1+s2;
        return s3;//equal ---- return s1+s2;
    }
    public static void method3(String s){

        if(s.isEmpty()){
            return;
        }else {     //else можно убрать, т.к. return выведет из метода
            System.out.println(s);
        }
    }

    public static void printSumm(int a, int b){
        Scanner in = new Scanner(System.in);
//           int a = in.nextInt();
//           int b = in.nextInt();
//           printSumm(a,b);
        System.out.println(a+b);
    }

    public static String concatString(String s1, String s2){
        return s1+s2;
    }
}
