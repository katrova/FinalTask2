package com.company;

/*
 *
 * Classname : Main
 *
 * Description : Main class
 *
 * @version 1.0 23.06.2020
 *
 * @author Vasylkivska Kateryna KNTEU
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	CompanyServiceImpl service = new CompanyServiceImpl();

        List<Company> companies = new ArrayList<>();
        Company chief = new Company(null, 5);
        Company lawyer = new Company(chief, 9);
        Company developer = new Company(chief,15 );
        Company frontEnd = new Company(developer, 24);
        Company backEnd = new Company(developer, 25);
        Company design = new Company(frontEnd, 4);
        Company devOps = new Company(backEnd, 15);
        Company accounting = new Company(null, 7);

        System.out.println(service.getTopLevelParent(chief));
        System.out.println(service.getTopLevelParent(lawyer));
        System.out.println(service.getTopLevelParent(developer));
        System.out.println(service.getTopLevelParent(frontEnd));
        System.out.println(service.getTopLevelParent(backEnd));
        System.out.println(service.getTopLevelParent(design));
        System.out.println(service.getTopLevelParent(devOps));
        System.out.println(service.getTopLevelParent(accounting));
    }
}
