public class palindrome {
    public static void main(String[] args) {
        String s = "hey , there";
        s = s.replaceAll("\\s", "");
        s = s.replace(",", "");
        System.out.println(s);
    }
}
