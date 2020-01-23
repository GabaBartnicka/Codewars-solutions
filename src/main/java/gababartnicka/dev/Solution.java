package gababartnicka.dev;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static List<String> top3(String s) {
        final String regex = "\\s|:|;|_|-|!|\\.|,|/|\\?+";
        return Arrays.stream(s.split(regex))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .map(Map.Entry::getKey)
                .map(String::toLowerCase)
                .map(w -> w.replaceAll("[^a-zA-Z']", ""))
                .filter(w -> !w.isEmpty())
                .filter(w -> w.matches("^.*[a-zA-Z]+.*$"))
                .limit(3)
                .collect(Collectors.toList());
    }

    /*
    final static private Pattern P = Pattern.compile("[a-z][a-z']*");

    public static List<String> top3(String s) {

        Map<String,Integer> cnt = new HashMap<>();
        Matcher m = P.matcher(s.toLowerCase());
        while (m.find()) {
            cnt.put(m.group(), cnt.getOrDefault(m.group(), 0)+1);
        }
        return cnt.entrySet().stream().sorted(TopWords::compare)
                  .limit(3).map(Map.Entry::getKey).collect(toList());
    }

    private static int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b) {
        int u = a.getValue(), v = b.getValue();
        return -Integer.compare(u,v);
    }
     */
}