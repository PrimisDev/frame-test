package com.bbva.ar.qa.task;

import com.bbva.arch.qe.backend.client.TestingScenario;

import static com.bbva.ar.qa.steps.Steps.data;

public class SendDeleteProfile {
    public static void with(String apiName, TestingScenario scenario){
        scenario.http().delete(apiName)
                .header("Authorization", "Token "+"$token");
    }
}
