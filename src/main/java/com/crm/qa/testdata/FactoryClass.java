package com.crm.qa.testdata;
import org.testng.annotations.Factory;

import com.crm.qa.testcases.googleTest;


public class FactoryClass {
@Factory
public Object[] invokeObjects()
{
Object[] data =new Object[2];
data[0]= new googleTest();
data[1]= new googleTest();
return data; }}

