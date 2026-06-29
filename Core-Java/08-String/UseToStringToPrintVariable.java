public class UseToStringToPrintVariable {
    String name;
    int age;

    public UseToStringToPrintVariable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UseToStringToPrintVariable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        UseToStringToPrintVariable   us = new UseToStringToPrintVariable(25,"Deekesh");
        System.out.println(us);
    }

}
