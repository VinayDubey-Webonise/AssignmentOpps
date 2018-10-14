import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

interface CellPhone{
    public void makeCall();
    public void sendMessage();
    public void showSpecs();
}

abstract class Android implements CellPhone{
    int model_no;
    public abstract void setDefaultApp();
}

abstract class Ios implements CellPhone{
    int model_no;
    public abstract void turnOnSiri();
}

class Samsung extends Android{
    boolean bluetooth;
    int touchwiz_version;
    
    public Samsung(int touchwiz_version,boolean bluetooth,int model_no){
        this.bluetooth=bluetooth;
        this.touchwiz_version=touchwiz_version;
        this.model_no=model_no;
    }
    
    public void makeCall(){
        System.out.println("Calling...");    
    }
    
    public void sendMessage(){
        System.out.println("Messaging...");    
    }
    
    public void setDefaultApp(){
        System.out.println("Set your default apps...");
    }
    
    public void setSamsungPay(){
        System.out.println("Sending money samsung pay...");
    }
    
    public void showSpecs(){
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Touchwiz Version: "+touchwiz_version);
        System.out.println("Model no.: "+model_no);
    }
}

class Nokia extends Android{
    int nokia_version;
    boolean wifi;
    
    public Nokia(int nokia_version,boolean wifi,int model_no){
        this.nokia_version=nokia_version;
        this.wifi=wifi;
        this.model_no=model_no;
    }
    
    public void makeCall(){
        System.out.println("Calling...");    
    }
    
    public void sendMessage(){
        System.out.println("Messaging...");  
    }
        
    public void setDefaultApp(){
        System.out.println("Set your default apps...");
    }
    
    public void setBothi(){
        System.out.println("Capture with bothi...");
    }
    
    public void showSpecs(){
        System.out.println("Wifi: "+wifi);
        System.out.println("Nokia version: "+nokia_version);
        System.out.println("Model no.: "+model_no);
    }
}

class Apple extends Ios{
    int ios_version;
    boolean mobile_data;
    
    public Apple(int ios_version,boolean mobile_data,int model_no){
        this.ios_version=ios_version;
        this.mobile_data=mobile_data;
        this.model_no=model_no;
    }
    
    public void makeCall(){
        System.out.println("Calling...");    
    }
    
    public void sendMessage(){
        System.out.println("Messaging...");  
    }
        
    public void turnOnSiri(){
        System.out.println("Turn siri on or off...");
    }
    
    public void setFaceId(){
        System.out.println("Make your face your password...");
    }
    
    public void showSpecs(){
        System.out.println("Mobile Data: "+mobile_data);
        System.out.println("Ios version: "+ios_version);
        System.out.println("Model no.: "+model_no);
    }
}


class Main{
    
    public static void main(String arg[]){
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); 
        
        Nokia nokia = new Nokia(10,true,6);
        Samsung samsung=new Samsung(12,true,7);
        Apple apple=new Apple(12,true,10);
        
        int choosePlatform=0,chooseBrand=0,chooseFeature=0;
        
        System.out.println("1. Android");
        System.out.println("2. Ios");
        System.out.print("Choose Platform: ");
        try{
            choosePlatform=Integer.parseInt(reader.readLine()); 
        }catch (IOException e){}
        
        switch(choosePlatform){
            case 1:
                System.out.println("1. Nokia");
                System.out.println("2. Samsung");
                System.out.println("Choose Mobile Brand");
                try{
                    chooseBrand=Integer.parseInt(reader.readLine()); 
                }catch (IOException e){}
                
                switch(chooseBrand){
                    case 1:
                        System.out.println("1. Make Call");
                        System.out.println("2. Send Message");
                        System.out.println("3. See Specs");
                        System.out.println("4. Use Bothi");
                        System.out.println("5. Set default app");
                        System.out.println("Choose Feature");
                        try{
                            chooseFeature=Integer.parseInt(reader.readLine()); 
                        }catch (IOException e){}
                        
                        switch (chooseFeature){
                            case 1:
                                nokia.makeCall();
                                break;
                            case 2:
                                nokia.sendMessage();
                                break;
                            case 3:
                                nokia.showSpecs();
                                break;
                            case 4:
                                nokia.setBothi();
                                break;
                            case 5:
                                nokia.setDefaultApp();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1. Make Call");
                        System.out.println("2. Send Message");
                        System.out.println("3. See Specs");
                        System.out.println("4. Use Samsung Pay");
                        System.out.println("5. Set default app");
                        System.out.println("Choose Feature");
                        try{
                            chooseFeature=Integer.parseInt(reader.readLine()); 
                        }catch (IOException e){}
                        
                        switch (chooseFeature){
                            case 1:
                                samsung.makeCall();
                                break;
                            case 2:
                                samsung.sendMessage();
                                break;
                            case 3:
                                samsung.showSpecs();
                                break;
                            case 4:
                                samsung.setSamsungPay();
                                break;
                            case 5:
                                samsung.setDefaultApp();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                        
                }
                break;
            case 2:
                System.out.println("1. Apple");
                System.out.println("Choose Mobile Brand");
                try{
                    chooseBrand=Integer.parseInt(reader.readLine()); 
                }catch (IOException e){}
                
                switch(chooseBrand){
                    case 1:
                        System.out.println("1. Make Call");
                        System.out.println("2. Send Message");
                        System.out.println("3. See Specs");
                        System.out.println("4. Set FaceId");
                        System.out.println("5. Turn on Siri");
                        System.out.println("Choose Feature");
                        try{
                            chooseFeature=Integer.parseInt(reader.readLine()); 
                        }catch (IOException e){}
                        
                        switch (chooseFeature){
                            case 1:
                                apple.makeCall();
                                break;
                            case 2:
                                apple.sendMessage();
                                break;
                            case 3:
                                apple.showSpecs();
                                break;
                            case 4:
                                apple.setFaceId();
                                break;
                            case 5:
                                apple.turnOnSiri();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                }
                break; 
            default:
            System.out.println("Invalid option");
            break;
        }
    }
}
