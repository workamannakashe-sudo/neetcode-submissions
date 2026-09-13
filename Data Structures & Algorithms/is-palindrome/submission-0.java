class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                rev += s.charAt(i);
            }
        }

        String original = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                original += s.charAt(i);
            }
        }

        return original.equals(rev);
    }
}
