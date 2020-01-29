public class Problem3 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor());
    }

    private static long largestPrimeFactor(){
        for(long i = 600851475143L; i > 1L; i--){
            if(600851475143L % i == 0) {
                if (isPrime(i)) {
                    return i;
                }
            }
        }
        return 1L;
    }

    private static boolean isPrime(long numToCheck){
        for(long i = 2; i < numToCheck; i++){
            if(numToCheck % i == 0){
                return false;
            }
        }
        return true;
    }
}
