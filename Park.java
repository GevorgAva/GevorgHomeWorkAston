import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Park {

    private String name;
    private String location;

    private int parkSize;
    private List<Attraction> parkAttractions;

    public Park(String name, String location, int parkSize) {
        this.name = name;
        this.location = location;
        this.parkSize = parkSize;
        this.parkAttractions = new ArrayList<>();
    }


    public void addAttraction(Attraction attraction) {
        if (parkAttractions.size() < parkSize) {
            parkAttractions.add(attraction);
        } else {
            System.out.println("Нельзя добавить аттракцион - " + attraction.name + ". Парк заполнен на 100%");
        }
    }

    public void deleteAttraction(Attraction attraction) {
        if (parkAttractions.contains(attraction)) {
            parkAttractions.remove(attraction);
        } else {
            System.out.println("Нельзя удалить аттракцион из парка - " + attraction.name + ". Аттракцион отсутсвтует в парке(не был добавлен в парк)");
        }
    }

    public void getInfoAttractions() {
        System.out.println(parkAttractions);
    }

    public static class Attraction {
        private int id;
        private String name;
        private String time;
        private double cost;

        public Attraction(int id, String name, String time, double cost) {
            this.id = id;
            this.name = name;
            this.time = time;
            this.cost = cost;

        }

        @Override
        public String toString() {
            return "Id аттракциона: " + id + " Название аттракциона: " + name + " Время работы: " + time + " Стоимость: " + cost + "руб.";
        }
    }

}
