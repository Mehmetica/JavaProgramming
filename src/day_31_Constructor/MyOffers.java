package day_31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("Adana","Amazon","SDET",110000,true,true,true,true);
        offer2.setInfo("Osmaniye","Google","Developer",90000,false,false,true,false);
        offer3.setInfo("Istanbul","Snapchat","PO",85000,true,true,true,true);
        offer4.setInfo("Adana","Cydeo","PM",50000,false,true,false,false);
        offer5.setInfo("Konya","Casper","SDET",65000,true,true,true,true);
        offer6.setInfo("Izmir","Lenovo","Developer",120000,true,false,true,true);
        offer7.setInfo("Urfa","HP","PO",88000,false,true,false,false);


        Offer[] offerArray = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        System.out.println("--------------------------------------------------");
        ArrayList<Offer> FullTimeOffers = new ArrayList<>(Arrays.asList(offerArray));
        FullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println("removeNotFullTime = " + FullTimeOffers);

        System.out.println("--------------------------------------------------");
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offerArray));
        localOffers.removeIf(p->!p.location.equals("Adana"));
        System.out.println("localOffers = " + localOffers);
        System.out.println("localOffers.size() = " + localOffers.size());

        System.out.println("--------------------------------------------------");
        ArrayList<Offer> offerWithBenefits= new ArrayList<>(Arrays.asList(offerArray));
        //offerWithBenefits.removeIf(p->!p.hasBenefit);
        offerWithBenefits.removeIf(p-> !p.hasBenefit && !p.hasPTO);
        System.out.println("offerWithBenefits = " + offerWithBenefits);

        System.out.println("--------------------------------------------------");
        ArrayList<Offer> sdetOffers= new ArrayList<>(Arrays.asList(offerArray));
        sdetOffers.removeIf(p-> !p.jobTitle.equalsIgnoreCase("Sdet"));
        System.out.println("sdetOffers = " + sdetOffers);

        System.out.println("--------------------------------------------------");
        ArrayList<Offer> offersWith100K= new ArrayList<>(Arrays.asList(offerArray));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println("offersWith100K = " + offersWith100K);

    }
}
