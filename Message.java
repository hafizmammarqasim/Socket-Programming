import java.io.Serializable;

public class Message implements Serializable {
    private String messageId;
    private String senderName;
    private String message;
    private String receiverName;
    private int receiverId;
    private String reply;
    private static int idCounter=1;
    private int senderId;

    public Message(int senderId, String senderName, String message, int receiverId, String reply, String receiverName) {
        this.messageId = String.format("%03d",idCounter++);
        this.senderId = senderId;
        this.senderName = senderName;
        this.message = message;
        this.reply = reply;
        this.receiverName = receiverName;
        this.receiverId = receiverId;
    }

    public Message(Message sentMsg) {
        this.messageId = String.format("%03d",idCounter++);
        this.senderId = sentMsg.getSenderId();
        this.senderName = sentMsg.getSenderName();
        this.message = sentMsg.getMessage();
        this.reply = sentMsg.getReply();
        this.receiverName = sentMsg.getReceiverName();
        this.receiverId = sentMsg.getReceiverId();
    }

    public String getSenderName() {
        return senderName;
    }

    public void setMessageId(String messageId){
        this.messageId = messageId;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getSenderId(){
        return senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }



    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", senderName='" + senderName + '\'' +
                ", message='" + message + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverId='" + receiverId + '\'' +
                ", reply='" + reply + '\'' +
                '}';
    }
}