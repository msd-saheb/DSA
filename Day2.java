public class Day2 {
    public static void main(String[] args) {

 int num = 5;
/*        for(int row = 0 ; row < 5 ; row++){
            //space
            for(int col = 0 ; col < 5-row-1; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0 ; col < row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int row = 0 ; row < 5 ; row++){
            //space
            for(int col = 0 ; col < row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0 ; col < 5-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

/*        for (int row = 0; row < 5; row++) {
            //space
            for (int col = 0; col < 5 - row - 1; col++) {
                System.out.print(" ");
            }
            //stars
            for (int col = 0; col < row + 1; col++) {
                if (col == 0 || col == row + 1 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        for(int row = 0 ; row < 5 ; row++){
            //space
            for(int col = 0 ; col < row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0 ; col < 5-row; col++){
                if( col == 0 || col == 5-row-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/


     /*   for(int row=0 ; row < 5 ; row++){
            for(int col = 0 ; col < 5-row; col++){
                System.out.print("*");
            }

            for(int col = 0 ; col < 2*row + 1 ; col++){
                System.out.print(" ");
            }

            for(int col = 0 ; col < 5-row ; col++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int row=0 ; row < 5 ; row++){
            for(int col = 0 ; col < row + 1; col++){
                System.out.print("*");
            }

            for(int col = 0 ; col < 2*5-2*row-1 ; col++){
                System.out.print(" ");
            }

            for(int col = 0 ; col < row + 1 ; col++){
                System.out.print("*");
            }

            System.out.println();
        }
*/

/*        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 2 * row + 1; col++) {
                if (col % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(row + 1);
                }
            }
            System.out.println();
        }*/

/*        for (int row = 0; row < 5; row++) {
            int total = row + 1;
            for (int col = 0; col < total; col++) {
                if(col == total - 1){
                    System.out.print(col+1);
                }else {
                System.out.print(col+1+"*");
            }
        }
            System.out.println();

    }*/

 /*       for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5-row; col++) {
                if(row == 0 || row == 4){
                    System.out.print(" * ");
                } else if (col ==0 || col ==5-row-1) {
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            }*/

    /*    for(int row = 0 ; row < num ; row++){
            char i = 0;
            for(int col = 0 ; col < row+1; col++){
                 i = (char) (col +'A');
                System.out.print(i);
            }
            for(char start = i  ; start > 'A' ; start --){
                System.out.print(start);
            }
            System.out.println();
        }*/

        for(int row = 0 ; row < num ; row++){
            for(int col = 0 ; col < 2*num - row -2 ; col++){
                System.out.print("*");
            }
            for(int col = 0 ; col < (2*row+1) ; col++){
                if(col % 2 == 0) {
                    System.out.print(row + 1);
                } else{
                    System.out.print("*");
                }
            }

            for(int col = 0 ; col < 2*num - row -2 ; col++){
                System.out.print("*");
            }


            System.out.println();
        }
        }

}
