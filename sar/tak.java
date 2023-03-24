import java.util.Scanner;

/**
 Dragons & Iek delta
 */
public class tak
{
  public static void main (){
      int answer;
    System.out.println("1-Κακος  ηρθες στο ιεκ δελτα της Πατρας");
    System.out.println("2-Φευγω προς το κεντρο για καφε");
    System.out.println("3-Ανεβαινω πανω για μαθημα ");
    System.out.println("4-Παω σπιτι για υπνο  ");
    
    Scanner myObj = new Scanner(System.in);
    answer = myObj.nextInt();
    
    if (answer==1){
        System.out.println("eisai tentas gyrna pisw");
    }
    
    else if(answer==2){
    System.out.println("Aston kafe tenta pigene gym b male");
    System.out.println("1-pas gia kafe sto dot");
    System.out.println("2-allajes gnwmi kai pas gia pitogyro");
    System.out.println("3-pas gia spiti na fas kota rizi alpha male");
    answer = myObj.nextInt();
    if (answer==1){
    System.out.println("LATHOS TENTA ALLAJE EPILOGI");
    }
    else if(answer==2){
    System.out.println("RE TENTA TI PITOGYRO BETA MALE ");
    }
    else if(answer==3){
    System.out.println("EISAI ALPHA MALE MPRAVO ");
    
    }
    else{
    System.out.println("PIGENE GYM BETA MALE  ");
    }
}
    else if(answer==3){
    System.out.println("kali epilogi na eisai jekourastos gia gym meta");
    }
    else{
    System.out.println("NA SE VROUNE TENTA ALLAJE APANTISI");
    }
    }
}
