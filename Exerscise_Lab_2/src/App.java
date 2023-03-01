
import java.lang.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        BoxContainer Cont1 = new BoxContainer();

        // пълня контейнер едно с инстанции на трите вида кутии
        Cont1.add_to_container(new SmallBox());
        Cont1.add_to_container(new MedBox());
        Cont1.add_to_container(new LargeBox());

        // създавам лист от кутии за да тествам втория вид конструктор, който работи с
        // готов лист от кутии
        List<Box> box_list = new ArrayList<>();
        box_list.add(new SmallBox());
        box_list.add(new SmallBox());
        box_list.add(new SmallBox());
        box_list.add(new SmallBox());

        // извиквам конструктора с параметър лист от кутии
        BoxContainer Cont2 = new BoxContainer(box_list);

        // принтирам двата контейнера
        System.out.println(Cont1);
        System.out.println(Cont2);

        // премахвам по една кутия от двата контейнера
        Cont2.removeFromContainer(new SmallBox());
        Cont1.removeFromContainer(new MedBox());
        Cont1.removeFromContainer(new MedBox());

        // принтирам на нова двата контейнера
        System.out.println(Cont1);
        System.out.println(Cont2);

        Box small = new SmallBox();
        System.out.println(small instanceof SmallBox);
        System.out.println(small instanceof Box);
        
    

    }
}
