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
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompany(final String fragmentName) throws FacadeException{
        boolean wasError = false;
        List<Company> companyList = companyDao.findCompanyByFragmentName("%" + fragmentName + "%");
        if(companyList.size() > 0){
            return companyList;
        }else{
            LOGGER.error(FacadeException.ERR_NO_COMPANY);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_COMPANY);
        }
    }

    public List<Employee> findEmployee(final String nameFragment) throws FacadeException{
        boolean wasError = false;
        List<Employee> employeeList = employeeDao.findEmployeeByNameFragment("%" + nameFragment + "%");
        if(employeeList.size()>0){
            return employeeList;
        } else {
            LOGGER.error(FacadeException.ERR_NO_EMPLOYEE);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_EMPLOYEE);
        }
    }
}
//
//    public void processOrder(final OrderDto order, final Long userId) throws OrderProcessingException {
//        boolean wasError = false;
//        Long orderId = shopService.openOrder(userId);
//        LOGGER.info("Registering new order, ID: " + orderId);
//        if (orderId < 0) {
//            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORISED);
//            wasError = true;
//            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORISED);
//        }
//}
