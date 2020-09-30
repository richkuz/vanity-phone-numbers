package com.example.vanity;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Constants
{
    public static final List<List<String>> LETTERS = new ArrayList<List<String>>();
    static {
      LETTERS.add(new ArrayList<>(Arrays.asList()));
      LETTERS.add(new ArrayList<>(Arrays.asList()));
      LETTERS.add(new ArrayList<>(Arrays.asList("a", "b", "c")));
      LETTERS.add(new ArrayList<>(Arrays.asList("d", "e", "f")));
      LETTERS.add(new ArrayList<>(Arrays.asList("g", "h", "i")));
      LETTERS.add(new ArrayList<>(Arrays.asList("j", "k", "l")));
      LETTERS.add(new ArrayList<>(Arrays.asList("m", "n", "o")));
      LETTERS.add(new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
      LETTERS.add(new ArrayList<>(Arrays.asList("t", "u", "v")));
      LETTERS.add(new ArrayList<>(Arrays.asList("w", "x", "y", "z")));
    };
    public static final Map<String, Integer> NUMBERS = new HashMap<String, Integer>();
    static {
      NUMBERS.put("a", 2);
      NUMBERS.put("b", 2);
      NUMBERS.put("c", 2);
      NUMBERS.put("d", 3);
      NUMBERS.put("e", 3);
      NUMBERS.put("f", 3);
      NUMBERS.put("g", 4);
      NUMBERS.put("h", 4);
      NUMBERS.put("i", 4);
      NUMBERS.put("j", 5);
      NUMBERS.put("k", 5);
      NUMBERS.put("l", 5);
      NUMBERS.put("m", 6);
      NUMBERS.put("n", 6);
      NUMBERS.put("o", 6);
      NUMBERS.put("p", 7);
      NUMBERS.put("q", 7);
      NUMBERS.put("r", 7);
      NUMBERS.put("s", 7);
      NUMBERS.put("t", 8);
      NUMBERS.put("u", 8);
      NUMBERS.put("v", 8);
      NUMBERS.put("w", 9);
      NUMBERS.put("x", 9);
      NUMBERS.put("y", 9);
      NUMBERS.put("z", 9);
    }
}
