package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/Leaves_PensionInformation_AllUsecases.feature", glue={"stepDefinition_LeavesAndPensionInformation"})
public class Leaves_PensionInformation_runner {

}