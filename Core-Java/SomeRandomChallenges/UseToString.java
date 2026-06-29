public class UseToString {
    String name;
    int age ;

    public UseToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UseToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        UseToString uts = new UseToString("Deekesh" , 23);
        System.out.println(uts);
    }
}
