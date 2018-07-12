package com.automation.ocpcorrect;

public class ReportingService {

    public void generateReportBasedOnStrategy(ReportingStrategy reportingStrategy) {

        System.out.println("===================================");
        System.out.println("Generating report based on Strategy");
        System.out.println("===================================");

        reportingStrategy.generateReport();
    }
}
