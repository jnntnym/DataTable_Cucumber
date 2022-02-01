package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("The user is in signin page")
    public void theUserIsInSigninPage() {
        System.out.println("THIS IS \"DATA TABLE\" OF CUCUMBER");
        System.out.println("The users should be logged in with different info");
    }

    @When("we enters multiple user data as below")
    public void weEntersMultipleUserDataAsBelow(DataTable dataTable) {
        System.out.println("This is the data table below: ");
        System.out.println(dataTable);
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("This is data table Cell: Row-0, Col-1");
        System.out.println(dataTable.cell(0,1));
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("This is data table asList()");
        System.out.println(dataTable.asList());
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("This is data table asMaps()");
        System.out.println(dataTable.asMaps());
        System.out.println("* * * * * * * * * * * * * * * ");
        // Store in a list and fetch data one by one
        System.out.println("Store in a list and fetch data one by one");
        List<Map<String, String>> dataMap = dataTable.asMaps();
        System.out.println(dataMap.get(1).get("Email"));
        System.out.println(dataMap.get(1).get("Password"));
        // Store in a list and fetch data by for each loop
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("Store in a list and fetch data by for each loop");
        for (Map<String, String> dt: dataMap) {
            System.out.println(dt.get("Email")+"\t "+dt.get("Password"));
        }
        System.out.println("* * * * * * * * * * * * * * * ");
    }

    @And("enters the above data")
    public void entersTheAboveData() {
        System.out.println("We enters the multiple data");
    }

    @When("user hit the login button")
    public void userHitTheLoginButton() {
        System.out.println("Users clicked the login button");
    }

    @Then("users should be logged in successfully")
    public void usersShouldBeLoggedInSuccessfully() {
        System.out.println("users should be logged in successfully");
    }
}
