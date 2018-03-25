package line;

public class MyLine 
{
    private int data[];
    private int last, head, amount;
    
    public MyLine(int size)
    {
        data = new int[size];
        last = 0;
        head = 0;
        amount = 0;
    }

    public void Enqueue(int value)
    {
        if(isFull()) return;
        amount++;
        data[last] = value;
        last = (last + 1) % data.length;
    }
    
    public void Dequeue()
    {
        if(isEmpty()) return;
        
//        for (int i = head; i < amount; i++) 
//        {
//            
//            data[i] = data[i + 1];
//        }
        amount--;
        head = (head + 1) % data.length;
    }
  
    //ints
    public int Next()
    {
        return data[head];
    }
    
    //bools
    public boolean isEmpty()
    {
        return (amount == 0);
    }
    
    public boolean isFull()
    {
        return (amount == data.length);
    }
    
    //Strings
    public String Show()
    {
        String s = " Line: ";
        
        int cont = 0;
        int pos = head;
        while(cont < amount)
        {
            s += (data[pos] + " ");
            cont++;
            pos = (pos + 1) % data.length;
        }
//        if(head < last)
//        {
//            for (int i = head; i < last - 1; i++) 
//            {
//                s += (data[i] + " ");
//            }
//        }        
//       else
//       {
//           int i = head;
//           while(i<data.length)
//           {
//               s += (data[i] + " ");
//               i++;
//           }
//           i = 0;
//           while(i < last)
//           {
//               s += (data[i] + " ");
//               i++;
//           }
//       }
//        
//        if(head > data.length - 1)
//        {
//            for(int i = 0; i < last - 1; i++)
//            {
//                s += (data[i] + " ");
//            }
//        }
        
        return s;
    }
    
}
