package leetcode;

//Implement strStr().
//
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Update (2014-11-02):
//The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.

public class Strstr {

	public static void main(String[] args) {

	}

	public int strStr(String haystack, String needle) {
		 int hLen = haystack.length();
	        int nLen = needle.length();
	        if(nLen == 0){
	            return 0;
	        }
			if( hLen < nLen){
	        	return -1;
	        }
	        if(hLen == nLen){
	            for(int i = 0;i<hLen;i++){
	                if(haystack.charAt(i) != needle.charAt(i)){
	                    return -1;
	                }
	            }
	            return 0;
	        }
			
			for(int i = 0;i<=hLen-nLen;i++){
				int j = i;
				int k = 0;
				while(k<nLen){
					if(haystack.charAt(j) == needle.charAt(k)){
					    j++;
				    	k++;
					}else{
	                    break;  				    
					}
				}
				if(k == nLen){
					return i;
				}
			}
			return -1;
    }
	
}
