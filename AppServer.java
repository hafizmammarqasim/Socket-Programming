import java.util.Scanner;

public class AppServer {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();
        Scanner myInput = new Scanner(System.in);

        Message sentmsg = null;

        while (true) {

            System.out.println("Choose which function you want to perform:");
            System.out.println("1. Send Message");
            System.out.println("2. Receive Message");
            System.out.println("3. Reply a user");
            System.out.println("4. Display Messages of All Contacts");
            System.out.println("5. Search Specific Message");
            System.out.println("6. Display Messages of Specific Contact");
            System.out.println("7. Delete Message");
            System.out.println("9. Exit");
            int choice = myInput.nextInt();
            myInput.nextLine();

            switch (choice) {
                case 1:
                    sentmsg = inbox.addUser();
                    break;

                case 2:
                    if(sentmsg != null){
                        inbox.receiveMessage(sentmsg);
                        break;
                    } else {
                        System.out.println("No Message available");
                    }

                case 3:
                    inbox.replyMessage();
                    break;

                case 4:
                    inbox.displayAllMessages();
                    break;

                case 5:
                    inbox.choiceForSearch();
                    break;

                case 6:
                    inbox.specificContactMsgs();
                    break;

                case 7:
                    inbox.deleteMessage();
                    break;

                case 9:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Try Again");
                    break;
            }
        }

    }
}