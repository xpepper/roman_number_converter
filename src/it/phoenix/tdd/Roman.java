package it.phoenix.tdd;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Roman {

  private static final SortedMap<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
    public int compare(Integer o1, Integer o2) {
      return o2 - o1;
    }
  });

  static {
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
  }

  private int decimal;

  public Roman(int numberToConvert) {
    this.decimal = numberToConvert;
  }

  @Override
  public String toString() {
    if (map.containsKey(decimal))
      return map.get(decimal);

    for (int key : map.keySet()) {
      if (decimal > key)
        return new Roman(key).toString() + new Roman(decimal - key).toString();
    }

    return "";
  }

}
