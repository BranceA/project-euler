//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10 001st prime number?

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(tenthousandAndOneAPrimeNumberOdyssey());
    }

    private static long tenthousandAndOneAPrimeNumberOdyssey(){
        int counter = 0;
        for(int i = 2; true; i++){
            if(isPrime(i)){
                counter++;
                if(counter == 10001){
                    return i;
                }
            }
        }
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
