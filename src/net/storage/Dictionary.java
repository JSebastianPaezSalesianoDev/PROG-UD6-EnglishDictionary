package net.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    
      static private Map<String, Set<String>> mapa = new HashMap<>();

      public static Map<String, Set<String>> getMapa() {
            return Dictionary.mapa;
      }

      public static void setMapa(Map<String, Set<String>> mapa) {
            Dictionary.mapa = mapa;
      }

      @Override
      public String toString() {
            return "Dictionary [mapa=" + mapa + "]";
      }
}
