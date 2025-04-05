class Stackdt{
    int top=-1;
    int []stack;
    int size;
    
    Stackdt(int size){
        this.size=size;
        stack =new int[size];
    }
    
    void insertelement(int data){
        if(top==size-1){
            System.out.println("stack is full");
            return;
        }
        
        stack[++top]=data;
    }
    
    void deleteelement(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        
        top=top-1;
    }
    
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    
    
    
}


public class Stacka
{
	public static void main(String[] args) {
   Stackdt st= new Stackdt(4);
   st.insertelement(1);
   st.insertelement(2);
   st.insertelement(3);
   st.insertelement(4);
   st.display();
   st.deleteelement();
   st.display();
   
	}
}
