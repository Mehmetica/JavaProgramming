package day_36_Inheritance_Intro.TaskPhone;

public class PhoneObjects1 {
    public static void main(String[] args) {

        Iphone1 iphone = new Iphone1();
        iphone.setInfo("Apple","16\"","White","14 Pro",45000);
        Samsung1 samsung = new Samsung1();
        samsung.setInfo("Samsung","14\"","Black","20s",35000);
        Nokia1 nokia = new Nokia1();
        nokia.setInfo("Nokia","15\"","Grey","3512",21000);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(55666565547L);
        iphone.faceTime("msdandj@gmail.com");
        iphone.faceTime(321564564L);
        nokia.selfDefense();
        nokia.call(231564646l);
        nokia.text(465456455656L);








    }
}
