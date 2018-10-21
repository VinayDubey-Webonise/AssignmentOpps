import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CellPhoneMain {

    private static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    private static int choice;
    public static void main(String args[]) throws IOException{

        PrintMessage.print("1. Android \n2.IOS \nEnter platform:");
        choice=Integer.parseInt(bufferedReader.readLine());

        switch (choice){
            case 1:
                getAndroid();
                break;
            case 2:
                getIOS();
                break;
                default:
                    PrintMessage.print("Invalid option");
        }

    }

    private static void getAndroid() throws IOException{
        AndroidFactory androidFactory=new AndroidFactory();
        Android android;

        PrintMessage.print("1. Nokia \n2.Samsung \nEnter brand:");
        choice=Integer.parseInt(bufferedReader.readLine());

        switch (choice){
            case 1:
                android=androidFactory.getAndroidPhone("Nokia");
                break;
            case 2:
                android=androidFactory.getAndroidPhone("Samsung");
                break;
            default:
                android=null;
        }

        PrintMessage.print("1. Make Call");
        PrintMessage.print("2. Send Message");
        PrintMessage.print("3. Browse Internet");
        PrintMessage.print("4. Access Unique Feature");
        PrintMessage.print("5. Upgrade Android Version");
        PrintMessage.print("6. Install Apps from Play Store");
        PrintMessage.print("7. Show Details");
        PrintMessage.print("Select feature:");

        choice=Integer.parseInt(bufferedReader.readLine());

        if(android!=null) {
            switch (choice) {
                case 1:
                    android.makeCall();
                    break;
                case 2:
                    android.messaging();
                    break;
                case 3:
                    android.browseInternet();
                    break;
                case 4:
                    android.accessUniqueFeature();
                    break;
                case 5:
                    android.upgradeAndroidVersion();
                    break;
                case 6:
                    android.installPlaystoreApp();
                    break;
                case 7:
                    android.showAndroidSpecs();
                    break;
                default:
                    PrintMessage.print("Invalid choice");
            }
        }else{
            PrintMessage.print("Opps something went wrong");
        }

    }

    private static void getIOS() throws IOException{
        IOSFactory iosFactory=new IOSFactory();
        IOS ios;

        PrintMessage.print("1. Iphone \nEnter brand:");
        choice=Integer.parseInt(bufferedReader.readLine());

        switch (choice){
            case 1:
                ios=iosFactory.getIOSPhone("Iphone");
                break;
            default:
                ios=null;
        }

        PrintMessage.print("1. Make Call");
        PrintMessage.print("2. Send Message");
        PrintMessage.print("3. Browse Internet");
        PrintMessage.print("4. Access Unique Feature");
        PrintMessage.print("5. Upgrade IOS Version");
        PrintMessage.print("6. Install Apps from App Store");
        PrintMessage.print("7. Show Details");
        PrintMessage.print("Select feature:");

        choice=Integer.parseInt(bufferedReader.readLine());

        if(ios!=null) {
            switch (choice) {
                case 1:
                    ios.makeCall();
                    break;
                case 2:
                    ios.messaging();
                    break;
                case 3:
                    ios.browseInternet();
                    break;
                case 4:
                    ios.accessUniqueFeature();
                    break;
                case 5:
                    ios.upgradeIOSVersion();
                    break;
                case 6:
                    ios.installAppStoreApp();
                    break;
                case 7:
                    ios.showIosSpecs();
                    break;
                default:
                    PrintMessage.print("Invalid choice");
            }
        }else{
            PrintMessage.print("Opps something went wrong");
        }

    }
}
