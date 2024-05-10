package net.storage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class DictionaryClass {

      private Map<String, Set<String>> dictionary;

      public DictionaryClass() {
            dictionary = new HashMap<>();
      }

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
                  JOptionPane.showMessageDialog(null, "Palabra ingresada con exito");
                  dictionary.put(firstLetter, new HashSet<>());
                  dictionary.get(firstLetter).add(word);
            } else {

                  dictionary.get(firstLetter).add(word);
                  JOptionPane.showMessageDialog(null, "Palabra ingresada con exito");
            }

      }

      public void removeWord(String word) {
            word = JOptionPane.showInputDialog(null, "Ingrese la palabra que quiere borrar");
            word = word.trim().toLowerCase();
            String firstLetter = word.substring(0, 1);
            Set<String> wordsFirstLetter = dictionary.get(firstLetter);
            if (wordsFirstLetter != null) {
                  wordsFirstLetter.remove(word);
                  JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente la palabra");
            } else {
                  JOptionPane.showMessageDialog(null, "Palabra no encontrada");
            }

      }

      public boolean wordChecker(String word) {

            word = JOptionPane.showInputDialog(null, "Ingrese la palabra que desea verificar");
            word = word.trim().toLowerCase();
            String firstLetter = word.substring(0, 1);

            Set<String> wordsFirstLetter = dictionary.get(firstLetter);

            return wordsFirstLetter.contains(word) && wordsFirstLetter != null;
      }

      public void valuesKeys() {
            JOptionPane.showMessageDialog(null, dictionary.keySet());
      }

      public void showWordsForKey(String word) {

            word = JOptionPane.showInputDialog(null,
                        "Ingrese la palabra inicial del grupo de palabras que desea ver con esa inicial");
            word = word.trim().toLowerCase();
            String firstLetter = word.substring(0, 1);
            Set<String> wordsFirstLetter = dictionary.get(firstLetter);
            if (wordsFirstLetter != null) {
                  StringBuilder message = new StringBuilder("Palabras que empiezan por ").append(firstLetter)
                              .append(" son:\n");
                  for (String wordie : wordsFirstLetter) {
                        message.append("- ").append(wordie).append("\n");
                  }
                  JOptionPane.showMessageDialog(null, message.toString());
            } else {
                  JOptionPane.showMessageDialog(null, "No hay palabras que empiecen con '" + firstLetter + "'");
            }
      }

      @Override
      public String toString() {
            return "Dictionary [mapa=" + this.dictionary + "]";
      }
}
