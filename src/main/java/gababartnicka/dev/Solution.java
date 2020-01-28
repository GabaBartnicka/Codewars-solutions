package gababartnicka.dev;

public class Solution {
    public static String rangeExtraction(int[] arr) {
        var sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            var element = arr[i];
            var next = "";

            int k = 1;
            int n = 0;
            for (int j = i + 1; j < arr.length; j++, k++) {
                if (arr[j] != element + k) {
                    break;
                } else {
                    next = String.valueOf(arr[j]);
                    n++;
                }
            }
            if (n > 1)
                i = i + (k - 1);

            if (next.isEmpty() || n <= 1) {
                sb.append(element).append(",");
            } else {
                sb.append(element).append("-").append(next).append(",");
            }
        }

        if (sb.charAt(sb.length() - 1) == ',')
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}