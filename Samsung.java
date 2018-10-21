public class Samsung extends Android{

    Samsung(String modelNo, int androidVersion) {
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
        PrintMessage.print("Samsung calling...");
    }

    @Override
    public void messaging() {
        PrintMessage.print("Samsung messaging...");
    }

    @Override
    public void browseInternet() {
        PrintMessage.print("Opening Samsung browser...");
    }

    @Override
    public void accessUniqueFeature() {
        payUsingSamsungPay();
    }

    private void payUsingSamsungPay(){
        PrintMessage.print("Launching Samsung pay...");
    }
}
