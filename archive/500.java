class Solution {
    public String[] findWords(String[] words) {
        List<String> ret = new ArrayList<>();
        for (String word : words) {
            if (isInOneLine(word.toLowerCase())) ret.add(word);
        }
        String[] retArr = ret.toArray(new String[0]);// tricky point as List to array need a parameter so that return specific type not Obj[]
        return retArr;
    }

    private boolean isInOneLine(String word) {
        String st1 = "qwertyuiop";
        String st2 = "asdfghjkl";
        String st3 = "zxcvbnm";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);
        
        int flag = 0;
        if (word == null || word.isEmpty()) return false;
        char[] wordArr = word.toCharArray(); // String to char array
        if (isCharInString(wordArr[0],st1)) flag = 1;
        else if (isCharInString(wordArr[0],st2)) flag = 2;
        else if (isCharInString(wordArr[0],st3)) flag = 3;
        else return false;

        String st = map.get(flag);

        for (int i = 1; i < wordArr.length; i++) {
            if (!isCharInString(wordArr[i],st)) return false;
        }
        return true;
    }

    private boolean isCharInString(char c, String st) {
        if (st.indexOf(c) >= 0) return true;
        return false;
    }
}
