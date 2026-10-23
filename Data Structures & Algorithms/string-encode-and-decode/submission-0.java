
class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract the length
            int length = Integer.parseInt(str.substring(i, j));

            // Move past the delimiter
            i = j + 1;

            // Extract the original string
            res.add(str.substring(i, i + length));

            // Move to the next encoded string
            i = i + length;
        }

        return res;
    }
}
