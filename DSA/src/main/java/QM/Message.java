package QM;
public class Message {
    private String sendPerson;
    private String data;
    private String receivedPerson;
   
    public Message() {
        this.data= null;
    }
    
    public Message(String data) {
        this.data = data;
    }
    public Message(String sendPerson, String data, String receivedPerson) {
        this.sendPerson = sendPerson;
        this.data = data;
        this.receivedPerson = receivedPerson;
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRecivedPerson() {
        return receivedPerson;
    }

    public void setRecivedPerson(String recivedPerson) {
        this.receivedPerson = recivedPerson;
    }
  
}


