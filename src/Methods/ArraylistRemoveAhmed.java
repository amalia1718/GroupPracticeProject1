package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistRemoveAhmed {

    public static void main(String[] args) {


        ArrayList<String> nameslist = new ArrayList<String>(Arrays.asList("Ahmed","john","Eric","Ahmed"));

        System.out.println(nameslist);
   nameslist.removeAll(List.of("Ahmed"));


        System.out.println(nameslist);
    }
}