
package com.ocp.day17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class 練 {
    public static void main(String[] args) {
  Set set = new LinkedHashSet();
  set.add("國文");
        set.add(100);
        set.add("英文");
        set.add(90);
        set.add("數學");
        set.add(80);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(null);
        System.out.println(set);
        //走訪
       Iterator iter = set.iterator();
        while (iter.hasNext()) {
        Object next = iter.next();
        System.out.println(next);
            }
  iter = set.iterator();
        while (iter.hasNext()) {
        Object next = iter.next();
        System.out.println(next);               
            }
    int sum = 0;
   iter = set.iterator();
        while (iter.hasNext()) {
        Object next = iter.next();
        if(next instanceof Integer) {
     sum+=(Integer)next;
        }   
            }
     //8
 int sum2 =  set.stream().filter(s->s instanceof Integer).mapToInt(s->(Integer)s).sum();
        System.out.println(sum2);       
}
}
