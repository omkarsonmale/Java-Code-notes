
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;  //this is optional
        this.prev=null; // this its optional
        
    }
}


class doublylinkedlist{
    Node head;
    //insert at beg
    void insertatbeg(int value){
        Node newnode= new Node(value);
        if(head==null){
         
            head=newnode;
        }
        else{
             newnode.next=head;
             head.prev=newnode;
             head=newnode;
        }
        
    }
    
    
    //insert at end 
    void insertatend(int value){
        Node temp;
        temp=head;
       Node newnode = new Node(value);
       
       if(head==null){
            head=newnode;
            return;
       }
       
       while(temp.next!=null){
           temp=temp.next;
       }
       
       temp.next=newnode;
       newnode.prev=temp;
       
     
   }
   
   //insertatmid
   void insertatmid(int value){
      Node prevv=null;
      Node slow=head;
      Node fast=head;
      Node newnode = new Node(value); 
      if(head==null){
          head=newnode;
          return;
      }
      else if(head.next==null){
          head.next=newnode;
          newnode.prev=head;
          return;
      }
      
      while(fast!=null&&fast.next!=null){
          prevv=slow;
          slow=slow.next;
          fast=fast.next.next;
      }
      
     
      prevv.next=newnode;
      newnode.prev=prevv;
      newnode.next=slow;
      
      slow.prev=newnode;
      
      
   }
   
   //delete Node
   
   void deletenode(int value){
       Node temp=head;
       
       while(temp!=null && temp.data!=value){
           temp=temp.next;
       }
       
       if(temp==null){
           return ; //value doesn't present;
           
       }
       
    if(temp.prev!=null){
         temp.prev.next = temp.next;
    }
    else{
        head=temp.next;
    }
    
       
     
      
       if(temp.next!=null){
            
           temp.next.prev=temp.prev;      //here addding temp.prev.next = temp.next; gives issue if i'm deleting head then
       }
       
       
       
       
    
       
       
   }
   
   //Display
   
   void Display(){
      Node temp;
      temp=head;
      
      while(temp!=null){
          System.out.print(temp.data + "<->");
          temp=temp.next;
          
      }
      System.out.print(" null");
      
   }
   
   
   
}



public class Doublylinkedlist
{
	public static void main(String[] args) {
		 doublylinkedlist dl = new doublylinkedlist();
		 dl.insertatbeg(10);
		 dl.insertatbeg(20);
		 dl.insertatbeg(30);
		 dl.insertatend(40);
		 dl.insertatend(50);
		 dl.insertatend(60);
		 dl.insertatmid(1);
		 dl.Display();
		 dl.deletenode(40);
		 System.out.println();
		 dl.Display();
	}
}


/*   

My logic code
   void deletenode(int value){
       Node temp=head;
       
       while(temp!=null && temp.data!=value){
           temp=temp.next;
       }
       
       if(temp==null){
           return ; //value doesn't present;
           
       }
       
       Node temp1;
       Node temp2;
       temp1=temp.prev;
       temp2=temp.next;
       temp1.next=temp2;
       temp2.prev=temp1;
       
       
   }
   */
