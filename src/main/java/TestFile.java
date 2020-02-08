import service.Deserialization;
import service.ReadFile;

import java.util.List;

public class TestFile {
    public static void main(String[] args) throws Exception {

        String path = "D:\\Java\\Projects -\\readFromTxt\\src\\main\\resources\\text.txt";


        List<String> myList = ReadFile.readFile(path);

//   /*     for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        for (String element : myList) {
//            System.out.println(element);
//        }*/
        Deserialization deserialization = new Deserialization();
        for (String element : myList) {
         try{
             System.out.println(deserialization.deserialize(element));
         }
         catch (Exception ex){
             System.out.println("Wrong text: " + element);
         }
        }
    }
}
