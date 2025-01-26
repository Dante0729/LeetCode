class Solution {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return \\;
        }

        List<String> list = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        
        for (char c : s.toCharArray()) {
            if (c != ' ') { 
                curr.append(c);
            } else if (curr.length() > 0) { 
                list.add(curr.toString());
                curr.setLength(0); 
            }
        }

        
        if (curr.length() > 0) {
            list.add(curr.toString());
        }

        
        curr.setLength(0);
        for (int i = list.size() - 1; i >= 0; i--) {
            curr.append(list.get(i));
            if (i != 0) {
                curr.append(\ \); 
            }
        }

        return curr.toString();
    }
}
