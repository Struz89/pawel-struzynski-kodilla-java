package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    private CompanyDao companyDao;

    private EmployeeDao employeeDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void retrieveCompanies(String company) throws CompanyException {
        LOGGER.info("Sprawdzamy czy istnieje w bazie firma zawierająca w nazwie: " + company);
        try {
            List<Company> companiesWithName = companyDao.retrieveCompaniesWithName(company);
            if (companiesWithName.size() == 0) {
                LOGGER.error(CompanyException.ERROR_COMPANY);
                throw new CompanyException(CompanyException.ERROR_COMPANY);
            }
        } finally {
            LOGGER.info("Koniec sprawdzania czy dana firma występuje w bazie");
        }
    }

    public void retrieveEmployees(String employee) throws CompanyException {
        LOGGER.info("Sprawdzamy czy istnieje w bazie pracownik zawierający w nazwisku: " + employee);
        try {
            List<Employee> employeesWithName = employeeDao.retrieveEmployeesWithLastname(employee);
            if (employeesWithName.size() == 0) {
                LOGGER.error(CompanyException.ERROR_EMPLOYEE);
                throw new CompanyException(CompanyException.ERROR_EMPLOYEE);
            }
        } finally {
            LOGGER.info("Koniec sprawdzania czy pracownik o danym nazwisku występuje w bazie");
        }
    }
}
