package chapterFour;
import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String format = """
                press 1 for Phonebook
                press 2 for Messages
                press 3 for Chat
                press 4 for Call register
                press 5 for Tones
                press 6 for Settings
                press 7 for Call divert
                press 8 for Games
                press 9 for Calculator
                press 10 for Reminders
                press 11 for Clock
                press 12 for Profiles
                press 13 for Sim services
                press 0 to exit
                """;
        System.out.println(format);
        System.out.println("Press any of the number on your screen");
        int number = input.nextInt();
        switch (number) {

            case 1:
                String phonebook = """
                        press 1 to search
                        press 2 for service nos
                        press 3 to add name
                        press 4 to erase
                        press 5 to edit
                        press 6 to assign tone
                        press 7 to send b'card
                        press 8 for options
                        press 9 for speed dials
                        press 10 for voice tags
                                """;
                System.out.println(phonebook);
                System.out.println("Select any of the numbers above to proceed");
                int book = input.nextInt();

                switch (book) {
                    case 1:
                        System.out.println("You are using the search box");
                        break;
                    case 2:
                        System.out.println("You are in for service nos");
                        break;
                    case 3:
                        System.out.println("You can add name now");
                        break;
                    case 4:
                        System.out.println("You can erase now");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                    case 8:
                        String options = """
                                Enter 1 for type of view
                                Enter 2 for message validity
                                """;

                        System.out.println("enter any of the number above to proceed");
                        int opt = input.nextInt();

                        switch (opt) {
                            case 1 -> System.out.println("You are in the type of view");
                            case 2 -> System.out.println("You want to check your memory status");
                            default -> System.out.println("You have to enter one");
                        }
                        break;
                    case 9:
                        System.out.println("Speed dials selected");
                        break;
                    case 10:
                        System.out.println("Voice tag selected");
                }
                break;
            case 2:
                String message = """
                        Press 1 to write message
                        Press 2 to check inbox
                        Press 3 to check outbox
                        Press 4 for picture messages
                        Press 5 for templates
                        Press 6 for smileys
                        Press 7 for message settings
                        Press 8 for info service 
                        Press 9 to check voice mail number
                        Press 10 to check service command editor
                                """;
                System.out.println(message);
                System.out.println("Select any of the numbers above to proceed");
                int messages = input.nextInt();

                switch (messages) {
                    case 1:
                        System.out.println("Now u can write your texts messages");
                        break;
                    case 2:
                        System.out.println("You have a message");
                        break;
                    case 3:
                        System.out.println("No message in outbox");
                    case 4:
                        System.out.println("Picture message");
                    case 5:
                        System.out.println("Templates are not available right now");
                    case 6:
                        System.out.println("LOL smileys only available");
                    case 7:
                        String setting = """
                                Enter 1 for Set 1
                                Enter 2 for Common
                                """;
                        System.out.println(setting);
                        System.out.println("Enter 1 of the number above");
                        int sett = input.nextInt();
                        switch (sett) {
                            case 1:
                                String settt = """
                                        Enter 1 for Message Centre Number
                                        Enter 2 for Message sent as
                                        Enter 3 for Message validity
                                        """;
                                System.out.println(settt);
                                System.out.println("Enter 1 of the above");
                                int setvv = input.nextInt();
                                switch (setvv) {
                                    case 1:
                                        System.out.println("This is the message centre number");
                                        break;
                                    case 2:
                                        System.out.println("Your message was sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity is ok");
                                    default:
                                        System.out.println("Enter 1 of the key biko");
                                }
                            case 2:
                                String settv = """
                                        Enter 1 to check delivery report
                                        Enter 2 to reply via same centre
                                        Enter 3 for character support
                                        """;
                                System.out.println(settv);
                                System.out.println("Enter 1 of the above");
                                int settvv = input.nextInt();
                                switch (settvv) {
                                    case 1 -> System.out.println("Message delivered");
                                    case 2 -> System.out.println("Replied via same centre");
                                    case 3 -> System.out.println("Check character support");
                                    default -> System.out.println("Enter 1 of the key biko");
                                }
                                break;
                            case 3:
                                System.out.println("Begin chatting with your loved ones");
                                break;
                            case 4:
                                String call = """
                                   Press 1 missed call
                                   Press 2 received call
                                   Press 3 dialled number
                                   Press 4 erase recent numbers
                                   Press 5 show call duration
                                   Press 6 show call costs
                                   Press 7 call cost settings
                                   Press 8 Prepaid credit
                                   """;
                                System.out.println(call);
                                System.out.println("Press 1 of the above keys");
                                int calls = input.nextInt();

                                switch (calls) {
                                    case 1 -> System.out.println("69 missed calls");
                                    case 2 -> System.out.println("1 received call");
                                    case 3 -> System.out.println("8 dialled numbers");
                                    case 4 -> System.out.println("Erase all calls");
                                    case 5 -> {
                                        String Duration = """
                                                Press 1 for Last call duration
                                                Press 2 for All calls duration
                                                Press 3 for Received calls duration
                                                Press 4 for Dialed calls duration
                                                Press 5 to Clear call timers
                                                """;
                                        System.out.println(Duration);
                                        System.out.println("Press 1 of the above keys");
                                        int durate = input.nextInt();
                                        switch (durate) {
                                            case 1:
                                                System.out.println("Last call duration is 1:30");
                                                break;
                                            case 2:
                                                System.out.println("All calls duration is 59:55");
                                                break;
                                            case 3:
                                                System.out.println("Received calls duration is 50:34");
                                                break;
                                            case 4:
                                                System.out.println("Dialed calls duration is 5:23");
                                                break;
                                            case 5:
                                                System.out.println("Clear calls timer");
                                                break;
                                            default:
                                                System.out.println("Select one biko");
                                        }
                                    }
                                    case 6 -> {
                                        String showcallcost = """
                                                Press 1 for last call cost
                                                Press 2 for All call cost
                                                Press 3 for Clear counters
                                                """;
                                        System.out.println(showcallcost);
                                        System.out.println("Press 1 of the keys above");
                                        int callcost = input.nextInt();
                                        switch (callcost) {
                                            case 1:
                                                System.out.println("Last call cost 5naira");
                                                break;
                                            case 2:
                                                System.out.println("All call cost 500naira");
                                                break;
                                            case 3:
                                                System.out.println("Clear counters");
                                                break;
                                            default:
                                                System.out.println("Go back to the beginning");
                                        }
                                    }
                                    case 7 -> {
                                        String callcostsettings = """
                                                Press 1 for Call cost limit
                                                Press 2 to Show cost in
                                                """;
                                        System.out.println(callcostsettings);
                                        System.out.println("Enter 1 of the above keys");
                                        int ccsettings = input.nextInt();
                                        switch (ccsettings) {
                                            case 1:
                                                System.out.println("Call cost limit is 22");
                                                break;
                                            case 2:
                                                System.out.println("Cost is in dollars");
                                                break;
                                            default:
                                                System.out.println("Select 1");
                                        }
                                    }
                                    case 8 -> System.out.println("Prepaid credit is allowed");
                                    default -> System.out.println("Start again");
                                }


                        }
                }
        }
    }
}


