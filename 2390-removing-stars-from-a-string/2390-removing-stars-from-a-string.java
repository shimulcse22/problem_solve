class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        int len = s.length();

        for(int i = 0; i<len ; i++){
            char c  = s.charAt(i);
            if(i>=0 && c == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}