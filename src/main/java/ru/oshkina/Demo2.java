package ru.oshkina;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(new int[]{1, 2, 5, 8, 9}, 0, 4, 9));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        int i = Collections.binarySearch(numbers, 10);//  (-(insertion point) - 1)
        System.out.println(i);
    }
}
