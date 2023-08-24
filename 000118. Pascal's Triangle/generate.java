class Solution {
  // public List<List<Integer>> generate(int numRows) {
  // // helper(0, 0)
  // // helper(1, 0,1)
  // // helper(2, 0,1,2)
  // // helper(3, 0,1,2,3)
  // // helper(4, 0,1,2,3,4)
  // List<List<Integer>> result = new ArrayList<>();

  // for(int i = 0; i < numRows; i++){
  // List<Integer> list = new ArrayList<>();

  // for(int j = 0; j <= i; j++){
  // int num = helper(i, j);
  // list.add(num);
  // }
  // result.add(list);
  // }

  // return result;

  // }
  // public int helper(int row, int index){
  // if(row == 0 || index == 0 || index == row){
  // return 1;
  // }
  // return helper(row - 1, index-1) + helper(row-1, index);
  // }

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> init = new ArrayList<>();

    init.add(1);
    result.add(init);

    if (numRows == 1) {
      return result;
    }

    for (int i = 0; i < numRows - 1; i++) {
      List<Integer> temp = new ArrayList<>();
      temp.add(0);
      temp.addAll(result.get(result.size() - 1)); // get the prev list and add on
      temp.add(0);

      List<Integer> list = new ArrayList<>();
      int length_prevList = result.get(result.size() - 1).size(); // get the size of the prev list

      for (int j = 0; j < length_prevList + 1; j++) {
        list.add(temp.get(j) + temp.get(j + 1));
      }
      result.add(list);
    }

    return result;
  }
}

// 1 3 3 1
// 1 4 6 4 1

// 6 : 4,2 = 3: 3,1 + 3: 3,2

// Runtime : 1 ms - Beats: 89.9%
// Memory : 40.4 MB - Beats: 99.37%
// Link submission:
// https://leetcode.com/problems/pascals-triangle/submissions/1030802604/