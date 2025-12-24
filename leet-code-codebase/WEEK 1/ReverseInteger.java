
// question : https://leetcode.com/problems/reverse-integer/description/
// date : 24-12-2025

class ReverseInteger {
    public int reverse(int x) {
        
        int rev = 0;
        boolean isnegative = x < 0;

        String stx = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(stx).reverse();

        try{
            rev = Integer.parseInt(sb.toString());
        }
        catch(Exception e){
            return 0;
        }
        return isnegative ? -rev : rev;
    }
}