import java.util.Arrays;

class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
       longestCommonPrefix l1=new longestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};

        String prefix = l1.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + prefix);
    }
}
