package com.bbva.ar.qa.steps;

import com.bbva.ar.qa.task.GetProfile;
import com.bbva.ar.qa.task.SendUserMethod;
import com.bbva.ar.qa.utils.LoadData;
import com.bbva.arch.qe.backend.client.TestingScenario;
import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.bbva.ar.qa.services.UserRouts.*;
import static com.bbva.ar.qa.utils.constants.ResponseFields.BODY;



public class Steps {
    @Inject
    private TestingScenario scenario;
    public static String data;
    public String username;
    public String email;
    public String password;
    public int id;
    public String firstName;
    public String lastName;
    public String phone;
    public int userStatus;

    @Given("The client user")
    public void theClientUser() {
        data = LoadData.forSignUpSuccess(id, username, firstName, lastName, email, password, phone, userStatus);
    }
    @When("the client complete (.*), (.*), (.*), (.*), (.*), (.*), (.*) and (.*) field")
    public void theClientCompleteField(int id, String username, String firstName,
                                       String lastName, String email, String password,
                                       String phone, int userStatus) {
        data = LoadData.forSignUpSuccess(id, username, firstName, lastName, email, password, phone, userStatus);
        SendUserMethod.with(SIGN_UP, scenario);
        //Crear usuario < este es el metodo que estaba usando antes
    }

    @Then("The service response successfully status code 200")
    public void theServiceResponseSuccessfullyStatusCode() {
        GetProfile.with(PROFILE, scenario);
        scenario.assertThat(BODY).containsString(data);
        //Respuesta de status code
    }



}




