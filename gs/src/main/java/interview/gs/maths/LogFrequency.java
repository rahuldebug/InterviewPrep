package interview.gs.maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogFrequency {

    public static void main(String[] args) {
        System.out.println(getMostFrequentIp(new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-24", "10.0.0.3 - GET 2020-08-24", "10.0.0.3 - GET 2020-08-24", "10.0.0.4 - GET 2020-08-24",}));
    }

    private static String getMostFrequentIp(String[] logs) {
        List<String> logIp = new ArrayList<>();
        Map<String, Integer> freqMap = new HashMap<>();
        Integer maxFreq = 0;
        String ipResult = " ";
        for (String log : logs) {
            String[] split = log.split(" ");
            logIp.add(split[0]);
        }
        for (String ip : logIp) {
            freqMap.put(ip, freqMap.getOrDefault(ip, 0) + 1);
        }
        for (String ip : freqMap.keySet()) {
            maxFreq = Math.max(maxFreq, freqMap.get(ip));
        }
        for (String ip : freqMap.keySet()) {
            if (freqMap.get(ip) == maxFreq) {
                ipResult = ip;
            }
        }
        return ipResult;
    }
}

