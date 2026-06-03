/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //create a dummy node
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int n1=0;
            int n2=0;
            //check if list1 has node or not
            if(l1!=null){
                n1=l1.val;
                l1=l1.next;
            }else{
                n1=0;
            }
            //check if list2 has node or not 
            if(l2!=null){
                n2=l2.val;
                l2=l2.next;
            }else{
                n2=0;
            }

            int sum=n1+n2+carry;
            int digit=sum % 10;
            carry=sum/10;

            curr.next=new ListNode(digit);
            curr=curr.next;
            
        }
        return dummy.next;
    }
}
