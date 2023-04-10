public class longest_prefix {
    public String longestCommonPrefix(String strs) {
        for(int i=0 ; i<strs.length()-1;i++){
            
            char temp = strs.charAt(i) ; 
            char s = strs.charAt(i+1);
            String st = "";
            for(int j=0 ;j<s.size()  ; j++){
                if(temp.charAt(j) == s.charAt(j)){
                     st += s.charAt(j);
                    
                }else{
                    return st;
                }
            }
            
        }
        
        return st; 
    }
}
