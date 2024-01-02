package com.rakesh;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlReportDaoImpl implements ReportDao {

	public MysqlReportDaoImpl() {
		System.out.println("MysqlReportDaoImpl :: Constructor");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data from mysql db...");
		return "Report data";
	}
}