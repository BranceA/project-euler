public class Problem4 {
    public static void main(String[] args) {
        System.out.println("isPalindrome(1001) = " + isPalindrome(1001));
        System.out.println("isPalindrome(1234) = " + isPalindrome(1234));
        System.out.println("isPalindrome(12344321) = " + isPalindrome(12344321));
        System.out.println("isPalindrome(12563027) = " + isPalindrome(12563027));
    }

//    private static long largestPalindromeProduct(){
//
//    }

    private static boolean isPalindrome(long numberToCheck){
        int numberOfDigits = numberOfDigits(numberToCheck);
        String numberString = "" + numberToCheck;
        StringBuilder input = new StringBuilder();
        if(numberOfDigits % 2 == 0){
            int halfwayPoint = numberOfDigits/2;
            String firstHalf = numberString.substring(0, halfwayPoint);
            String secondHalf = input.append(numberString.substring(halfwayPoint)).reverse().toString();
            return firstHalf.equalsIgnoreCase(secondHalf);
        }else {
            return false;
        }
    }
    private static int numberOfDigits(long numberToCount){
        String numberString = "" + numberToCount;
        return numberString.length();
    }
}
