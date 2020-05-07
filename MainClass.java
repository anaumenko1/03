public class MainClass {

    private String class_string = "Hello, world";

    public String getClassString() {
        System.out.println(class_string);
        return class_string;

    }


    public static void main(String[] args) {

        MainClass app = new MainClass();

        app.getClassString();

    }
}
