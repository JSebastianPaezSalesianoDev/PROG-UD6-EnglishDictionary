package net.storage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Dictionary {

      private Map<String, Set<String>> dictionary = new HashMap<>();

      public Map<String, Set<String>> getMapa() {
            return this.dictionary;
      }

      public void setMapa(Map<String, Set<String>> mapa) {
            this.dictionary = mapa;
      }

      public void addSet(String initial, Set<String> setWords) {
            dictionary.put(initial, setWords);
      }

      public void addWord(String word) {
            word = JOptionPane.showInputDialog(null, "Ingrese la palabra que desea agregar al diccionario");
            word = word.trim().toLowerCase();
            String firstLetter = word.substring(0, 1);
            if (!dictionary.containsKey(firstLetter)) {

                  dictionary.put(firstLetter, new HashSet<>());
            } else {

                  dictionary.get(firstLetter).add(word);
                  JOptionPane.showMessageDialog(null, "Palabra ingresada con exito");
            }

      }

      public void removeWord(String word) {

            word = word.trim().toLowerCase();
            String firstLetter = word.substring(0, 1);
            Set<String> wordsFirstLetter = dictionary.get(firstLetter);
            if (wordsFirstLetter != null) {
                  wordsFirstLetter.remove(word);
            } else {
                  JOptionPane.showInputDialog(null, "Palabra no encontrada");
            }

      }

      public boolean wordChecker(String word) {

            word = JOptionPane.showInputDialog(null, "Ingrese la palabra que desea verificar");
            word = word.trim().toLowerCase();
            String firstLetter = word.substring(0, 1);

            Set<String> wordsFirstLetter = dictionary.get(firstLetter);
            if (wordsFirstLetter.contains(word) && wordsFirstLetter != null) {
                  
            }

            return wordsFirstLetter.contains(word) && wordsFirstLetter != null;
      }

      public Set<String> valuesKeys() {
            return dictionary.keySet();
      }

      public void showEachValueAndKey(String firstLetter) {

            firstLetter = firstLetter.trim().toLowerCase();
            Set<String> wordsFirstLetter = dictionary.get(firstLetter);
            if (wordsFirstLetter != null) {
                  JOptionPane.showMessageDialog(null, "Palabras que empiezan por " + firstLetter + "Son: \n");
                  for (String word : wordsFirstLetter) {
                        JOptionPane.showMessageDialog(null, "-" +word + "\n");
                  }
            } else {
                  JOptionPane.showMessageDialog(null, "No hay palabras que empiecen con '" + firstLetter);
              }
      }

      @Override
      public String toString() {
            return "Dictionary [mapa=" + this.dictionary + "]";
      }
}
