package org.acme.hibernate.orm.panache.test;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;

@QuarkusTest
@TestProfile(LeakHunt9Test.LeakHuntTestProfile.class)
public class LeakHunt9Test {

    public static class LeakHuntTestProfile implements QuarkusTestProfile {
    }

    @Test
    void test() {
        System.out.println("asdfasdf");
    }
}
