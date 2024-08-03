package Ch_12.Exercise.Pg_386_Code_Magnets;
//Question:-
/*
A Java program is all scrambled up on the fridge. Can you reconstruct the code snippets to make a
working Java program that produces the output listed below?
 
Output:-
%java CoffeeOrder
[Americano, Cappuccino, Cortado, Espresso]
*/

import java.util.*;
import java.util.stream.*;
public class CoffeeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Cappuccino",
        "Americano", "Espresso","Cortado", "Mocha",
        "Cappuccino", "Flat White", "Latte");
        List<String> coffeesEndingInO = coffees.stream()
                                               .distinct()  
                                               .sorted()
                                               .filter(s -> s.endsWith("o"))
                                               .collect(Collectors.toList());
        System.out.println(coffeesEndingInO);
    } 
}
