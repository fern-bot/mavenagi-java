/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mavenagi.api.resources.actions.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PreconditionOperator {
    NOT("NOT");

    private final String value;

    PreconditionOperator(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}