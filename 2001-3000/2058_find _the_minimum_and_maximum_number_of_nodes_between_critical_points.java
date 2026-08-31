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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head;
        int pos = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[2];

        while(temp.next.next != null){
            int prev = temp.val;
            temp = temp.next;
            pos++;
            int nxt = temp.next.val;

            if(temp.val < prev && temp.val < nxt){
                list.add(pos);
            }
            if(temp.val > prev && temp.val > nxt){
                list.add(pos);
            }

        }
        if(list.size() < 2){
            return new int[]{-1,-1};
        }
        result[1] = list.get(list.size()-1) - list.get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<list.size()-1; i++){
            if(min > list.get(i+1)-list.get(i)){
                min = list.get(i+1)-list.get(i);
            }
        }
        result[0] = min;
        return result;
    }
    
}
