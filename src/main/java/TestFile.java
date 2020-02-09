import model.Obstacle;
import service.Deserialization;
import service.ReadFile;
import service.Tools;

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
        Tools.bubbleSort(arrayList);
        System.out.println();
        System.out.println("------- sorted array ------ ");
        int[] array = {3, 2, 4, 0};
        Tools.bubbleSort(array);
        System.out.println();
        System.out.println("------- sorted Obstacles ------ ");

        Tools.bubbleSortObstacle(obstacles);

    }


}
