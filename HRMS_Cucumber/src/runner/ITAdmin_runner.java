package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/ITAdmin_AllUsecases.feature", glue={"stepDefinition_ITAdmin"})
public class ITAdmin_runner {

}