package io.prometheus.jmx.common.http.authenticator;

public class BaseAuthenticatorTest {

    protected final String VALID_USERNAME = "Prometheus";
    protected final String VALID_PASSWORD = "secret";

    protected static final String[] TEST_USERNAMES =
            new String[] {"Prometheus", "prometheus", "bad", "", null};
    protected static final String[] TEST_PASSWORDS =
            new String[] {"secret", "Secret", "bad", "", null};

    protected static final String SALT = "98LeBWIjca";
}
