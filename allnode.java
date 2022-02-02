//Print all nodes separated with space.
import java.util.*;
class node
{
    
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        
    }
}
public class allnode
{
    node head;
    public void insertAtEnd(int data)
    {
        node n=new node(data);
        if(head ==null)
        {
            head=n;
        }
        else
        {
            node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void printm()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int mum=sc.nextInt();
        
        for(int i=0;i<mum;i++)
        {
            int num=sc.nextInt();
            obj.insertAtBeg(num);
            
        }
        
        obj.printm();
        
    }
}
