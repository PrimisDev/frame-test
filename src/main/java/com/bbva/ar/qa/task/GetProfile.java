package com.bbva.ar.qa.task;

import com.bbva.arch.qe.backend.client.TestingScenario;
import static com.bbva.ar.qa.steps.Steps.data;
public class GetProfile {
    public static void with(String apiName, TestingScenario scenario){
        scenario.http().get(apiName);

    }
}
