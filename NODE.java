/**
 * Created by Computer on 19/03/2022.
 */
public class NODE {
    int data;
    NODE next;
    NODE(int d)
    {
        this.data=d ;
        this.next=null;
    }

    static class LinkedList
    {
        NODE start;
        LinkedList()
        {
            start=null;
        }
        public void push(int data)
        {
            if (this.start==null)
            {
                NODE temp = new NODE(data);
                this.start=temp;
            }
            else
            {
                NODE temp =new NODE(data);
                temp.next=this.start;
                this.start=temp;
            }
        }
        public int findSecandLaestNode(NODE ptr)
        {
            NODE temp = ptr;
            if (temp == null||temp.next == null)
                return -1;
            while (temp.next.next !=null)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        public static void main(String[] args) {
            LinkedList b = new LinkedList();
            b.push(12);
            b.push(29);
            b.push(11);
            b.push(23);
            b.push(8);
            System.out.println(b.findSecandLaestNode(b.start));


        }
    }
}

