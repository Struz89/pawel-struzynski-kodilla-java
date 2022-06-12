package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(10),10,new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(5),10,new BigDecimal(50));
        Product product = new Product("Book");
        Product product2 = new Product("Ball");
        item.setProduct(product);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("1");
        Invoice invoice2 = new Invoice("2");
        invoice.getItems().add(item);
        invoice2.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice2);

        //Whem
        invoiceDao.save(invoice);
        invoiceDao.save(invoice2);
        int id = invoice.getId();
        int id2 = invoice2.getId();

        //Then
        assertNotEquals(0, id);
        assertNotEquals(0, id2);

        //CleanUp
        invoiceDao.deleteById(id);
        invoiceDao.deleteById(id2);
    }
}
