public class strings { // first letter small -> user defined class
    public static void main(String args[]){
        //Strings are

        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // strings are  IMMUTABLE in java
    
        // here .length() but in array it is .length -> finding length in strings -> function , array -> property
        System.err.println(str.charAt(1) );

        // Strings comparison
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2) {
        System.out.println("Strings are equal");
        } else{
        System.out.println("Strings are not equal");
        }
        if(s1 == s3) {
        System.out.println("Strings are equal");
        } else {
        System.out.println("Strings are not equal");
        }


        if(s1.equals(s3))
        System.out.println("Strings are equal");
        else 
        System.out.println("Strings are not equal");
        

        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits [0];
        for(int i=1; i<fruits.length; i++) {
        if(largest.compareTo(fruits [i]) < 0)
        largest = fruits [i];
        }
        System.out.println(largest);

        // compareTo -> a.compareTo(b) -> -ve -> a < b , 0 -> both equals , +ve -> a > b
        // str1.compareToignoreCase(str2) -> ignore lower and upper case


        StringBuilder sb = new StringBuilder("");
            for(char ch='a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } 
        System.out.println(sb);
        // uppercase conversion
        // character.toUpperCase(str.charAt(i))        
    }

}
