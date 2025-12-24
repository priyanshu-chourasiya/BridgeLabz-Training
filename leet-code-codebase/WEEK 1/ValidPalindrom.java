
// question : https://leetcode.com/problems/valid-palindrome/description/ 
// date : 24-12-2025

class ValidPalindrom {
    public boolean isPalindrome(String s) {

        //s = s.trim().toUpperCase().replace(" ", "").replace(",", "").replace(":","").replace(".","");
        //System.out.print(s);

        if(s.isEmpty()){
            return false;
        }

        s = s.toUpperCase().replaceAll("[^A-Za-z0-9]","");
        int st = 0, end = s.length() - 1;
        while(st < end){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st += 1;
            end -= 1;
        }
        return true;
    }
}
