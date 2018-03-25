package line;


public class Line 
{

    
    public static void main(String[] args) 
    {
        MyLine line = new MyLine(3);
        
        line.Enqueue(1);
        line.Enqueue(2);
        line.Enqueue(3);
        line.Enqueue(4);
        
        System.out.println(line.isFull());
        
        line.Dequeue();
        line.Dequeue();
        
        line.Enqueue(1);
        line.Enqueue(2);
        
        line.Dequeue();
        
        line.Enqueue(3);
        
        System.out.println(line.Show());
    }
    
}
