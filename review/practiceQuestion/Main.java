import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Bank {

    String item;
    double price;
    double rating;

    public Bank(String item, double price, double rating) {
        this.item = item;
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    // To print properly when using System.out.println(list)
    @Override
    public String toString() {
        return "Item=" + item + ", Price=" + price + ", Rating=" + rating;
    }
}

class Second {

    private List<Bank> ls;

    public Second() {
        ls = new ArrayList<>();
    }

    public void addItems(String item, double price, double rating) {
        ls.add(new Bank(item, price, rating));
    }

    public void removeItem(String item) {
        ls.removeIf(cc -> cc.item.equals(item));   // ✅ fixed
    }

    public double avgRating() {
        if (ls.isEmpty()) return 0;

        double avg = 0;                           // ✅ fixed
        for (Bank l : ls) {
            avg += l.rating;
        }
        return avg / ls.size();
    }

    public void showItems() {
        for (Bank s : ls) {
            System.out.println("Item -> " + s.item +
                               " | Price -> " + s.price +
                               " | Rating -> " + s.rating);
        }
    }

    // ✅ Correct Stream sorting
    public List<Bank> sortt() {
        return ls.stream()
                 .sorted(Comparator.comparing(Bank::getRating))
                 .collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {

        Second b = new Second();

        b.addItems("Burger", 136.79, 4.5);
        b.addItems("Pizza", 343.79, 4.3);
        b.addItems("Dorito", 345.79, 4.1);
        b.addItems("Chips", 123.79, 3.5);
        b.addItems("Chilli patato", 988.79, 1.5);

        System.out.println("Items after added:");
        b.showItems();

        b.removeItem("Chips");

        System.out.println("\nAfter removing:");
        b.showItems();

        System.out.println("\nAverage Rating: " + b.avgRating());

        System.out.println("\nAfter sorted on rating:");
        List<Bank> sortedList = b.sortt();
        System.out.println(sortedList);
    }
}