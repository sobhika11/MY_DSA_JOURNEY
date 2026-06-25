# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Linkedlist:
    def __init__(self):
        self.headNode=self.lastNode=None
        self.length=0
    def isEmpty(self):
        return self.headNode==None
    def addNode(self,val):
        nd=ListNode(val)
        if self.isEmpty():
            self.headNode=self.lastNode=nd
        else:
            self.lastNode.next=nd
            self.lastNode=nd
        self.length+=1
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        list3=Linkedlist()
        curr1,curr2=list1,list2
        while curr1!=None and curr2!=None:
            if curr1.val<=curr2.val:
                list3.addNode(curr1.val)
                curr1=curr1.next
            else:
                list3.addNode(curr2.val)
                curr2=curr2.next
        while curr1!=None:
                list3.addNode(curr1.val)
                curr1=curr1.next
        while curr2!=None:
                list3.addNode(curr2.val)
                curr2=curr2.next
        return list3.headNode

            
            
        
        