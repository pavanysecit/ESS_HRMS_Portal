package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/Login_AllUsecases.feature", glue={"stepDefinition_Login"})
public class Login_runner {

}