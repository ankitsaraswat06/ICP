
public class Pallidrom234 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverse(head.next);
        ListNode temp=head.next;
        temp.next=head;
        head.next=null;
        return newhead;
    } 
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead= reverse(slow.next);
        ListNode first=head;
        ListNode last=newhead;
        while(last!=null){
            if(first.val!=last.val){
               
                return false;
            }
            first=first.next;
            last=last.next;
        }
      
        return true;
    }
}
