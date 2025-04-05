class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node head;
    
    void inserelement(int value){
        Node newnode= new Node(value);
        if(head==null){
            head=newnode;
            return;
        }
      
        newnode.next=head;
        head=newnode;
       
        
    }
    
            void deletelement(){
            if(head==null){
                System.out.print("Stack is empty");
                return;
            }
            
            head=head.next;
            
            
            
        }
        
        void disply(){
            if(head==null){
                System.out.println("Stack is empty");
                return;
            }
            
            Node temp= head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            
            
        }
        
        
}

public class Stackl
{
	public static void main(String[] args) {
	Stack st = new Stack();
	st.inserelement(10);
	st.inserelement(20);
	st.inserelement(30);
	st.inserelement(40);
	st.deletelement();
     st.disply(); 
	}
}
