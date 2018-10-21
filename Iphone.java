public class Iphone extends IOS{

    Iphone(String modelNo,int iosVersion) {
        this.modelNo=modelNo;
        this.iosVersion=iosVersion;
    }

    @Override
    public void makeCall() {
        PrintMessage.print("Make Iphone call...");
    }

    @Override
    public void messaging() {
        PrintMessage.print("Sending message...");
    }

    @Override
    public void browseInternet() {
        PrintMessage.print("launching safari...");
    }

    @Override
    public void accessUniqueFeature() {
        scanFaceId();
    }

    @Override
    public void upgradeIOSVersion() {
        PrintMessage.print("Updating ios version...");
    }

    @Override
    public void installAppStoreApp() {
        PrintMessage.print("Installing apps from App Store...");
    }

    @Override
    public void showIosSpecs() {
        PrintMessage.print("Model No. : "+modelNo);
        PrintMessage.print("Ios Version : "+iosVersion);
    }

    private void scanFaceId(){
        PrintMessage.print("Scanning face, stay still...");
    }
}
