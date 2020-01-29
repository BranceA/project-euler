public class Problem4 {
    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct());
    }

    private static long largestPalindromeProduct(){
        for(int i = 99; i >= 10; i--){
            for(int j = 99; j >= 10; j--){
                long product = i * j;
                if(isPalindrome(product)){
                    return product;
                }
            }
        }
        return 0;
    }

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
