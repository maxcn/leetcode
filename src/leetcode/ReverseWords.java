package leetcode;

public class ReverseWords {
	public String reverseWords(String s) {
        String[] words = s.split(" ");
        int length = words.length;
        String result = "";
        if(length > 0)
            result = words[length-1];
        for(int i = length-2;i >=0;i--){
            if(words[i].length() >0)
                result = result + " " + words[i] ;
        }
        return result;
    }
}
