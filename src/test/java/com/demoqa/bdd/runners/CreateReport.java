package com.demoqa.bdd.runners;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.List;

public class CreateReport {


    public void generateReportForJsonFiles(File reportOutputDirectory, List<String> jsonFiles) {
        String buildNumber = "1";
        String projectName = "School_Of_Automation_iteration2";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setParallelTesting(false);
        configuration.setBuildNumber(buildNumber);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
