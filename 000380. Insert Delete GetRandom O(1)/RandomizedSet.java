class RandomizedSet {
  Set<Integer> s;

  public RandomizedSet() {
    s = new HashSet<>();
  }

  public boolean insert(int val) {
    return s.add(val);
  }

  public boolean remove(int val) {
    return s.remove(val);
  }

  public int getRandom() {
    int random = (int) ((Math.random() * (s.size() - 0)) + 0);
    List<Integer> list = new ArrayList<>(s);
    return list.get(random);
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

// Runtime : 110 ms - Beats: 25.60%
// Memory : 90.52 MB - Beats: 48.05%
// Link submission:
// https://leetcode.com/problems/insert-delete-getrandom-o1/submissions/1071233762/