public class CheckBoard {
    public static void main(String[] args) {
/*
        for (int i = 0; i < 8; i++) {

            if (i % 2 == 0) {
                System.out.print(" ");
            }

            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//The second way to do Chess board
 */



        int field = 1;
        for (int i = 1; i<=64;i++){
            if ((field%2)==0){
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }
            if (i%8 == 0){
                System.out.println();
                field++;
            }
            field++;
        }


    }


}

