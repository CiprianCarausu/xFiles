package service;

import model.Obstacle;

import java.util.List;

public class Tools {

    public static void bubbleSortObstacle(List<Obstacle> array) {
        Obstacle temp;
        boolean fixed = false;

        while (fixed == false) {
            fixed = true;

            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).getSize() > array.get(i+1).getSize()) {
                    temp = array.get(i);
                    array.set(i,array.get(i+1));
                    array.set(i+1,temp);
                    fixed = false;
                }
            }
        }
        String str = " ";
        for (int i = 0; i < array.size(); i++) {
            System.out.println(str + array.get(i));
        }
    }

    /**
     * Here we have two bubblesort methods that are based on the overLoading concept.
     * overloading = a method with the same name, return type but with different parameters
     * @param array
     */

    public static void bubbleSort(List<Integer> array) {
        int temp = 0;
        boolean fixed = false;

        while (fixed == false) {
            fixed = true;

            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i) > array.get(i+1)) {
                    temp = array.get(i);
                    array.set(i,array.get(i+1));
                    array.set(i+1,temp);
                    fixed = false;
                }
            }
        }
        String str = " ";
        for (int i = 0; i < array.size(); i++) {
            System.out.print(str + array.get(i));
        }
    }

    /**
     * Here we have two bubblesort methods that are based on the overLoading concept.
     * overloading = a method with the same name, return type but with different parameters
     * @param array
     */

    public static void bubbleSort(int[] array) {
        int temp = 0;
        boolean fixed = false;

        while (fixed == false) {
            fixed = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    fixed = false;
                }
            }
        }
        String str = " ";
        for (int i = 0; i < array.length; i++) {
            System.out.print(str + array[i]);
        }
    }

}
