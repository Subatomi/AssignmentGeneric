import Arithmetic.Arithmetic;
import Map.MyMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Arithmetic p = new Arithmetic<>(d232,55.332);
//        System.out.println(p.add());

        MyMap map = new MyMap();
        map.put("anime1", "rezero");
        map.put("anime2", "code geass");
        map.put("anime3", "Jojo");
        System.out.println(map.get("anime3"));
        map.put("anime3", "Jojo s3");
        System.out.println(map.get("anime3"));
        map.remove("anime3");
        System.out.println(map.get("anime3"));

    }
}