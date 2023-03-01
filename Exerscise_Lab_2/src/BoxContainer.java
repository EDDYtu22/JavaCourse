import java.util.ArrayList;
import java.util.List;

public class BoxContainer {
    List<Box> boxes;

    private int current_volume = 0;

    // конструктор с готов лист от кутии
    public BoxContainer(List<Box> boxes_list) {

        for (Box bo : boxes_list) {
            current_volume += bo.volume;
        }

        if (current_volume <= 100) {
            boxes = new ArrayList<>(boxes_list);
        } else {
            System.out.println("List of boxes can't fit in container!");
        }

    }

    // конструктор за празен контейнер
    public BoxContainer() {
        this.boxes = new ArrayList<>();
    }

    // взимаме заетия към настоящия момент обем в контейнера
    public int getCurrentVolume() {
        return current_volume;
    }

    // с този метод ъпдейтвам обема, който кутиите заемат, при добавяне на нова
    // кутия
    public void setCurrentVolume(int box_volume) {
        this.current_volume += box_volume;
    }

    // метод за добавяне на кутии в контейнера
    public void add_to_container(Box box) {
        // проверка дали сме заели 80% от контейнера И
        // дали добавянето на нова кутия няма да надхвърли макс обема на контейнера
        if (getCurrentVolume() >= 80 && getCurrentVolume() + box.volume > 100) {
            System.out.println("Container FULL!");
        } else {
            this.boxes.add(box);
            setCurrentVolume(box.volume);
        }
    }

    // метод за премахване на кутия от контейнера
    public void removeFromContainer(Box box) {
        // проверка за несъществуващ контейнер
        if (this.boxes == null) {
            System.out.println("Container is not existing!");
            return;
        }
        // проверка за празен контейнер
        if (this.boxes.isEmpty()) {
            System.out.println("Can't remove element, container is empty!");
            return;
        }
        String type = box.getClass().toString();
        
        for(Box bo : boxes){
            if(bo.getClass().toString().equals(type)){
                boxes.remove(bo);
                setCurrentVolume(-bo.volume);
                return;
            }    
        }
        System.out.println("Box not found!");
    }

    // принтираме всички кутии в контейнера
    public String toString() {
        if (boxes != null) {
            return boxes.toString() + " Volume used: " + current_volume + "/100";
        }
        return "Container don't exist!";

    }

}
