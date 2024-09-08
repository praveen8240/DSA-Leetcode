class Solution {
    List<String> l = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        helper(s, new HashSet<>(wordDict), "", 0, 1);
        return l;
    }
    void helper(String s, HashSet<String> dict, String temp, int start, int end) {
        if (end == s.length()) {
            if (dict.contains(s.substring(start, end))) {
                l.add(temp + s.substring(start, end));
            }
            return;
        }
        if (dict.contains(s.substring(start, end))) {
            helper(s, dict, temp + s.substring(start, end) + " ", end, end + 1);
        }
        helper(s, dict, temp, start, end + 1);
    }
}