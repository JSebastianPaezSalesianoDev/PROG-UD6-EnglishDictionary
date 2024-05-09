package net.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    
      static private Map<String, Set<String>> dictionary = new HashMap<>();

      public static Map<String, Set<String>> getMapa() {
            return Dictionary.dictionary;
      }

      public static void setMapa(Map<String, Set<String>> mapa) {
            Dictionary.dictionary = mapa;
      }

      public static void addSet(String initial, Set<String> setWords) {
            dictionary.put(initial, setWords);
      }

      @Override
      public String toString() {
            return "Dictionary [mapa=" + Dictionary.dictionary + "]";
      }
}
