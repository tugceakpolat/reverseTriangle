public class triang {
    public static void main(String[] args) {

        int n = 10; //10 basamaklı isteniyor.


        for ( int i =1; i <= n; i++) {
            for(int empty=1; empty <= i-1; empty++ ){
                System.out.print(" ");
            }
            for(int star = 1; star <= 2*(n-i)+1; star++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
