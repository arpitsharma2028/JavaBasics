import java.util.* ;

public class basic2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input); 

        // next function donot store after space
        // so we use function nextLine
        String input2 = sc.nextLine();
        System.out.println(input2);

        int num = sc.nextInt();
        System.out.println(num);

        /*
            next
            nextLine
            nextInt
            nextByte
            nextFloat
            nextDouble
            nextBoolean
            nextShort
            nextLong
        */

        // java by default take decimal value to double , eg 3.14 , if i want to convert
        // 3.14 from double to float , then 3.14f
         

        /*
            Type Conversion : java do it by itself

                Conversion happens when:
                a. type compatible
                b. destination type > source type

                byte -> short -> int -> float -> long -> double 
        */

        float a = sc.nextInt(); // java allow it  , 
        // but int a = sc.nextFloat() ; // is not allowed
        
        
        /*
            type casting
            float a = 1.22f;
            int b = (int)a;
        */

        /*
            1. Java automatically promotes each byte, short, or char operand to int
                when evaluating an expression.
            2. If one operand is long, float or double the whole expression is
                promoted to long, float, or double respectively.
        */

        /*
            byte b = 2;
            b = b * 2;  // error
                       //  there is operation bw b and 2 , => b is converted into int
                       // now left b is byte => error
            b = byte(b * 2);
        */
    }
}
