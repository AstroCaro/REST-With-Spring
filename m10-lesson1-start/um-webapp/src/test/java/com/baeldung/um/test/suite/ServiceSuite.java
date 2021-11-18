package com.baeldung.um.test.suite;

import com.baeldung.um.persistence.PersistenceSpringIntegrationTest;
import com.baeldung.um.service.ServiceSpringIntegrationTest;
import com.baeldung.um.service.main.PrivilegeServiceIntegrationTest;
import com.baeldung.um.service.main.RoleServiceIntegrationTest;
import com.baeldung.um.service.main.UserServiceIntegrationTest;
import com.baeldung.um.web.WebSpringIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    UserServiceIntegrationTest.class

    ,PrivilegeServiceIntegrationTest.class

    ,RoleServiceIntegrationTest.class

    ,WebSpringIntegrationTest.class
    ,ServiceSpringIntegrationTest.class
    ,PersistenceSpringIntegrationTest.class
})
// @formatter:on
public final class ServiceSuite {
    //
}
