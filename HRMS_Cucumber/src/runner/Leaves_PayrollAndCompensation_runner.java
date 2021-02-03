package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/PayrollAndCompensation_AllUsecases.feature", glue={"stepDefinition_PayrollAndCompensation"})
public class Leaves_PayrollAndCompensation_runner {

}