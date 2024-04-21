package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

    static void reverseArrayList(ArrayList<Integer> list){
        int i = 0;
        int j = list.size()-1;
        while (i<j){

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);

            i++;
            j--;
        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        //reverse an ArrayList

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(8);
        l1.add(91);
        l1.add(25);
        l1.add(11);
        l1.add(12);
        l1.add(33);
        System.out.println(l1);

        reverseArrayList(l1);
    }
}
