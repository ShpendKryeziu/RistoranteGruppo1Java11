import java.util.HashSet;
import java.util.Set;

public class Dessert {
    private String dessertName;
        private double dessertPrice;
        private static final Set<Dessert> tuttiIDessert = new HashSet<>();
        public Dessert (String name, double price) {
            this.setName(name);
            this.setPrice(price);
            tuttiIDessert.add(this);
        }
        public String getName() {
            return dessertName;
        }
        public void setName(String dessertName) {
            this.dessertName = dessertName;
        }
        public double getPrice() { return dessertPrice; }
        public void setPrice(double dessertPrice) {
            this.dessertPrice = dessertPrice;
        }
        public static Set<Dessert> getTuttiIDessert() {
            return tuttiIDessert;
        }

        @Override
        public String toString() {
            return dessertName + " - €" + dessertPrice;
        }
    }
