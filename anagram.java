import java.util.Arrays;

public class anagram {
    public static boolean isanagram(String s, String t){
        int n = s.length();
        int m = t.length();
        if(m!=n){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "srajan";
        String t = "asranj";
        System.out.println(isanagram(s, t));
    }
}
