package hooks;

import Suporte.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import runner.RunnerTest;

public class CucumberHooks {

    @Before
    public void setUp(){
        Driver.navegador(RunnerTest.browser);
    }


    @After
    public static void encerrarNavegador(){
        Driver.fecharNavegador();
    }
}
