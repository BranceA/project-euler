public class Problem4 {
    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct());
    }

    private static long largestPalindromeProduct(){
        long currentHighest = 0;
        for(int i = 999; i >= 100; i--){
            for(int j = 999; j >= 100; j--){
                long product = i * j;
                if(isPalindrome(product)){
                    if(product > currentHighest){
                        currentHighest = product;
                    }
                }
            }
        }
        return currentHighest;
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
