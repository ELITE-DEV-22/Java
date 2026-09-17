package lab3.Car;

public class car {

        private String name;
        private String model;
        private String year;
        private String color;
        private double price;

        public car(String name, String model, String year,String color, double price){
            this.name = name;
            this.model = model;
            this.year = year;
            this.color = color;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car[" +
                    "name='" + name +
                    ", model='" + model +
                    ", year='" + year +
                    ", color='" + color +
                    ", price=" + price +
                    ']';
        }
    }

