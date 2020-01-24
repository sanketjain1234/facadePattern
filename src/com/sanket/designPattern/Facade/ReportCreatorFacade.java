package com.sanket.designPattern.Facade;

import com.sanket.designPattern.*;
import com.sanket.designPattern.Enum.ReportType;

import javax.sql.DataSource;

public class ReportCreatorFacade {

    public static void createReport(ReportType reportType, DataSource dataSource, String location){

        //Do Validations of params

        Report report = new Report();

        // Get this data from some other layer of code
        report.setReportHeader(new ReportHeader());
        report.setReportContent(new ReportContent());
        report.setReportFooter(new ReportFooter());

        //Write Report

        ReportWriter writer = new ReportWriter();
        switch (reportType){
            case PDF:
                writer.writePdfReport(report,location);
                break;
            case CSV:
                writer.writeCSVReport(report,location);
                break;
            case EXCEL:
                writer.writeExcelReport(report,location);
                break;
            case HTML:
                writer.writeHtmlReport(report,location);
                break;
        }



    }

}
