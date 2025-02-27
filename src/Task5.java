public class Task5 {
    public static void main(String[] args) {

        System.out.print("\nPrinting a cool shape...\n");

        // print the shape using nested for loops
        for (int count = 1; count <= 5; count++) {

            for (int count2 = 1; count2 <= count; count2++) {
                System.out.print("*");
            }
            //create new line for every set of *'s
            System.out.println();
        }

        // finish and exit
        System.out.print("\nComplete!");
        System.exit(0);
    }
}