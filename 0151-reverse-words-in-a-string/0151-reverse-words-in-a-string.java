class Solution {
    public String reverseWords(String s) {
        String trimedString = s.trim();
        String[] arrstr = trimedString.split("\\s+");
        List<String> str = Arrays.asList(arrstr);
        Collections.reverse(str);
        return String.join(" ",str);

    }
}