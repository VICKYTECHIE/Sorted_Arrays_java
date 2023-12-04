package com.practice;

import java.util.Arrays;

public class SelectionSort {
    public void sortArrays(){
        int arr[] = {10,7,3,9,1};
        int temp = 0;
        int min =0;
        for (int i=0;i< arr.length;i++){
            min =i;
            for (int j=i;j< arr.length;j++)
            {
                if(arr[min]>arr[j]){
                    min=j;
                }
                temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }

        }
        System.out.print("Selection sort : ");
        for (int n :arr){
            System.out.print(n+" ");
        }

    }
}
