class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<String>();
        List<String> line = new ArrayList<String>();
        int totalLength = 0;
        int i = 0;

        while(i < words.length){
            // line completed - total length > maxWidth
            if(totalLength + line.size() + words[i].length() > maxWidth){
                int extraSpace = maxWidth - totalLength;
                int space = extraSpace / Math.max(1,line.size() - 1);
                int remainSpace = extraSpace % Math.max(1, line.size() - 1);

                for(int j = 0; j < Math.max(1, line.size() - 1); j++){
                    String s = line.get(j);
                    for(int k = 0; k < space; k++){
                        s += " ";
                    }
                    if(remainSpace > 0){
                        s += " ";
                        remainSpace -= 1;
                    }
                    line.set(j, s);
                }

                result.add(String.join("", line));
                line.clear();
                totalLength = 0;

            }

            // if line not completed
            line.add(words[i]);
            totalLength += words[i].length();
            i += 1;
        }

        // the last line
        String lastLine = String.join(" ", line);
        int lastLineSpace = maxWidth - lastLine.length();
        for(int n = 0; n < lastLineSpace; n++){
            lastLine += " ";
        }
        
        result.add(lastLine);

        return result;

    }
}

// Runtime : 2ms - Beats: 44.04%
// Memory : 41.99MB - Beats: 21.60%
// Link submission: https://leetcode.com/problems/text-justification/submissions/1160351878