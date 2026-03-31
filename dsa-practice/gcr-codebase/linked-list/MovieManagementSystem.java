class FilmNode {
    String name;
    String maker;
    int releaseYear;
    double score;
    FilmNode next;
    FilmNode previous;

    FilmNode(String name, String maker, int releaseYear, double score) {
        this.name = name;
        this.maker = maker;
        this.releaseYear = releaseYear;
        this.score = score;
    }
}

class FilmLibrary {
    private FilmNode first;
    private FilmNode last;

    // Insert at start
    public void insertFirst(String name, String maker, int year, double score) {
        FilmNode node = new FilmNode(name, maker, year, score);

        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first.previous = node;
            first = node;
        }
        System.out.println("Film inserted at start");
    }

    // Insert at end
    public void insertLast(String name, String maker, int year, double score) {
        FilmNode node = new FilmNode(name, maker, year, score);

        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            node.previous = last;
            last = node;
        }
        System.out.println("Film inserted at end");
    }

    // Insert at given position (1-based)
    public void insertAt(int pos, String name, String maker, int year, double score) {
        if (pos <= 1) {
            insertFirst(name, maker, year, score);
            return;
        }

        FilmNode temp = first;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertLast(name, maker, year, score);
            return;
        }

        FilmNode node = new FilmNode(name, maker, year, score);
        node.next = temp.next;
        node.previous = temp;
        temp.next.previous = node;
        temp.next = node;

        System.out.println("Film inserted at position " + pos);
    }

    // Delete by film name
    public void deleteFilm(String name) {
        FilmNode temp = first;

        while (temp != null && !temp.name.equalsIgnoreCase(name)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Film not found");
            return;
        }

        if (temp == first) {
            first = first.next;
            if (first != null) first.previous = null;
        } else if (temp == last) {
            last = last.previous;
            last.next = null;
        } else {
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }

        System.out.println("Film deleted successfully");
    }

    // Find films by director
    public void findByDirector(String maker) {
        FilmNode temp = first;
        boolean exists = false;

        while (temp != null) {
            if (temp.maker.equalsIgnoreCase(maker)) {
                show(temp);
                exists = true;
            }
            temp = temp.next;
        }

        if (!exists)
            System.out.println("No films found for director: " + maker);
    }

    // Find films with minimum rating
    public void findByScore(double minScore) {
        FilmNode temp = first;
        boolean exists = false;

        while (temp != null) {
            if (temp.score >= minScore) {
                show(temp);
                exists = true;
            }
            temp = temp.next;
        }

        if (!exists)
            System.out.println("No films with rating >= " + minScore);
    }

    // Update rating
    public void modifyRating(String name, double newScore) {
        FilmNode temp = first;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                temp.score = newScore;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Film not found");
    }

    // Display forward
    public void showForward() {
        if (first == null) {
            System.out.println("Library is empty");
            return;
        }

        FilmNode temp = first;
        while (temp != null) {
            show(temp);
            temp = temp.next;
        }
    }

    // Display backward
    public void showBackward() {
        if (last == null) {
            System.out.println("Library is empty");
            return;
        }

        FilmNode temp = last;
        while (temp != null) {
            show(temp);
            temp = temp.previous;
        }
    }

    private void show(FilmNode f) {
        System.out.println(
            "Film: " + f.name +
            ", Director: " + f.maker +
            ", Year: " + f.releaseYear +
            ", Rating: " + f.score
        );
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {

        FilmLibrary library = new FilmLibrary();

        library.insertFirst("Inception", "Nolan", 2010, 8.8);
        library.insertLast("Interstellar", "Nolan", 2014, 8.6);
        library.insertLast("Avatar", "Cameron", 2009, 7.8);

        System.out.println("\nFilms (Forward):");
        library.showForward();

        System.out.println("\nFilms (Reverse):");
        library.showBackward();

        System.out.println("\nSearch by Director:");
        library.findByDirector("Nolan");

        System.out.println("\nUpdate Rating:");
        library.modifyRating("Avatar", 8.0);

        System.out.println("\nDelete Film:");
        library.deleteFilm("Interstellar");

        System.out.println("\nFinal Film List:");
        library.showForward();
    }
}
