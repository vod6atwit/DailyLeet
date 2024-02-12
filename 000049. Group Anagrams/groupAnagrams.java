class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> result = new HashMap<>();
        int[] myArray = new int[26];

        for(int i = 0; i < strs.length; i++){
            Arrays.fill(myArray, 0);
            //             for(int z : myArray){
            //     System.out.print(z + " ");
            // }
            // System.out.println("");
            for(int j = 0; j < strs[i].length(); j++){
                char c = strs[i].charAt(j);

                // System.out.println(myList.get(c-'a'));
                myArray[c-'a'] += 1;
            }

            // for(int z : myArray){
            //     System.out.print(z + " ");
            // }
            // System.out.println("");
            // result.put(myArray, strs[i]);
            // System.out.println(result.get(myArray));
            String s = Arrays.toString(myArray);
            // System.out.println(s);
            if(!result.containsKey(s)){
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                result.put(s,newList);
            }else{
                List<String> existingList = result.get(s);
                existingList.add(strs[i]);
                // System.out.println(result.get(s));
            }
            // System.out.println(result.get(s));
            // for (List<String> values : result.values()) {
            //     System.out.println(values);
            // }
        }

        List<List<String>> finalResult = new ArrayList<>();
        
        for (List<String> values : result.values()) {
            finalResult.add(values);
        }

        return finalResult;
    }
}

// Runtime : 20ms - Beats: 14.78%
// Memory : 47.76MB - Beats: 40.99%
// Link submission: https://leetcode.com/problems/group-anagrams/submissions/1173488065