package com.sanket.designPattern;

import com.sanket.designPattern.Enum.ReportType;
import com.sanket.designPattern.Facade.ReportCreatorFacade;

public class Main {

    public static void main(String[] args) {

        ReportCreatorFacade reportCreatorFacade = new ReportCreatorFacade();

        reportCreatorFacade.createReport(ReportType.CSV,null,null);

        reportCreatorFacade.createReport(ReportType.PDF,null,null);

        ReportCreatorFacade.createReport(ReportType.EXCEL,null,null);

        reportCreatorFacade.createReport(ReportType.HTML ,null , null);

    }
}
