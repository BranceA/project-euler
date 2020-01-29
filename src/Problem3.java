//The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor());
    }

    private static long largestPrimeFactor(){
        long currentHighest = 2;
        long divisor = maxNumber(600851475143L);
        for(long i = 3L; i < (600851475143L/divisor); i += 2){
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

    private static long maxNumber(long num){
        for(long i = 3; i < num; i++){
            if(num % i == 0){
                return i;
            }
        }
        return 3;
    }
}
//300425737572L half of big number
//200283825048L third of big number

//13195L
//6598L
//4399L