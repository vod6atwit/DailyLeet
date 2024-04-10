class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }
        if (similarPairs.size() == 0) {
            return true;
        }
        int index = 0;
        while (index < sentence1.length) {
            if (sentence1[index].equals(sentence2[index])) {
                index++;
                continue;
            } else {
                List<String> list = new ArrayList<>();
                list.add(sentence1[index]);
                list.add(sentence2[index]);

                List<String> list1 = new ArrayList<>();
                list1.add(sentence2[index]);
                list1.add(sentence1[index]);

                if (similarPairs.contains(list) || similarPairs.contains(list1)) {
                    index++;
                    continue;
                }else{
                    return false;
                }
               
            }

        }
        return true;
    }
}