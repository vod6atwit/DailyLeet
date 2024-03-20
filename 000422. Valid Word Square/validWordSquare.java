class Solution {
    public boolean validWordSquare(List<String> words) {
        // int row = 0;
        int col = 0;
        for(String s : words){
            for(int row = 0; row < s.length(); row++){
                // System.out.println(words.get(row).charAt(col));
                if(row >= words.size() || col >= words.get(row).length() || s.charAt(row) != words.get(row).charAt(col)) {
                    return false;  
                }
            }
            col++;
        }

        return true;
    }
}

// dt


// ["abcd","bnrt","crm","dt"]
//  ball
//  asee
//  let
//  lep