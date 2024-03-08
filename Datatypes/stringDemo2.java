public class stringDemo2 {

   public static void main(String [] args){
     //Non primitive types


     //lenght;

     String name = "Ravi";
    //  String friend = new String("Aman");
     System.out.println(name.length()); 

//concatnation;
     String name1 = "Aman";
     String name2= "Akku";
     String name3 = name1+name2;
     System.out.println(name3);
  

     //CharAt
String name4 = "Aman";
System.out.println(name4.charAt(0)); // java is 0 based index;

//Replace
 String name5= "Ravi";
String name6= name5.replace('R', 'r');  //replace does not change original string;
                                                        //In java String is immutable;
System.out.println(name6);

 //substring

 String  friend =  "Aman and Akku";
 System.out.println(friend.substring(0,4)); //end index will not include;

 
   }
    
    
}
