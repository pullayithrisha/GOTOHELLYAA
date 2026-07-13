class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else if (c == '*') {
                // Treat * as ')' (minOpen decreases)
                minOpen--;
                // Treat * as '(' (maxOpen increases)
                maxOpen++;
            }
            
            // If maxOpen is negative, we have too many ')'
            if (maxOpen < 0) return false;
            
            // minOpen cannot be negative; reset to 0
            if (minOpen < 0) minOpen = 0;
        }
        
        // If minOpen is 0, all '(' were balanced
        return minOpen == 0;
    }
}