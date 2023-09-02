https://leetcode.com/problems/intersection-of-two-linked-lists/

class Solution {
    
    int getLength(ListNode* head)
    {
        int count = 0;
        while(head) {
            count++;
            head = head->next;
        }
        return count;
    }
    
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        
        while (lengthA > lengthB) {
            headA = headA->next;
            lengthA--;
        }

        while (lengthA < lengthB) {
            headB = headB->next;
            lengthB--;
        }
        
        while(headA!=NULL) {
            if(headA==headB) {
                return headA;
            }
            headA = headA->next;
            headB = headB->next;
        }
        
        return NULL;
    }
};