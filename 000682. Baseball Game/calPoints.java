class Solution {
    public int calPoints(String[] operations) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < operations.length; i++){
            int length = result.size();
            if(operations[i].equals("+")){
                result.add(result.get(length - 1) + result.get(length - 2));
            }else if(operations[i].equals("D")){
                result.add(result.get(length - 1) * 2);
            }else if(operations[i].equals("C")){
                result.remove(result.get(length - 1));
            }else{
                int num = Integer.parseInt(operations[i]);
                result.add(num);
            }
        }

        int sum = 0;
        for(int i = 0; i < result.size(); i++){
            sum += result.get(i);
        }

        return sum;

    }
}