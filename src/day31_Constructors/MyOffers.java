package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
//        Offer offer6 = new Offer();
//        Offer offer7 = new Offer();

        offer1.setInfo("Akhisar","Amazon","QA",15000,true,true,true,true);
        System.out.println(offer1);

        offer2.setInfo("Sheffield","Sony","SDET",20000,true,true,true,false);
        System.out.println(offer2);

        offer3.setInfo("California","Facebook","Senior QA",120000,true,true,false,true);
        System.out.println(offer3);

        offer4.setInfo("Texas","CapitalOne","ScrumMaster",125000,false,false,false,true);
        System.out.println(offer4);

        offer5.setInfo("Los Angels","Bank of America","BA",200000,true,true,true,true);
        System.out.println(offer5);

        System.out.println("-----------------------------------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equals("Akhisar"));
        System.out.println(localOffers.size());



    }
}
