package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompany() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        List<Company> companyList = new ArrayList<>();
        try {
            companyList = searchingFacade.findCompanyByPartialName("ware");
        } catch (SearchingException e) {
            //do nothing
        }

        //Then
        Assert.assertEquals(8, companyList.size());

        //Cleanup
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindEmployees() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        List<Employee> employeesList = new ArrayList<>();
        try {
            employeesList = searchingFacade.findEmployeeByPartialName("ware");
        } catch (SearchingException e) {
            //do nothing
        }

        //Then
        Assert.assertEquals(0, employeesList.size());

        //Cleanup
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
