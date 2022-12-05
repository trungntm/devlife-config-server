package com.trungntm.domain.entity;

public enum Profile {

    local("local"),
    test("test"),
    staging("staging"),
    prod("prod");

    final String profileValue;

    Profile(String profile) {
        this.profileValue = profile;
    }

    public String getProfileValue() {
        return this.profileValue;
    }
}
