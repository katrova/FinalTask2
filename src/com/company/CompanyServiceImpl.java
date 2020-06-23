package com.company;

/*
 *
 * Classname : CompanyServiceImpl
 *
 * Description : Service witch implements interface ICompanyService
 *
 * @version 1.0 2020.06.23
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
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        return 0;
    }
}
