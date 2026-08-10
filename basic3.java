
public class basic3 {
    public static void main(String arg[]){
        // if else  , ternory operator , -> exact same as c++

        // 
        /*      
            Java does not allow integers to behave as booleans.
            if (1) {
                System.out.println("Hello");
            }  // invalid

            if (true) {
                System.out.println("Hello");
            } // valid
        */
        int number = 2;
        switch(number) {
            case 1 : System.out.println("samosa");
            break;
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("mango shake");
            break;
            default : System.out.println("we wake up");
        }

        // loops syntex is exact same , continue 
        int[] arr = {10, 20, 30, 40, 50};
        for(int x : arr) {
            System.out.println(x);
        }
        int[] arr2 = {10,20,30};
        System.out.println(arr2.length);
        // length is a field, not a function

        /*  Correct:
            arr.length
            Wrong:
            arr.length()
        */

            // functions -> exact same inly difference is use of static keyword before return type

            // Arrays : 
            /*
            int arr[] = new int[5];
            int[] arr = new int[5];
            int[] arr = {10, 20, 30, 40, 50};

            int[][] arr = new int[3][4];

            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

        */
    }
    
}