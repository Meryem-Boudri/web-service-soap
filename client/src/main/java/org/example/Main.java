package org.example;


import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        BanqueService service=new BanqueWS().getBanqueServicePort();
        System.out.println(service.conversionEutoToDH(900));

        service.listComptes().forEach(cp->{
            System.out.println("---------------------");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
            System.out.println(cp.getDateCreation());
        });



    }
}