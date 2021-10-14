package baseline;

import java.util.*;

public record CountInstance(Map<String, Integer> list) {
    //method that will count the instances per word
    public String[] counter() {
        //for storing the word and count in an array
        String[] word = new String[list.size()];
        Integer[] count = new Integer[list.size()];
        int k = 0;

        //will iterate through the hashmap
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            //will get the word
            word[k] = entry.getKey();
            //and its corresponding count
            count[k++] = entry.getValue();
        }
        //call the sort method and return its return value
        return sort(count, word);
    }

    private String[] sort(Integer[] count, String[] word) {
        //variables for storing a temporary values
        int[] temp = new int[list.size()];
        String[] tempWord = new String[list.size()];

        // duplicate count arrays to temp
        for (int i = 0; i < count.length; i++) {
            temp[i] = count[i];
        }

        //will sort the words according to the number of their occurrences
        Arrays.sort(count, Collections.reverseOrder());

        //iterate through the hashmap
        for (int i = 0; i < list.size(); i++) {
            //set the 'value' equals to 'count'
            int value = count[i];
            //iterate through the temp array
            for (int j = 0; j < temp.length; j++) {
                //if the value is equals to the temp
                if (value == temp[j]) {
                    //make tempWord equals to word
                    //will only duplicate the word
                    tempWord[i] = word[j];
                    break;
                }
            }
        }
        //return an array of string
        return tempWord;
    }
}
