package collection_framwork.List;

import java.util.*;

public class Learn_ArrayList {

    static void main(String[] args) {


       //This is how we create a object in ArrayList and make sure we have to import the pakage java.util.
       // Array List in used to crate the dynamic array list we can delete remove and change the value in this list just we don't have to declear the length of array it will adjust by itself

       ArrayList<Integer> num = new ArrayList<>();

       //this is hoe we add the value in the Arraylist my add method
       num.add(30);
       num.add(42);
       num.add(55);
       num.add(85);
       System.out.println(num);
       //this is hoe we add the value on the specific index of the ArrayList it will overload the add method
       num.add(1,50);
       System.out.println(num);

       // this is how we will get the value in the Arraylist
       System.out.println(num.get(2));

       // this is how we can add the values in the first and last
       num.addFirst(46);
       num.addLast(78);
       System.out.println(num);


       // and there are many more methods we can use same like add.
   }


}
