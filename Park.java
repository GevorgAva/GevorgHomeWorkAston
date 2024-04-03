public class Park {

    private String name;
    private String location;
    private int countAttractions;

    public Park(String name, String location, int countAttractions) {
        this.name = name;
        this.location= location;
        this.countAttractions = countAttractions;
    }

    public class Attraction {
        private String name;
        private String time;
        private double cost;
        public Attraction(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

    }

}
