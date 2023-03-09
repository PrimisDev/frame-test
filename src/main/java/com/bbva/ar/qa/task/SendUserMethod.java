package com.bbva.ar.qa.task;
import com.bbva.arch.qe.backend.client.TestingScenario;
import static com.bbva.ar.qa.steps.Steps.data;

public class SendUserMethod {
    public static void with(String apiName, TestingScenario scenario){
        scenario.http().post(apiName)
                .body().json()
                .content(data).send();
        scenario.var("id", "$response.user.id");
        scenario.var("username", "$response.user.username");
        scenario.var("firstName", "$response.user.firstName");
        scenario.var("lastName", "$response.user.lastName");
        scenario.var("email", "$response.user.email");
        scenario.var("password", "$response.user.password");
        scenario.var("phone", "$response.user.phone");
        scenario.var("userStatus", "$response.user.userStatus");
    }
}
