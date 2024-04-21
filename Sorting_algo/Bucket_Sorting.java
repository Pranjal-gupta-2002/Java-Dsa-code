package Sorting_algo;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket_Sorting {

    static void bucketSort(float arr[]){
        int n = arr.length;

        //Buckets
        ArrayList<Float> buckets[]  = new ArrayList[n];


        //create an empty buckets
        for (int i = 0; i < buckets.length ; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // add element into our buckets

        for (int i = 0; i < arr.length; i++) {
            int bucketIndex  = (int)arr[i] * 10;
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }


        // take out all element and join them
        int index  = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        // put all element in B no. of bucket
        // Sort each bucket individually
        // take out all element and join them

        float arr [] = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);

        for(float a : arr){
            System.out.print(a + "  ");
        }
    }
}
