package Splitwise;

import java.util.*;

class BalanceSheet {

    Map<String, Map<String, Double>> balance = new HashMap<>();

    public void addBalance(String from, String to, double amount) {

        balance.putIfAbsent(from, new HashMap<>());
        balance.putIfAbsent(to, new HashMap<>());

        balance.get(from).put(to,
                balance.get(from).getOrDefault(to, 0.0) + amount);

        balance.get(to).put(from,
                balance.get(to).getOrDefault(from, 0.0) - amount);
    }

    public void showBalance(String user) {
        System.out.println(balance.get(user));
    }
}
