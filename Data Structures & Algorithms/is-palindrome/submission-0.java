class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] sArray = s.toCharArray();
        char[] reversedArray = new char[sArray.length];


        int j = 0;
        for (int i = sArray.length - 1; i >= 0; i--) {
            reversedArray[j] = sArray[i];
            j++;
        }

        return Arrays.equals(sArray,reversedArray);

        

    }
}
