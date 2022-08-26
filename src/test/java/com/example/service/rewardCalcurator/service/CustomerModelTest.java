package com.example.service.rewardCalcurator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.example.service.rewardCalcurator.model.Customer;
import com.example.service.rewardCalcurator.model.MyTransaction;

public class CustomerModelTest {

    Customer customer1;
    MyTransaction transaction1;
    MyTransaction transaction2;
    Set<MyTransaction> set = new HashSet<>();

    @BeforeEach
    private void setup() throws Exception {
        customer1 = new Customer();
        transaction1 = new MyTransaction();
        transaction2 = new MyTransaction();

        customer1.setId(1);
        customer1.setId(2);
        customer1.setName("Ana");
        customer1.setName("Bob");

        transaction1.setCustomer(customer1);
        transaction1.setId(1l);
        transaction1.setDescription("Purchase 1");
        transaction1.setTotal(120.0);
        transaction2.setCustomer(customer1);
        transaction2.setId(2l);
        transaction2.setDescription("Purchase 2");
        transaction2.setTotal(53.2);

        String sDate1 = "2022-07-07 10:20:10";
        Date date1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").parse(sDate1);
        transaction1.setSaveDate(date1);
        String sDate2 = "2022-07-17 10:10:10";
        Date date2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").parse(sDate2);
        transaction2.setSaveDate(date2);

        set.add(transaction1);
        set.add(transaction2);
        customer1.setTransactions(set);
    }

    @Test
    void test_customerGetRewardPoints_withDecimalPart(){
        double points = customer1.getRewardPoints();

        assertEquals(93.2, points);
    }

    @Test
    void test_customerGetTotalPurchases_withDecimalPart(){
        double points = customer1.getTotalPurchases();

        assertEquals(173.2, points);
    }

    @Test
    void test_customerGetRewardPoints_withMultipleTrasactions(){
        MyTransaction transaction3 = new MyTransaction();
        transaction3.setCustomer(customer1);
        transaction3.setId(3l);
        transaction3.setDescription("Purchase 3");
        transaction3.setTotal(40.0);
        set.add(transaction3);
        customer1.setTransactions(set);

        double points = customer1.getRewardPoints();

        assertEquals(93.2, points);
    }

    @Test
    void test_customerGetTotalPurchases_withMultipleTrasactions(){
        MyTransaction transaction3 = new MyTransaction();
        transaction3.setCustomer(customer1);
        transaction3.setId(3l);
        transaction3.setDescription("Purchase 3");
        transaction3.setTotal(40.0);
        set.add(transaction3);
        customer1.setTransactions(set);

        double points = customer1.getTotalPurchases();

        assertEquals(213.2, points);
    }


}
