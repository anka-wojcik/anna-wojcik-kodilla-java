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
public final class SearchingFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Company> findCompanyByPartialName(String partialName) throws SearchingException {
        LOGGER.info("Searching...");
        List<Company> companyList = null;

        if (partialName == null) {
            LOGGER.error(SearchingException.ERR_COMPANY_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_COMPANY_NOT_FOUND);
        } else {
            companyList = companyDao.retrieveCompanyByPartialName(partialName);
            if (companyList.size() < 1) {
                LOGGER.error(SearchingException.ERR_COMPANY_NOT_FOUND);
                throw new SearchingException(SearchingException.ERR_COMPANY_NOT_FOUND);
            }
            LOGGER.info("Found companies");
        }
        LOGGER.info("Search completed");
        return companyList;
    }

    public List<Employee> findEmployeeByPartialName(String partialName) throws SearchingException {
        LOGGER.info("Searching...");
        List<Employee> employeeList = null;

        if (partialName == null) {
            LOGGER.error(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            employeeList = employeeDao.retrieveEmployeeByPartialName(partialName);
            if (employeeList.size() < 1) {
                LOGGER.error(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
                throw new SearchingException(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
            }
            LOGGER.info("Found employees: ");
        }
        LOGGER.info("Search completed");
        return employeeList;
    }
}

