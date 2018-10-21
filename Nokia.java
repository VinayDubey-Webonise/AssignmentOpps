public class Nokia extends Android {

    public Nokia(String modelNo,int androidVersion) {
        this.modelNo=modelNo;
        this.androidVersion=androidVersion;
    }

    @Override
    public void upgradeAndroidVersion() {
        PrintMessage.print("Update in progress...");
    }

    @Override
    public void installPlaystoreApp() {
        PrintMessage.print("Installation in progress...");
    }

    @Override
    public void showAndroidSpecs() {
        PrintMessage.print("Model no. : "+modelNo);
        PrintMessage.print("Android version : "+androidVersion);
    }

    @Override
    public void makeCall() {
        PrintMessage.print("Nokia calling...");
    }

    @Override
    public void messaging() {
        PrintMessage.print("Nokia messaging...");
    }

    @Override
    public void browseInternet() {
        PrintMessage.print("Opening Chrome browser...");
    }

    @Override
    public void accessUniqueFeature() {
        launchBothi();
    }

    private void launchBothi(){
        PrintMessage.print("Capture dual images with bothi...");
    }
}
