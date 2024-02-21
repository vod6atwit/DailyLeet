class FileSystem {
    Map <String, Integer> paths;

    public FileSystem() {
        this.paths = new HashMap<>();
    }

    public boolean createPath(String path, int value) {
        if(path.length() == 0 || path.equals("/") || this.paths.containsKey(path)){
            return false;
        }
        int lastFile = path.lastIndexOf("/");
        String parent = path.substring(0, lastFile);


        if(parent.length() > 1 && !this.paths.containsKey(parent)){
            return false;
        }
        this.paths.put(path, value);
        return true;
    }

    public int get(String path) {
        return this.paths.get(path) == null ? -1 : this.paths.get(path);
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */


// Runtime : 78ms - Beats: 98.16%
// Memory : 55.60MB - Beats: 59.73%
// Link submission: https://leetcode.com/problems/design-file-system/submissions/1181448584/