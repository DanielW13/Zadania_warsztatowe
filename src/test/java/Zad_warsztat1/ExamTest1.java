package Zad_warsztat1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/Exam-test.feature",
        plugin = {"pretty", "html:report.html"}
)

public class ExamTest1 {
}
