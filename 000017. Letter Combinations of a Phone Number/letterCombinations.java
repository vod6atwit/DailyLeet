class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if(digits.length() == 0){
            return res;
        }

        backtrack(0, "", digits, res, map);
        return res;
    }

    public void backtrack(int index, String curStr, String digits, List<String> res, Map<Character, String> map){
        if(curStr.length() == digits.length()){
            res.add(curStr);
            return;
        }
        char c = digits.charAt(index);
        for(int i = 0; i < map.get(c).length(); i++){
            backtrack(index+1, curStr + map.get(c).charAt(i), digits, res, map);
        }
    }
}