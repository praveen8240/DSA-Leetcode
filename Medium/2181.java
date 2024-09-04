class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;  
        ListNode ans = new ListNode();  
        ListNode current = ans;  
        int sum = 0;
        while (temp != null) {
            if (temp.val == 0) {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0; 
            } else {
                sum += temp.val; 
            }
            temp = temp.next; 
        }
        return ans.next;
    }
}
