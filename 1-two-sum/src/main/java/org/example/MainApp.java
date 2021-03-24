package org.example;

import java.util.Arrays;

public class MainApp {
    public static void main (String[] args) {

        System.out.println('1');
        class solution{
            int target = 9;
            int nums[] = new int[] {2,7,11,15};
            public int[] twoSum(int[] nums, int target) {
                int n = nums.length ;
                for (int i = 0; i < n; ++i){
                    for (int j = i + 1; j < n; ++j){
                        if (nums[i] + nums[j] == target){
                            return new int[]{i,j};
                        }
                    }
                }
                return new int[0];
            }
        }
        solution xiaoming = new solution();
        System.out.println(Arrays.toString(xiaoming.twoSum(xiaoming.nums, xiaoming.target)));
        }

    }

