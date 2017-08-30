package com.app.app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mainapp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource res=new ClassPathResource("app.xml");
BeanFactory bf=new XmlBeanFactory(res);
Object o=bf.getBean("report");
ReportService rs=(ReportService)o;
rs.show();
	}

}
