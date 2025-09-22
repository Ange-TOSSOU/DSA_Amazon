package Manipulating_Arrays;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        // Let's populate the students array.
        students[0] = new Student(1, "John", 19);
        students[1] = new Student(2, "Mary", 15);
        students[2] = new Student(3, "Krish", 16);
        students[3] = new Student(4, "Sara", 21);
        students[4] = new Student(5, "Harry", 20);

        removeElement(4, students);

        addElement(new Student(6, "shally", 3), students);

        updateElement(2, students);

    }

    public static void removeElement(int indexToDelete, Student[] originalArray) {
        // Be sure the indexToDelete is a valid index.
        if (indexToDelete < 0 || indexToDelete >= originalArray.length) {
            return;
        }
        System.out.println("Remove element at " + indexToDelete);

        // Copy all data from the originalArray except the one to delete.
        Student[] newArray = new Student[originalArray.length - 1];
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            // Skip the indexToDelete data.
            if (i == indexToDelete) {
                continue;
            }

            newArray[j++] = originalArray[i];
        }

        printArray("Remove", newArray);
    }

    public static void addElement(Student newStudent, Student[] originalArray) {
        // Be sure the newStudent has been created.
        if (newStudent == null) {
            return;
        }
        System.out.println("Add new student rollNumber: " + newStudent.getRollNumber() +
                ", Name: " + newStudent.getName() +
                ", Age: " + newStudent.getAge());

        // Copy all data from the originalArray, then add the newStudent at the end.
        Student[] newArray = new Student[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = newStudent;

        printArray("Add", newArray);
    }

    public static void updateElement(int indexToUpdate, Student[] originalArray) {
        // Be sure the indexToUpdate is a valid index.
        if (indexToUpdate < 0 || indexToUpdate >= originalArray.length) {
            return;
        }
        System.out.println("Update an element at index " + indexToUpdate);

        originalArray[indexToUpdate].setAge(20);

        printArray("Update", originalArray);
    }

    public static void printArray(String message, Student[] students) {
        switch (message) {
            case "Remove":
            case "Add":
            case "Update":
                System.out.println("Operation:" + message);
                break;
            default:
                System.out.println("Unknown operation.");
                break;
        }

        for (Student student : students) {
            System.out.println("Student Name : " + student.getName());
        }
    }

}
