package software.reuse.task2;

public class Main {
    public static void main(String[] args) {
        DataBox<String> nameBox = new DataBox<>("Hashi");
        DataBox<Integer> idBox = new DataBox<>(101);

        System.out.println("Student Name: " + nameBox.getValue());
        System.out.println("Student ID: " + idBox.getValue());

        // Compile-time safety demo: uncomment the next line.
        // NetBeans will show a red error: String cannot be converted to Integer.
        // DataBox<Integer> wrongBox = new DataBox<>("Hashi");
    }
}
