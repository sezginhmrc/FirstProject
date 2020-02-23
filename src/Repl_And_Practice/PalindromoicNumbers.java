package Repl_And_Practice;

public class PalindromoicNumbers {
    public static boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(44));
        System.out.println(isPalindrome(11));

    }
}
