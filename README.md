/*
 * Edward Mendoza
 * November 8th, 2017
 * very rough tech summary of installing selenium
 * A very rough draft of a technical summary
 * on how I installed Selenium WebDriver for my
 * copy of IntelliJ.
 */

1. Create a project in IntelliJ.
2. In https://www.guru99.com/intellij-selenium-webdriver.html, go to the section "Pre-requisites to IntelliJ with selenium webdriver". Click the link embedded in "Selenium.org", go to the section "Selenium Client & WebDriver Language Bindings", and click the download link for Java there. 
3. Add the Selenium dependency from http://www.seleniumhq.org/docs/03_webdriver.jsp#setting-up-a-selenium-webdriver-project to project's pom.xml file. Change the version from 3.0.1 to the version of Selenium you downloaded in the previous step.
4. Add the following dependency as well.
   <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.12</version>
   </dependency>
5. Go to http://maven.apache.org/download.cgi, download the Binary zip archive version of Maven under the section "Files". To install Maven, follow the instructions in this video: https://youtu.be/j-46lYWAHF0?t=4m13s
6. Go back to https://www.guru99.com/intellij-selenium-webdriver.html, and follow the steps under the section "Configure IntelliJ to Support Selenium" starting at step 3
7. Now go to http://james-willett.com/2015/06/running-selenium-tests-in-google-chrome-with-chromedriver/ and follow the instructions there. Selenium should now be up and running on IntelliJ.
