package QM;
public class Queue {

    private int front;
    private int behind;
    private int size;
    private int weight;
    Message message[];
    
    public Queue(int weight){
        this.weight = weight;
        front = this.size = 0;
        behind = weight - 1;
        message = new Message[this.weight];
    }
    
    boolean isFull(Queue queue){
        return (queue.getSize() == queue.getWeight());
    }
    
    boolean isEmpty(Queue queue){
        return (queue.getSize() == 0);
    }
    
    void enqueue(Message item){
        if (isFull(this)){
            System.out.println("Queue is full message!");
            return;
        }            
        this.setRear((this.getBehind() + 1) % this.getWeight());
        this.message[this.getBehind()] = item;
        this.setSize(this.getSize() + 1);
        System.out.println("Equeue Successfully!");
    }
    Message dequeue(){
        if (isEmpty(this)){
            System.out.println("Queue has no messages!");
            return null;   
        }
        Message item = this.getMessage()[this.getFront()];
        this.setFront((this.getFront() + 1) % this.getWeight());
        this.setSize(this.getSize() - 1);
        System.out.println("Dequeue Successfully!");
        return item;      
        
    }
    
    void display(){
        int s;
        if (isEmpty(this)){
            System.out.println("No messages!");
            return;
            
        }
        System.out.println("-----------------------------");
        for(s=getFront(); s <= getBehind(); s++){
            System.out.println("Messages from " + getMessage()[s].getSendPerson() +" to "+getMessage()[s].getRecivedPerson()+ " and the message is:" + getMessage()[s].getData());
            
        }
        System.out.println("Show successful message");
    }

    /**
     * @return the front
     */
    public int getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(int front) {
        this.front = front;
    }

    /**
     * @return the rear
     */
    public int getBehind() {
        return behind;
    }

    /**
     * @param behind the rear to set
     */
    public void setRear(int behind) {
        this.behind = behind;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the capacity
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the capacity to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the message
     */
    public Message[] getMessage() {
        return message;
    }
}

