class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(sb.length() > 0){
                char ch1 = sb.charAt(sb.length() - 1);
                char ch2 = s.charAt(i);
                if(Character.isLowerCase(ch1) || Character.isLowerCase(ch2)){
                if(Character.toUpperCase(ch1) == ch2 || Character.toUpperCase(ch2) == ch1 )
                   sb.deleteCharAt(sb.length() - 1);
                else sb.append(ch2);
                }   else sb.append(ch2);
            }
            else sb.append(s.charAt(i));
   
            }
        return sb.toString();
    }
}
