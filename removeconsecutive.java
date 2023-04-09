import java.util.Stack;

public class removeconsecutive {
    public String remove_cons(String str){
        int n = str.length();
        int i = 0;
        char[] ch = str.toCharArray();
        Stack <Character> st = new Stack();
        while(i<n){
            if(st.isEmpty() || st.peek()!=str.charAt(i)){
                st.push(ch[i]);
            }else{
                st.pop();
                i++;
            }
        }

        String ans = "";
        while(!st.isEmpty()){
            char ele = st.peek();
            st.pop();
            ans = ans + ele;
        }

        
        return ans;
    }
}
