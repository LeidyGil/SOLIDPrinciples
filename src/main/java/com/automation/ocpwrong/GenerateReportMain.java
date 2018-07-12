package com.automation.ocpwrong;

public class GenerateReportMain {

    public static void main(String[] args) {
        ReportingService rs = new ReportingService();
        rs.generateReportBasedOnType(ReportingType.CSV);
        rs.generateReportBasedOnType(ReportingType.XML);
        rs.generateReportBasedOnType(ReportingType.EXCEL);
    }
}
