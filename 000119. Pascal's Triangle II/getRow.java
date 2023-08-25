class Solution {
  // public List<Integer> getRow(int rowIndex) {
  // List<Integer> result = new ArrayList<>();

  // for (int i = 0; i <= rowIndex; i++) {
  // int num = helper(rowIndex, i);
  // result.add(num);
  // }

  // return result;
  // }

  // public int helper(int row, int index) {
  // if (row == 0 || index == 0 || index == row) {
  // return 1;
  // }
  // return helper(row - 1, index - 1) + helper(row - 1, index);
  // }

  // ---------------------------------

  // public List<Integer> getRow(int rowIndex) {
  // if(rowIndex == 0){
  // return new ArrayList<Integer>(){{add(1);}};
  // }
  // if(rowIndex == 1){
  // return new ArrayList<Integer>(){{add(1); add(1);}};
  // }

  // int index = 2;
  // List<Integer> result = new ArrayList<>();
  // result.add(1);
  // result.add(1);

  // while(index <= rowIndex){
  // List<Integer> temp = new ArrayList<>();
  // temp.addAll(result);
  // result.clear();
  // for(int i = 0; i < temp.size() + 1; i++){
  // if(i == 0){
  // result.add(1);
  // }else if(i == temp.size()){
  // result.add(1);
  // }else{
  // result.add(temp.get(i-1) + temp.get(i));
  // }
  // }
  // index++;
  // }

  // return result;
  // }

  // ---------------------------------

  public List<Integer> getRow(int rowIndex) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> init = new ArrayList<>();

    init.add(1);
    result.add(init);

    if (rowIndex == 0) {
      return result.get(0);
    }

    for (int i = 0; i < rowIndex; i++) {
      List<Integer> temp = new ArrayList<>();
      temp.add(0);
      temp.addAll(result.get(result.size() - 1)); // get the prev list and add on
      temp.add(0);

      List<Integer> list = new ArrayList<>();
      int length_prevList = result.get(result.size() - 1).size(); // get the size of the prev list

      for (int j = 0; j < length_prevList + 1; j++) {
        list.add(temp.get(j) + temp.get(j + 1));
      }
      result.clear();
      result.add(list);
    }

    return result.get(0);
  }
}

// Runtime : 2 ms - Beats: 18.28%
// Memory : 39.9 MB - Beats: 88.17%
// Link submission:
// https://leetcode.com/problems/pascals-triangle-ii/submissions/1031766796/