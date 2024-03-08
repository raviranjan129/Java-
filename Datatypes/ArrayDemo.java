import java.util.*;

public class ArrayDemo {
    public static void main(String [] args){
        //
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1]=98;
        marks[2] =95;

        System.out.println(marks[0]);

       // length

       System.out.println(marks.length);

       //sort 

       Arrays.sort(marks);
       System.out.println(marks[0]);  //it will sort the array and returns at index 0  : 95;


       // 

       int[] marks2 ={97,98,95};  // 1-d array;

       int [][] finalMarks = {{97,98,95},{95,95,98}}; // 2-d array;
       System.out.println(finalMarks[0][0]);  // it will give marks of first student's of first subject;
          
       System.out.println(finalMarks[1][1]);  // it will give marks of 2nd student's of 2nd subject;
    }
}
