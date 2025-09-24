package Declaring_ArrayLists;

import java.util.ArrayList;

public class RecommendationBookManager {

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> recommendations = new ArrayList<>();
        recommendations.add(new Book("Effective Java", "Joshua Bloch"));
        recommendations.add(new Book("Clean Code", "Robert C. Martin"));
        recommendations.add(new Book("Java Concurrency", "Brian Goetz"));

        recommendations.add(new Book("The Programmer", "Andrew"));
        recommendations.add(new Book("Design Patterns", "Erich"));
        recommendations.add(new Book("Refactoring", "Martin"));
        System.out.println("Recommendations after adding new books:");
        System.out.println("\t" + recommendations);

        recommendations.set(1, new Book("Clean Code", "Robert C"));
        recommendations.set(2, new Book("Java Concurrency", "Brian"));
        System.out.println("Recommendations after updating some books:");
        System.out.println("\t" + recommendations);

        recommendations.remove(0);
        // Remove the 4th element of the initial ArrayList.
        // Pay attention as the initial 4th element is now the 3rd one as previous instruction updates the ArrayList.
        recommendations.remove(2);
        System.out.println("Recommendations after removing some books:");
        System.out.println("\t" + recommendations);
    }
}
