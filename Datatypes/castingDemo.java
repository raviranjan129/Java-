  import java.util.*;

 public class castingDemo {
    public static void main(String[] args) {
         // casting means conversion of one datatypes into other data types ;

         /**
          * implicit casting => casting a data type with lower values to a data type with higher values without incurring any data loss (automatic);
          *
          */

          double price = 100.00; 
          double finalPrice = price+18; // adding int to double is implicit casting bcz double is bigger than int ; 

          System.out.println(finalPrice);


          /*
           * Explicit casting => used when you want to convert a value of one data type to another data type that cannot be automatically done by the compiler
           *  it is done manually 
           */

          int p = 100;
          int fp = p + (int)18.99;
          System.out.println(fp);
    }
}
