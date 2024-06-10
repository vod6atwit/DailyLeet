class Solution {
    public String parseTernary(String expression) {
        return solve(expression, 0, expression.length() - 1);
    }

    private String solve(String expression, int i, int j){
        // base case , return if there is no more expression
        if(i == j){
            return expression.substring(i, i+1);
        }

        int questionMarkIndex = i;
        while(expression.charAt(questionMarkIndex) != '?'){
            questionMarkIndex++;
        }

        int colonIndex = questionMarkIndex + 1;
        int count = 1;
        while(count != 0){
            if(expression.charAt(colonIndex) == '?'){
                count++;
            }else if(expression.charAt(colonIndex) == ':'){
                count--;
            }
            colonIndex++;
        }

        if(expression.charAt(i) == 'T'){
            return solve(expression, questionMarkIndex + 1, colonIndex - 2);
        }else{
            return solve(expression, colonIndex, j);
        }

    }
}