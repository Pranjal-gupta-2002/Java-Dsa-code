package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //Wrapper classes

//        Integer a = Integer.valueOf(2);
//        System.out.println(a);
//        Float b = Float.valueOf(8.6F);
//        System.out.println(b);

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(8);
        l1.add(9);
        l1.add(10);
        l1.add(11);

        // get an element at index i

//        System.out.println(l1.get(0));
//        System.out.println(l1.get(3));


        //print with for loop
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.print(l1.get(i) + " ");
//        }


        //printing the Arraylist directly with sout
//        System.out.println(l1);


        // adding element at some index i

        l1.add(1,100);
        System.out.println(l1);  // [8,100,9,10,11]

        //modifying  element at some index i
        l1.set(1,12);
        System.out.println(l1); // it will change the value of index // [8,12,9,10,11]


        //remove element at some index i
        l1.remove(1);
        System.out.println(l1); //[8, 9, 10, 11]

        //remove an element e
        System.out.println(l1.remove(Integer.valueOf(10))); // without index direct value
        System.out.println(l1);


        // checking i an element exists or not
        Boolean ans = l1.contains(Integer.valueOf(11));
        System.out.println(ans);


        //if you don't specify class, you can put anything in the list
        ArrayList l = new ArrayList();
        l.add('p');
        l.add(true);
        l.add(89);
        System.out.println(l);
    }
}
