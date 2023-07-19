import java.util.Scanner;

public class CheckPallindrome {
    static int isPallindrome(String A, int start, int end){
        if(start>end){
            return 1;
        }
        if(A.charAt(start)!=A.charAt(end)){
            return 0;
        }
        return isPallindrome(A, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isPallindrome(str, 0, str.length()-1));
    }
}
