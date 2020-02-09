import service.Deserialization;
import service.ReadFile;

import java.util.List;

public class TestFile {
    public static void main(String[] args) throws Exception {

        String path = "D:\\Java\\Projects -\\readFromTxt\\src\\main\\resources\\text.txt";


        List<String> linesFromFile = ReadFile.readFile(path);

//   /*     for (int i = 0; i < linesFromFile.size(); i++) {
//            System.out.println(linesFromFile.get(i));
//        }
//        for (String element : linesFromFile) {
//            System.out.println(element);
//        }*/
        Deserialization deserialization = new Deserialization();
        for (String line : linesFromFile) {
         try{
             System.out.println(deserialization.deserialize(line));
         }
         catch (Exception ex){
             System.out.println("Wrong text: " + line);
         }
        }
    }
}
