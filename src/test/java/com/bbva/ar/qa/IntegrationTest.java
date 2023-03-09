package com.bbva.ar.qa;

import com.bbva.arch.qe.backend.cucumber.module.BackendTesting;
import com.bbva.arch.qe.backend.runner.cucumber.ManagedCucumber;
import com.bbva.arch.qe.backend.runner.cucumber.modules.Module;
import org.junit.runner.RunWith;
@RunWith(ManagedCucumber.class)
@Module(BackendTesting.class)

public class IntegrationTest {


}
