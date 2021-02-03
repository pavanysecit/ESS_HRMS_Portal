package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/HRMS_Cucumber/features/Benifits_LearningAndDevelopment_AllUsecases.feature", glue={"stepDefinition_Benifits_LearningAndDevelopment"})
public class Benifits_LearningAndDevelopment_runner {

}