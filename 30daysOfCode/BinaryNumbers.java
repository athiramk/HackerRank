/***
*
****/

import java.util.*;
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0, largestcounter = 0;
        int binary = 0;
        while (n>0) {
          int reminder = n%2;
          n = n/2;
          if (reminder == 1) {
            counter++;
            if(counter>largestcounter)
              largestcounter = counter;
          }
          else			
            counter = 0;       
        }
        System.out.println(largestcounter);
        in.close();
    }
}
