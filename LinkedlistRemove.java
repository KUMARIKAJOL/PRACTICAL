package CollectionEg;
//Java program to illustrate the Java.util.LinkedList.remove() method
//and Java.util.LinkedList.removeLast() method

import java.util.LinkedList;

class LinkedlistRemove {
 public static void main (String[] args) {
    
     // Creating an LinkedList
     LinkedList<String> list = new LinkedList<String>();

     // Use add() method to add elements in the list
     list.add("Geek");
     list.add("for");
     list.add("Geeks");
     list.add("2020");
     list.add("2021");

     // Displaying the list
     System.out.println("LinkedList:\t" + list);

     // Remove the tail using removeLast()
     System.out.println("The last element is removed:\t" + list.removeLast());
      
     // Displaying the final list
     System.out.println("Final LinkedList:\t" + list);
      
     // Remove the head using remove()
     System.out.println("The first element is removed:\t" + list.removeFirst());

     // Displaying the final list
     System.out.println("Final LinkedList:\t" + list);
 }
}


