class  Node {
    int data;
    Node next;

    Node (int data ){
        this.data=data;
        this.next=null;
        
    }
    
    
}


class circularlinkedlist{
    Node head;
    
    // insertatbeg
    void insertatbeg(int value){
        
        Node newnode= new Node(value);
        
        if(head==null){
             head=newnode;
             head.next=head;
             return;
             
        }
        Node temp=head;
        
        while(temp.next!=head){   //not  =null
            temp=temp.next;
        }
        
        newnode.next=head;
        temp.next=newnode;
        head=newnode;
        
    }
    
    // insertatend
    void insertatend(int value){
        Node newnode =new Node(value);
        
        if(head==null){
            head=newnode;
           
            head.next=head;
            return;
        }
        
        Node temp ;
        temp=head;
        
        while(temp.next!=head){    // make sure cheacking for head not for null otherwise it will go into infinite loop
            temp=temp.next;
        }
        
        temp.next=newnode;
        newnode.next=head;
        
    }
    
    
    
    //display function
      void display(){
       Node temp;
       
       temp=head;
       if(head==null){
           System.out.print("list is empty");
           return ;
       }
     
     do{
         System.out.print(temp.data+" ->");
         temp=temp.next;
   }while(temp!=head);
   
   System.out.print("pointing to head");

  
   

   
   
   
}

}



public class Main
{
	public static void main(String[] args) {
	circularlinkedlist cir = new circularlinkedlist();
	cir.insertatbeg(40);
	cir.insertatbeg(30);
	cir.insertatbeg(200);
	cir.insertatend(300);
	cir.display();
	
	}
}


