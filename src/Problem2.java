public class Problem2 {

    public static void main(String[] args) {
        System.out.println(evenFibonacciNumbers());
    }

    private static long evenFibonacciNumbers(){
        long lastNumber = 1;
        long currentNumber = 1;
        long total = 0;
        long placeHolder = 0;
        while(currentNumber <= 4000000){
            placeHolder = currentNumber;
            currentNumber += lastNumber;
            lastNumber = placeHolder;
            if(currentNumber % 2 == 0){
                total += currentNumber;
            }
        }
        return total;
    }

}
