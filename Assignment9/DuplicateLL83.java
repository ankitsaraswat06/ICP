

public class DuplicateLL83 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        while(temp.next!=null && temp!=null ){
            if(temp.val==temp.next.val){
                ListNode check=temp.next;
                while(check!=null && temp.val==check.val ){
                    check=check.next;

                }
                temp.next=check;
               
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}
