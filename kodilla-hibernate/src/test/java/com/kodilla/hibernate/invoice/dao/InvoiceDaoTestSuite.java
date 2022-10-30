//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    private InvoiceDao invoiceDao;
//
//    @Test
//    void testInvoiceDaoSave(){
//        //Given
//        Product product1 = new Product("Product1");
//        Product product2 = new Product("Product2");
//
//        Item item1 = new Item(product1, new BigDecimal("100"), 1,new BigDecimal("100"));
//        Item item2 = new Item(product1, new BigDecimal("1"), 4,new BigDecimal("4"));
//        Item item3 = new Item(product2, new BigDecimal("2"), 16,new BigDecimal("32"));
//        Item item4 = new Item(product2, new BigDecimal("110"),1, new BigDecimal("110"));
//
//        Invoice invoice1 = new Invoice("1");
//        Invoice invoice2 = new Invoice("2");
//
//        item1.setInvoice(invoice1);
//        item2.setInvoice(invoice1);
//        item3.setInvoice(invoice2);
//        item4.setInvoice(invoice2);
//
//        invoice1.getItems().add(item1);
//        invoice1.getItems().add(item2);
//        invoice2.getItems().add(item3);
//        invoice2.getItems().add(item4);
//
//        //When
//        invoiceDao.save(invoice1);
//        int invoice1Id = invoice1.getId();
//        invoiceDao.save(invoice2);
//        int invoice2Id = invoice2.getId();
//
//        //Then
//        assertNotEquals(0, invoice1Id);
//        assertNotEquals(0, invoice2Id);
//
//        //CleanUp
//        try{
//            invoiceDao.deleteById(invoice1Id);
//            invoiceDao.deleteById(invoice2Id);
//        }catch (Exception e){
//            System.out.println("error" + e);
//        }
//    }
//}
