public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
    static int sum(int n){
        if(n<=1){
            return n;
        }
        int a = n%10;
        return sum(n/10) + a;
    }
}
