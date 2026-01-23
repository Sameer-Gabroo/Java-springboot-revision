package Core_Java.AdvanceTopic.Strem_Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Steam001 {






    static void main(String[] args) {
        //This is how we create the ArrayList and filter the even values it the old method
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(31);
        list.add(32);
        list.add(38);
        list.add(37);
        ArrayList <Integer> list2 = new ArrayList<>();
     for(Integer i :list){
         if(i%2==0){
         list2.add(i);

         }
     }
        System.out.println(list2);


     //     With Stream
     // in .filter() we provide the condition
        List<Integer> list1 = Arrays.asList(3, 54, 32, 33, 2, 4, 8, 3).stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);

    }


//    Role	Question it answers	Example
//    Predicate	“Should I keep this?”	i -> i % 2 == 0
//    Function	“How should I change this?”	i -> i * 2
//    Consumer	“What should I do with this?”	i -> System.out.println(i)
//    Supplier	“What should I give?”	() -> 10


//    Stream method	Functional interface	What it does
//            filter()	Predicate	keep / remove elements (true / false)
//    map()	Function	transform elements
//    forEach()	Consumer	use elements (no return)
//    generate() / supply()	Supplier	create elements




}
