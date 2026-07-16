
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode Head = null, ptr =null;
         if(list1 == null){ 
            return list2;
         }
         if(list2 == null){ 
            return list1;
         }
         
         while(list1 != null && list2 != null){
            if( Head == null){
                if(list1.val< list2.val){
                    ptr=Head=list1;
                    list1=list1.next;
                }
                else{
                    ptr=Head=list2;
                    list2=list2.next;

                }
                continue;
            }
             if(list1.val<list2.val){
                
              ptr.next=list1;
                ptr=list1;
                list1=list1.next;
             }
             else{
                 
                ptr.next=list2;
                ptr=list2;
                list2=list2.next;
             }

         }
         if(list1!=null){
            ptr.next=list1;
         }
         else{
            ptr.next=list2;
         }
         return Head;


    }
}