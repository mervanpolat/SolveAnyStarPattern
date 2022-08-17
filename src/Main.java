public class Main {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);

    }
    static void pattern1(int n){

        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *

        for (int row = 1; row<=n; row++) {
            //for every row, run the column.

            for (int col=1; col<=n; col++) {
                System.out.printf("* ");
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern2(int n){

        //*
        //* *
        //* * *
        //* * * *
        //* * * * *

        for (int row = 1; row<=n; row++) {
            //for every row, run the column.
            for (int col=1; col<=row; col++) {
                System.out.printf("* ");
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern3(int n){
//        * * * *
//        * * *
//        * *
//        *
        for (int row = n; row>=1; row--) {
            //for every row, run the column.
            for (int col=1; col<=row; col++) {
                System.out.printf("* ");
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern4(int n){

        //1
        //1 2
        //1 2 3
        //1 2 3 4

        for (int row = 1; row<=n; row++) {
            int number = 1;
            //for every row, run the column.
            for (int col=1; col<=row; col++) {
                System.out.printf(number + " ");
                number++;
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern5(int n){

    //*
    //* *
    //* * *
    //* * * *
    //* * *
    //* *
    //*

        for (int row = 1; row<=n; row++) {
            int number = 1;
            //for every row, run the column.
            for (int col=1; col<=row; col++) {
                System.out.printf("* ");
                number++;
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }

        for (int row = n; row>=1; row--) {
            //for every row, run the column.
            for (int col=1; col<=row-1; col++) {
                System.out.printf("* ");
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern6(int n){
        for (int i = 1; i<=n; i++) {
            //for every row, run the column.

                for (int j = 1; j <= n; j++) {
                    if(j == 1 || j == n) {
                        System.out.printf("* ");
                    } else {
                        System.out.printf("  ");
                    }
                }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern7(int n){
        for (int i = 1; i<=n; i++) {
            //for every row, run the column.
            for (int j = 1; j <= n; j++) {
                if(i == n/2+1 || j == n/2+1) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern8(int n){
        for (int i = 1; i<=n; i++) {
            //for every row, run the column.
            for (int j = 1; j <= n; j++) {

                if (i==n || j==1 || j==n || i==5) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern9(int n){
        for (int i = 1; i<=n; i++) {
            //for every row, run the column.
            for (int j = 1; j <= n; j++) {
                if (i==n || j==1 || j==i) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }

    static void pattern10(int n){
        for (int i = 1; i<=n; i++) {
            //for every row, run the column.
            for (int j = 1; j <= n; j++) {
                if (i==1 || j==n || j==i) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
            //When one row is printed, we need to add a new line
        }
        System.out.println();
    }


}