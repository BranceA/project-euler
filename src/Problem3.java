public class Problem3 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor());
    }

    private static long largestPrimeFactor(){
        long currentHighest = 2;
        for(long i = 3L; i < 300425737572L; i += 2){
            if(600851475143L % i == 0) {
                long otherFactor = 600851475143L/2;
                if (isPrime(i)) {
                    if(i > currentHighest){
                        currentHighest = i;
                    }
                }
                if(isPrime(otherFactor)){
                    if(otherFactor > currentHighest){
                        currentHighest = otherFactor;
                        i = otherFactor;
                    }
                }
            }
        }
        return currentHighest;
    }

    private static boolean isPrime(long numToCheck){
        for(long i = 2; i < (numToCheck / 2); i++){
            if(numToCheck % i == 0){
                return false;
            }
        }
        return true;
    }
}
//300425737572L half of big number

//13195L
//6598L