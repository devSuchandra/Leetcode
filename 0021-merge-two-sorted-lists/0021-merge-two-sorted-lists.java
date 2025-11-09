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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            }else{
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            dummy.next = list1;
        }
        if(list2 != null){
            dummy.next = list2;
        }
        return ans.next;




/*
        //length of linkedList
        int count = 0;
        while(list1 != null){
            count++;
            list1 = list1.next
        }
        ------------------------------------------
        //middle point of a linkedlist
        ListNode fast = list1, slow = list1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

        ----------------------------------------
        //reverse a linked list
        //Anuj bhaiya
        ---------------------------------------
        //Find intersection point
*/
    }
    
}