class Solution {
    public boolean isAdditiveNumber(String num) {
        int size = num.length();
        for(int i = 1; i < size - 1; i++){
            long n1 = Long.parseLong(num.substring(0, i));
            if(!Long.toString(n1).equals(num.substring(0, i))){
                break;
            }
            for(int j = i+1; j < size; j++){
                long n2 = Long.parseLong(num.substring(i, j));
                if(!Long.toString(n2).equals(num.substring(i, j))){
                    break;
                }
                boolean found = find(n1, n2, num.substring(j), false);
                if(found) return true;
            }
        }

        return false;
    }

    public boolean find(long n1, long n2, String str, boolean found){
        if(str.length() == 0 && found){
            return true;
        }
        long n = n1 + n2;
        String n_str = Long.toString(n);

        Integer index = Math.min(n_str.length(), str.length());
        if(str.substring(0, index).equals(n_str)){
            return find(n2, n, str.substring(index), true);
        }
        return false;
    }
}