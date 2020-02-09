import model.Obstacle;
import service.Deserialization;
import service.ReadFile;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
    public static void main(String[] args) throws Exception {
        File file = new File(TestFile.class.getClassLoader().getResource("text.txt").getFile());
        String path = file.getAbsolutePath();
        path = path.replace("%20" , " ");


        List<String> linesFromFile = ReadFile.readFile(path);

//   /*     for (int i = 0; i < linesFromFile.size(); i++) {
//            System.out.println(linesFromFile.get(i));
//        }
//        for (String element : linesFromFile) {
//            System.out.println(element);
//        }*/

        List<Obstacle> obstacles = new ArrayList<Obstacle>();


        Deserialization deserialization = new Deserialization();

        for (String line : linesFromFile) {
            try {
                Object object = deserialization.deserialize(line);
                if (object instanceof Obstacle) {
                    obstacles.add((Obstacle) object);
                }
                System.out.println(object);
            } catch (Exception ex) {
                System.out.println("Wrong text: " + line);
            }
        }
        System.out.println("----------------------------");
        for (int i = 0; i < obstacles.size(); i++) {
            System.out.println(obstacles.get(i));

        }
        System.out.println("------- sorted arrayList ------ ");
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(0);
        bubbleSort(arrayList);
        System.out.println();
        System.out.println("------- sorted array ------ ");
        int[] array = {3, 2, 4, 0};
        bubbleSort(array);
        System.out.println();
        System.out.println("------- sorted Obstacles ------ ");

        bubbleSortObstacle(obstacles);

    }

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
