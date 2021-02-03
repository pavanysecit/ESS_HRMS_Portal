package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/HomePage_Navigation_AllUsecases.feature", glue={"stepDefinition_HomePage_Navigation"})
public class HomePage_Navigation_runner {

}