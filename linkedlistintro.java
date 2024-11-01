import java.util.*;
class linkedlist{
    private int size;
    private Node head;
    private Node tail;
    public linkedlist(){
      this.size = 0;
    }
    
    //insert in the first
    
    public void insertFirst(int val){
      Node node = new Node(val);
      node.next = head;
      head = node;
      if(tail==null){
        tail=head;
      }
      size=size+1;
    }
    
    //displaying the linked list
    
    public void display(){
      Node temp = head;
      while(temp!=null){
          System.out.print(temp.value+"->");
          temp = temp.next;
      }
      System.out.print("END\n");
    }
    
    //insert in the end 
    
    public void insertEnd(int val){
      if(tail==null){
        insertFirst(val);
        return;
      }
          Node node = new Node(val);
          tail.next = node ;
          tail = node;
          size = size+1;
    }
    
    //insert in the linkedlist
    
    public void insert(int val , int index){
          if(index==0){
            insertFirst(val);
            return;
          }
          else if(index==size){
            insertEnd(val);
            return;
          }
          else{
              Node temp = head;
              for(int i=1;i<index;i++){
                  temp = temp.next;
              }
              Node node = new Node(val);
              node.next = temp.next;
              temp.next = node;
              size++;
          }
    }
    
    //delete in the first
    
    public void deleteFirst(){
        int  val = head.value;
        head = head.next;
        size--;
        return;
    }
    
     //delete in the last
     
     public void deleteEnd(){
        Node temp = head;
        if(head == tail){
            deleteFirst();
        }
        while(temp.next !=tail){
          temp = temp.next; 
        }
        int val = tail.value;
        temp.next=null;
        size--;
     }
     //delete in the middle
     
     public void delete(int index){
        if(index == 0){
            deleteFirst();return ;
        }
        if(index ==size-1){
          deleteEnd();return;
        }
        Node prev = get(index-1);
        prev.next = prev.next.next;
        size--;
     }
     
     //getting element 
     public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
          node = node.next;
        }
        return node;
     }
     //finding element
     public int find(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.value==val){
                System.out.println("VALUE FOUND:"+temp.value);
                return 0;
            }
            else{
                temp = temp.next;
            }
        }
        return 0;
     }
     
     //reverse print
     public void revprint(){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null){
          int a = temp.value;
          st.push(a);
          temp = temp.next;
        }
        System.out.println("REVERSE PRINT:");
        for(int i=st.size()-1 ;i>=0;i--){
          int b = st.pop();
          System.out.print(b+" ");
        }
     }
     
     //circular linked list
     public void cll(){
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      tail = temp;
      tail.next = head;
     }
     public void displaycll(){
        Node temp = head;
        System.out.println("CIRCULAR LINKED LIST:");
        while(temp.next!=head){
            int a = temp.value;
            System.out.print(a+" ");
            temp = temp.next;
        }
     }
     
    private class Node{
      private int value;
      private Node next;
    
    public Node(int val){
      this.value = val;
    }
    public Node(int val , Node next){
      this.value = val;
      this.next = next;
    }
    }
}
class linkedlistintro{
    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.insertFirst(15);
        ll.insertFirst(25);
        ll.insertFirst(35);
        ll.insertFirst(45);
        ll.insertFirst(55);
        ll.insertEnd(30);
        ll.insertEnd(20);
        ll.insert(46,0);
        ll.deleteFirst();
        ll.deleteEnd();
        ll.delete(2);
        ll.find(25);
        ll.display();
        ll.revprint();
        ll.cll();
        ll.displaycll();
    }
}
