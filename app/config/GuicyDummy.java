package config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import play.modules.guice.GuiceSupport;

/**
 * Created by vincent on 14-5-29.
 */
public class GuicyDummy extends GuiceSupport {

    @Override
    protected Injector configure() {
        return Guice.createInjector(new GuicyDummyModel());
    }
}
