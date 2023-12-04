package com.practice;

import java.util.Arrays;

public class BubbleSort {
    public void Arrays(){
        int nums[] = {11,9,7,8,16};
        int tem=0;
        for (int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length-1;j++)
            {
               if (nums[i]<nums[j]){
                   tem =nums[i];
                   nums[i]=nums[j];
                   nums[j]=tem;
               }

            }
        }
        System.out.print("Bubble sort : ");
       for (int n :nums){

           System.out.print(n+" ");
       }
    }
}
