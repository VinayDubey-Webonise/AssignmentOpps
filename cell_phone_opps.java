import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

class Phone{
    String model,brand;
    
    Phone(String model,String brand){
        this.model=model;
        this.brand=brand;
    }
    
    void makeCall(){
        System.out.println("Calling...");
    }
    
    void sendSMS(){
        System.out.println("Message send...");
    }
    
    void displayProperty(){
        System.out.println("Brand Name: "+brand);
        System.out.println("Model Name: "+model);
    }
}

class BarPhone extends Phone{
    boolean torch;
    
    BarPhone(boolean torch,String model,String brand){
        super(model,brand);
        this.torch=torch;
    }
    
    void turnOnTorch(){
        System.out.println("Turning On Torch");
    }
    
    void displayProperty(){
        super.displayProperty();
        System.out.println("Torch Availability: "+torch);
    }
}

class Smartphone extends Phone{
    boolean wifi,mobile_data;
    
    Smartphone(boolean wifi,boolean mobile_data,String model,String brand){
        super(model,brand);
        this.mobile_data=mobile_data;
        this.wifi=wifi;
    }
    
    void surfInternet(){
        System.out.println("Starting browser...");
    }
    
    void sendEmail(){
        System.out.println("Sending Email...");
    }
    
    void displayProperty(){
        super.displayProperty();
        System.out.println("Wifi: "+wifi);
        System.out.println("Mobile Data: "+mobile_data);
    }
}

class AndroidPhone extends Smartphone{
    float android_version;
    String default_apps;
    
    AndroidPhone(String model,String brand,float android_version,String default_apps,boolean wifi,boolean mobile_data){
        super(wifi,mobile_data,model,brand);
        this.android_version=android_version;
        this.default_apps=default_apps;
    }
    
    void androidPay(){
        System.out.println("You are using android pay");
    }
    
    void installUnknownApps(){
        System.out.println("Beware of the unknown apps before installing it");
    }
    
    void displayProperty(){
        super.displayProperty();
        System.out.println("Android Version: "+android_version);
        System.out.println("Default Apps: "+default_apps);
    }
}

class IosPhones extends Smartphone{
    float ios_version;
    String color;
    
    IosPhones(String model,String brand,float ios_version,String color,boolean wifi,boolean mobile_data){
        super(wifi,mobile_data,model,brand);
        this.color=color;
        this.ios_version=ios_version;
    }
    
    void useImessage(){
        System.out.println("Send Imessage to someone");
    }
    
    void faceTime(){
        System.out.println("Chat on faceTime");
    }
    
    void displayProperty(){
        super.displayProperty();
        System.out.println("Ios Version: "+ios_version);
        System.out.println("Color: "+color);
    }
}

public class Main { 
  public static void main(String[] args) {  
    
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
    int brandType=1,brandName=1,brandLoop=0,modelName;
    
    // Creating Static objects for the Ios devices  
    IosPhones[] iphone= new IosPhones[3];
    
    iphone[0]=new IosPhones("Iphone X","Apple",12,"Blue",true,true);
    iphone[1]=new IosPhones("Iphone Xs","Apple",12,"Green",true,true);
    iphone[2]=new IosPhones("Iphone Xs max","Apple",12,"Pink",true,true);
    
    // Creating Static objects for the Android Devices devices    
    AndroidPhone[] androidPhone=new AndroidPhone[3];
    
    androidPhone[0]=new AndroidPhone("Galaxy S9","Samsung",9,"Bixby, Samsung Pay, Samsung Security",true,true);
    androidPhone[1]=new AndroidPhone("Nokia 6","Nokia",9,"Bothi, Nokia Pay, Nokia Security",true,true);
    androidPhone[2]=new AndroidPhone("Nokia 8","Nokia",9,"Bothi, Nokia Pay, Nokia Security",true,true);
    
    char choice='y';
    
    while(choice=='y'){
        
        System.out.println("Select Phone Type:\n 1) Smartphone\n 2) Feature Phone");
        try{
            brandType=Integer.parseInt(reader.readLine()); 
        }catch(Exception e){}
        
        if(brandType==1){
            System.out.println("1) Nokia\n 2) Samsung\n 3) Apple\n");
        }else if(brandType==2){
            System.out.println("Feature Phone not added yet");
        }else{
            System.out.println("Invalid entry");
        }
        
        System.out.println("Select A phone:");
        try{
            brandName=Integer.parseInt(reader.readLine()); 
        }catch(Exception e){}
        
        if(brandName==1){
                System.out.println("Select a model:");
                for (brandLoop=0;brandLoop<3;brandLoop++){
                    if((androidPhone[brandLoop].brand).equals("Nokia"))
                        System.out.println(brandLoop+1+") "+androidPhone[brandLoop].model);    
                }
                
                try{
                    int modelChoice=Integer.parseInt(reader.readLine()); 
                }catch(Exception e){}
                
                System.out.println("   Features:");
                System.out.println("1) Surf Internet");
                System.out.println("2) Send Email");
                System.out.println("3) Android Pay");
                System.out.println("4) Install Unknown Apps");
                
                int feature_choise=0;
                
                try{
                    feature_choise=Integer.parseInt(reader.readLine()); 
                }catch(Exception e){}
                
                switch (feature_choise){
                    case 1:
                        androidPhone[0].surfInternet();
                        break;
                    case 2:
                        androidPhone[0].sendEmail();
                        break;
                    case 3:
                        androidPhone[0].androidPay();
                        break;
                    case 4:
                        androidPhone[0].installUnknownApps();
                        
                }
                
        }else if(brandName==2){
                System.out.println("Select a model:");
                for (brandLoop=0;brandLoop<3;brandLoop++){
                    if((androidPhone[brandLoop].brand).equals("Samsung"))
                        System.out.println(brandLoop+1+") "+androidPhone[brandLoop].model);    
                }
                
                try{
                    int modelChoice=Integer.parseInt(reader.readLine()); 
                }catch(Exception e){}
                
                System.out.println("   Features:");
                System.out.println("1) Surf Internet");
                System.out.println("2) Send Email");
                System.out.println("3) Android Pay");
                System.out.println("4) Install Unknown Apps");
                
                int feature_choise=0;
                
                try{
                    feature_choise=Integer.parseInt(reader.readLine()); 
                }catch(Exception e){}
                
                switch (feature_choise){
                    case 1:
                        androidPhone[0].surfInternet();
                        break;
                    case 2:
                        androidPhone[0].sendEmail();
                        break;
                    case 3:
                        androidPhone[0].androidPay();
                        break;
                    case 4:
                        androidPhone[0].installUnknownApps();
                        
                }
        }else if(brandName==3){
                System.out.println("Select a model:");
                for (brandLoop=0;brandLoop<3;brandLoop++){
                    if((iphone[brandLoop].brand).equals("Apple"))
                        System.out.println(brandLoop+1+") "+iphone[brandLoop].model);    
                }
                
                try{
                    int modelChoice=Integer.parseInt(reader.readLine()); 
                }catch(Exception e){}
                
                System.out.println("   Features:");
                System.out.println("1) Surf Internet");
                System.out.println("2) Send Email");
                System.out.println("3) Face Time");
                System.out.println("4) Imessage");
                
                int feature_choise=0;
                
                try{
                    feature_choise=Integer.parseInt(reader.readLine()); 
                }catch(Exception e){}
                
                switch (feature_choise){
                    case 1:
                        iphone[0].surfInternet();
                        break;
                    case 2:
                        iphone[0].sendEmail();
                        break;
                    case 3:
                        iphone[0].faceTime();
                        break;
                    case 4:
                        iphone[0].useImessage();
                        
                }
        }
        
        
        System.out.print("Want to continue(y/n):");
        try{
            choice=(reader.readLine()).charAt(0);
        }catch(Exception e){}
    }
  } 
}

