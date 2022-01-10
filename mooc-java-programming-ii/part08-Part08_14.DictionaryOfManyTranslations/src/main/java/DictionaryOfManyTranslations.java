/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationDictioanry;
 
   public DictionaryOfManyTranslations() {
        this.translationDictioanry = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translationDictioanry.putIfAbsent(word, new ArrayList<>());

        this.translationDictioanry.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        
        ArrayList<String> emptyList = new ArrayList();
        return this.translationDictioanry.getOrDefault(word, emptyList);
    }

    public void remove(String word) {
        if (this.translationDictioanry.keySet().contains(word)) {
            this.translationDictioanry.remove(word);
        }
    }

}
