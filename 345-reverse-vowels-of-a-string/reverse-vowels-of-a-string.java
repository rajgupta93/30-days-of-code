class Solution {
    public String reverseVowels(String s) {
     Map<Character,Integer>map = new TreeMap<>();
    int start = 0, end = s.length() - 1;
    char[] chars = s.toCharArray();
    
while (start < end){
if (!isVowel(s.charAt(start))) {
    start++;
}
else if (!isVowel(s.charAt(end))) {
    end--;
}else {
    char temp = chars[start];
    chars[start] =  chars[end];
    chars[end] = temp;
    start++;
    end--;
} 

   
}
 return String.valueOf(chars);
}
        
public boolean isVowel(char c) {
    
    c = Character.toLowerCase(c);
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
        return true;
    return false;

}

    
}