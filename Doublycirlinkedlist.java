class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
        
    }
    
}
class doublycircularlinkedlist{
    Node head;
    
    // insertatbeg
    void insertatbeg(int value){
        Node newnode= new Node(value);
        
        if(head==null){
            head=newnode;
            head.next=newnode;
            head.prev=head;
            return;
        }
        
        Node tail=head.prev;
     
        newnode.next=head;
        newnode.prev=tail;
        tail.next=newnode;
        head.prev=newnode;
        head=newnode;
        
        
    }
    
    //insert at end
    void insertatend(int value){
     Node temp=head;
          Node newnode= new Node(value);
     if(head==null){
         head=newnode;
         head.next=head;
         head.prev=head;
         return;
     }
     while(temp.next!=head){
         temp=temp.next;
     }
     

     temp.next=newnode;
     newnode.prev=temp;
     newnode.next=head;
     head.prev=newnode;
     
     
    }
    
    
    void display(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        Node temp=head;
        System.out.print("points to tail <-> ");
        do{
           System.out.print(temp.data+ "<->"); 
           temp=temp.next;
        }while(temp!=head);
        System.out.print("points to head");
    }
}



public class Doublycirlinkedlist
{
	public static void main(String[] args) {
	doublycircularlinkedlist dlc = new doublycircularlinkedlist();
	dlc.insertatbeg(40);
	dlc.insertatbeg(30);
	dlc.insertatbeg(20);
	dlc.insertatbeg(10);
		dlc.insertatend((int)45.5);
	dlc.insertatend(50);

	dlc.display();
	
	}
}
