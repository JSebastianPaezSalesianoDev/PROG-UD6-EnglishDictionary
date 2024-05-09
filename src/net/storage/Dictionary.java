package net.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    
      private Map<String, Set<String>> mapa = new HashMap<>();

      public Map<String, Set<String>> getMapa() {
            return this.mapa;
      }

      public void setMapa(Map<String, Set<String>> mapa) {
            this.mapa = mapa;
      }

      @Override
      public String toString() {
            return "Dictionary [mapa=" + mapa + "]";
      }
}
