package ru.oshkina;

import java.util.ArrayList;

public class DemoHomework {

    //нечетное + четное = нечетное != 2 * x
    // A = [2, 1, 4, 5, 3]
    // A1 = [3, 1, 7, 9, 5] -> a[i]*2 -1
    // A2 = [4, 2, 8, 10, 6] ->a[i]*2
    //B = [3, 1, 7, 9, 5, 4, 2, 8, 10, 6]
    //n = 4
    //[1] [2]
    //[1, 2]
    //[1,3] [2, 4]
    //[1, 3, 2, 4]
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        while (numbers.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i : numbers) {// [1, 5, 3, 7]
                int value = i * 2 - 1;
                if (value <= n) {
                    temp.add(value);
                }
            }
            System.out.println(temp);
            for (int i : numbers) { //[2, 6, 4, 8]
                int value = i * 2;
                if (value <= n) {
                    temp.add(i * 2);
                }
            }
            System.out.println(temp);
            numbers = temp;
        }
        return numbers;
    }


    public static void main(String[] args) {
        System.out.println(beautifulArray(5));//8
        //[1, 5, 3, 7][2, 6, 4, 8]
    }
}
