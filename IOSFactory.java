class IOSFactory {
    IOS getIOSPhone(String platform){
        switch (platform){
            case "Iphone":
                return new Iphone("Iphone Xs Max",12);
            default:
                return null;
        }
    }
}