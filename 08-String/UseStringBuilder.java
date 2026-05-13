public class UseStringBuilder {
    public static void main(String[] args) {
        String [] str = {"Deekesh","Pushpendra","Devendra","Piyush","Harsh"};
        StringBuilder sb = new StringBuilder("Names are : ");
        for(String val : str)
        {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }
}
