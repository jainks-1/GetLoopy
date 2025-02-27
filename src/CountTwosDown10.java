public class CountTwosDown10 {
    public static void main(String[] args) {

        System.out.print("\nCount down from 10 to 0 by 2's...\n");

        // count down from 30 using for loop
        for (int count = 10; count >= 0; count-= 2) {

            System.out.print(count + "   ");
        }

        // finish and exit
        System.out.print("\nComplete!");
        System.exit(0);
    }
}

