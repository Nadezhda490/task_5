public class Main {
    public static void main(String[] args) {

        //System.out.println() \n
        //System.out.print()
        //peremennie
        //for i vlojenniy for
        //if



        //System.out.print("*****");
        //System.out.print("*****");
        //System.out.print("*****");
        //System.out.print("*****");
        //System.out.print("*****");
        //System.out.print("*****");
        //System.out.print("*****");
        //System.out.print("*****");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();



//        System.out.println(" * ");
//        System.out.println("  * ");
//        System.out.println("   * ");
//        System.out.println("    * ");
//        System.out.println("     * ");
//        System.out.println("      * ");
//        System.out.println("       * ");
//        System.out.println("        * ");

        for (int i = 0; i > -8; i--) {
            for (int v = 0; v >= i; v--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println();



//        System.out.println("        * ");
//        System.out.println("       * ");
//        System.out.println("      * ");
//        System.out.println("     * ");
//        System.out.println("    * ");
//        System.out.println("   * ");
//        System.out.println("  * ");
//        System.out.println(" * ");

        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }



//        System.out.print("*       \n");
//        System.out.print("**      \n");
//        System.out.print("***     \n");
//        System.out.print("****    \n");
//        System.out.print("*****   \n");
//        System.out.print("******  \n");
//        System.out.print("******* \n");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j + 1 < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



//        System.out.print("******* \n");
//        System.out.print("******  \n");
//        System.out.print("*****   \n");
//        System.out.print("****    \n");
//        System.out.print("***     \n");
//        System.out.print("**      \n");
//        System.out.print("*       \n");

        for (int i = 7; i > 0; i -= 1) {
            for (int j = 7; j < (0 - i / 1); j++) {
                System.out.print(" ");
            }
            for (int v = 0; v < i; v++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();



//        System.out.print("       *       \n");
//        System.out.print("      ***      \n");
//        System.out.print("     *****     \n");
//        System.out.print("    *******    \n");
//        System.out.print("   *********   \n");
//        System.out.print("  ***********  \n");
//        System.out.print(" ************* \n");
//        System.out.print("***************\n");

        {int count = 8;
            for (int i = 1; i <= count; i++) {
                for (int j = 1; j <= (count - i); j++) {
                    System.out.print(" ");
                }
                for (int v = 0; v < (i + (i - 1)); v++) {
                    System.out.print("*");
                }
//            for (int z = 1; z <= (count - i); z++) {
//                System.out.print(" ");
//            }
                System.out.println();
            }
            System.out.println();}



//        System.out.print("        *        \n");
//        System.out.print("       ***       \n");
//        System.out.print("      *****      \n");
//        System.out.print("     *******     \n");
//        System.out.print("    *********    \n");
//        System.out.print("   ***********   \n");
//        System.out.print("  *************  \n");
//        System.out.print(" *************** \n");
//        System.out.print("*****************\n");
//        System.out.print(" *************** \n");
//        System.out.print("  *************  \n");
//        System.out.print("   ***********   \n");
//        System.out.print("    *********    \n");
//        System.out.print("     *******     \n");
//        System.out.print("      *****      \n");
//        System.out.print("       ***       \n");
//        System.out.print("        *        \n");

        int count = 9;
        int count2 = 8;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= (count - i); j++) {
                System.out.print(" ");
            }
            for (int v = 0; v < (i + (i - 1)); v++) {
                System.out.print("*");
            }
//            for (int z = 1; z <= (count - i); z++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
        for (int p = count2; p >= 1; p--) {
            if (count2 >= 1)
                for (int t = count2; t >= p; t--) {
                    System.out.print(" ");
                }
            for (int n = 1; n < (p * 2); n++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}