/**
 * Created by Computer on 19/03/2022.
 */
public class LinkedQueue {

    public class LinkedQueue<E> implements Queue<E> {
        SinglyLinkedList<E> queue = new SinglyLinkedList();

        public LinkedQueue() {
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public int size() {
            return this.queue.size();
        }

        public E first() {
            return this.queue.first();
        }

        public void enqueue(E element) {
            this.queue.addLast(element);
        }

        public E dequeue() {
            return this.queue.removeFirst();
        }

        public void rotate() {

        }
    }
