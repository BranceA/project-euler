//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(smallestMultiple());
    }

    private static int smallestMultiple(){
        for(int i = 20; true; i++){
            if(i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0 && i % 16 == 0 && i % 15 == 0 && i % 13 == 0 && i % 11 == 0 && i % 9 == 0 && i % 8 == 0 && i % 7 == 0){
                return i;
            }
        }
    }
}
