class AndroidFactory {
    Android getAndroidPhone(String platform){
        switch (platform){
            case "Nokia":
                return new Nokia("Nokia 6",8);
            case "Samsung":
                return new Samsung("Samsung S9",9);
            default:
                return null;
        }
    }
}
