package lec_03;
import java.util.ArrayList;
public class Ex002array_list_ {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList list = new ArrayList();
       list.add(2809);


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
