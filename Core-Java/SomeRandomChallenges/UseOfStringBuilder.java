public class UseOfStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Deekesh");
        sb.append(" Devendra");
        String str = sb.toString();
        System.out.println(str.toUpperCase());
    }
}
