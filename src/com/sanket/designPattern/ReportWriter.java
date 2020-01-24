package com.sanket.designPattern;

/**
 * This class has various report writing method implementations.
 */
public class ReportWriter   {

    public void writeHtmlReport(Report report, String location) {

        // Implementation of writeHtmlReport method
        System.out.println("Writing Html Report !");

    }

    public void writeExcelReport(Report report, String location) {

        // Implementation of writeExcelReport method
        System.out.println("Writing Excel Report !");
    }

    public void writeCSVReport(Report report, String location) {

        // Implementation of writeCSVReport method
        System.out.println("Writing CSV Report !");
    }

    public void writePdfReport(Report report, String location) {

        // Implementation of writePdfReport method
        System.out.println("Writing Pdf Report !");
    }
}
