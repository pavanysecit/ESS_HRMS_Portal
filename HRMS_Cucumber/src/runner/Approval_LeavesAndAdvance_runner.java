package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/Approval_LeavesAndAdvance_AllUsecases.feature", glue={"stepDefinition_Approval"})
public class Approval_LeavesAndAdvance_runner {

}