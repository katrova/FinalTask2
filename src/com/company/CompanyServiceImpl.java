package com.company;

/*
 *
 * Classname : CompanyServiceImpl
 *
 * Description : Service witch implements interface ICompanyService
 *
 * @version 1.0 23.06.2020.
 *
 * @author Vasylkivska Kateryna KNTEU
 *
 * */

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        return child;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company,
                                                      List<Company> companies) {
        return 0;
    }
}
