public class Problem1 {

    public static void main(String[] args) {
        System.out.println(multipleOfThreeAndFive());
    }

    private static int multipleOfThreeAndFive(){
        int total = 0;
        for (int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println("i = " + i);
                total += i;
                System.out.println("total = " + total);
            }
        }
        return total;
    }

}
