package com.app.app2;

public class ReportService implements Service{
private ReportGenerator rg;
	public void show() {
		// TODO Auto-generated method stub
		rg.generateReport();
	}
	public void setRg(ReportGenerator rg) {
		this.rg = rg;
	}

}
