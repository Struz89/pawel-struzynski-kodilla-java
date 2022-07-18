package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void testRetrieveCompanies() {
        //Given
        Company company = new Company("ABC Software");
        Company company2 = new Company("Kowalski i syn");
        companyDao.save(company);
        companyDao.save(company2);

        //When
        try {
            companyFacade.retrieveCompanies("%Pow%");
        } catch (CompanyException e) {
        }

        //CleanUp
        companyDao.deleteById(company.getId());
        companyDao.deleteById(company2.getId());
    }

    @Test
    public void testRetrieveEmployees() {
        //Given
        Employee employee = new Employee("Jan", "Nowak");
        Employee employee2 = new Employee("Marek", "Kowalski");
        employeeDao.save(employee);
        employeeDao.save(employee2);

        //When
        try {
            companyFacade.retrieveEmployees("%Kow%");
        } catch (CompanyException e) {
        }

        //CleanUp
        employeeDao.deleteById(employee.getId());
        employeeDao.deleteById(employee2.getId());
    }
}
