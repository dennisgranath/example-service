package com.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class exampleApplication extends Application<exampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new exampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "example";
    }

    @Override
    public void initialize(final Bootstrap<exampleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final exampleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
