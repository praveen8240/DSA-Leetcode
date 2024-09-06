class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for(int num:nums)s.add(num);
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while(head!=null){
            if(!s.contains(head.val)){
                temp.next=new ListNode(head.val);
                temp=temp.next;
            }
            head = head.next;
        }
        return ans.next;
    }
}