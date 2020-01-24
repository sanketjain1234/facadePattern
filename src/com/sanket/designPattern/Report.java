package com.sanket.designPattern;

public class Report {

    private ReportHeader reportHeader;
    private ReportContent reportContent;
    private ReportFooter reportFooter;

    public ReportHeader getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(ReportHeader reportHeader) {
        System.out.println("Setting Report Header");
        this.reportHeader = reportHeader;
    }

    public ReportContent getReportContent() {
        return reportContent;
    }

    public void setReportContent(ReportContent reportContent) {
        System.out.println("Setting Report Content");

        this.reportContent = reportContent;
    }

    public ReportFooter getReportFooter() {
        return reportFooter;
    }

    public void setReportFooter(ReportFooter reportFooter) {
        System.out.println("Setting Report Footer");
        this.reportFooter = reportFooter;
    }
}
