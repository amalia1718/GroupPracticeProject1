package Methods;

import java.util.ArrayList;
import java.util.List;

public class RemovesSomeValues {
    public static void main(String[] args) {


    int[] numbers = {0,4,5,56,3, 2000,8,345, 453,};

    List<Integer> list = new ArrayList<Integer>();


   for (int i : numbers){
        list.add(i);
    }

   for(int i=0;i<list.size();i++){
        if(list.get(i) > 100){
            list.remove(i);
            i--;
        }
    }


   System.out.println(list);

}

}

