package com.rakesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	private ReportDao reportDao;

	@Autowired
	@Qualifier("oracle")
	public void setReportDao(ReportDao reportDao) {
		System.out.println("setReportDao() method called...");
		this.reportDao = reportDao;
	}

	public void generateReport() {
		reportDao.findData();
		System.out.println("generating report....");
	}
}

