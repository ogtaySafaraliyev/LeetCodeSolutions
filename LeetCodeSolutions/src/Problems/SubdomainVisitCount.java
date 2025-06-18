package Problems;

import java.util.*;

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hshMap = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] pair = cpdomains[i].split(" ");
            int firstPart = Integer.valueOf(pair[0]);

            String secondPart = pair[1];
            for (int j = 0; j < secondPart.length(); j++) {
                if (j == 0 || secondPart.charAt(j) == '.') {
                    String subdomain = secondPart.substring(j == 0 ? 0 : j + 1);
                    hshMap.put(subdomain, (hshMap.getOrDefault(subdomain, 0) + firstPart));
                }
            }

        }
        List<String> list = new ArrayList<>();
        for (var entry : hshMap.entrySet()) {
            list.add(entry.getValue() + " " + entry.getKey());
        }

        return list;
    }
}
