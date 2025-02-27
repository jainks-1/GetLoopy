public class CountDown30 {
    public static void main(String[] args) {

        System.out.print("\nCount down from 30 to 0...\n");

        // count down from 30 using for loop
        for (int count = 30; count >= 0; count--) {

            System.out.print(count + "   ");
        }

        // finish and exit
        System.out.print("\nComplete!");
        System.exit(0);
    }
}