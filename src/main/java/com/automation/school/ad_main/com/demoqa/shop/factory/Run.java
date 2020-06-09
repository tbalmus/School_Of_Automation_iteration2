package com.automation.school.ad_main.com.demoqa.shop.factory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Run {

        public static void main(String[] args) {
            Logger logger = LogManager.getLogger(Run.class);
            logger.debug("This is a random debug message = {}");
        }
  /* private void generateReportForJsonFiles(File reportOutputDirectory,
                                           List<String> jsonFiles) {

        String buildNumber = "1";
        String projectName = project.getName();






        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, Configuration configuration);
        reportBuilder.generateReports();

      //  getLog().info(format("Cucumber HTML report has been generated at: %s/cucumber-html-reports/overview-features.html", reportOutputDirectory.getAbsolutePath()));
    }*/

}


