

class Node{
    int data;    // Instance variable (primitive type)
    Node next;  // Instance variable (reference type)
    
    Node(int data){
        this.data=data; // Assign parameter to instance variable
        this.next=null; // Initialize next to null
        
    }
  
}

class Linkedlist{
    Node head;
  
  //insert at begin
    
    void insertatbeg(int value){
          Node newnode= new Node(value);
        newnode.next=head;
        head=newnode;
    }
    
    //insert at tail
    void insertatend(int value){
    Node newnode = new Node(value);
    Node temp =head;
    
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;
    
    }
    //insertatmid
  void insertatmid(int value){
      
      if(head==null){
             head = new Node(value);
            return;
      }
    
    Node  slow=head;
      Node fast=head;
      Node prev=null;
      while ( fast!=null && fast.next!=null ){
          prev=slow;
          slow=slow.next;
          fast=fast.next.next;
      }
          // Insert before the middle node
         
      Node newnode = new Node(value);
      if(prev!=null){ // For lists with more than 1 node
          prev.next=newnode;
             newnode.next=slow;
      
      }
      else{               // If the list has only one node
          
             newnode.next=head;
             head=newnode;
      }
      
  
  }
  
  
    //delete
    void deletenode(int value){
        Node temp,prev;
        
        temp=head;
        prev=null;
        
        if(temp!=null && temp.data==value){
            head=temp.next;
            return;
        }
        
        while(temp != null && temp.data != value){
            prev=temp;
            temp=temp.next;
            
        }
        if(temp==null)return;
        prev.next= temp.next  ;                   // prev.next.next Potential NullPointerException
       
        
    } 
    
    
    //display 
    void display(){
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
     System.out.print("null");
    }
    
}




public class Main
{
	public static void main(String[] args) {
	  
		Linkedlist list=new Linkedlist();
		list.insertatbeg(10);
		list.insertatbeg(20);
		list.insertatbeg(30);
		list.insertatbeg(40);
		list.insertatbeg(50);
		
		
		list.insertatend(60) ; 
		list.display();
		list.insertatmid(03);
// 		list.deletenode(20);
		System.out.println();
		list.display();
		
	}
}

// -->like c++ Java does not pass variables by reference . head is a local variable inside the main method.
// -->When you pass head to a function, Java passes the value (memory address) of head, not the actual variable itself.
// -->Java does not pass variables by reference, meaning changes inside the function do not affect head in main unless we explicitly return the new head. 
// -->so that why if we declare head in main we need to Initialize it for updation of process head=  list.insertatbeg(10);

//int data; → This is a primitive variable (stores an integer value).

//Node next; → This is a reference variable (stores a reference to another Node object).
//next is not an int or String but instead a reference to another object of type Node.

//This is what makes a linked list possible—each node contains a pointer (next) to another node.
//this.next refers to the instance variable next of the current Node object.

//The reason we write Node next; with the same name as the class (Node) is because we are creating a reference to another object of the same class.