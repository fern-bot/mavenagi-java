/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mavenagi.api.resources.actions.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mavenagi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = PreconditionBase.Builder.class)
public final class PreconditionBase implements IPreconditionBase {
    private final Optional<PreconditionOperator> operator;

    private final Map<String, Object> additionalProperties;

    private PreconditionBase(Optional<PreconditionOperator> operator, Map<String, Object> additionalProperties) {
        this.operator = operator;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Operator to apply to this precondition
     */
    @JsonProperty("operator")
    @java.lang.Override
    public Optional<PreconditionOperator> getOperator() {
        return operator;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PreconditionBase && equalTo((PreconditionBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PreconditionBase other) {
        return operator.equals(other.operator);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.operator);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<PreconditionOperator> operator = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PreconditionBase other) {
            operator(other.getOperator());
            return this;
        }

        @JsonSetter(value = "operator", nulls = Nulls.SKIP)
        public Builder operator(Optional<PreconditionOperator> operator) {
            this.operator = operator;
            return this;
        }

        public Builder operator(PreconditionOperator operator) {
            this.operator = Optional.ofNullable(operator);
            return this;
        }

        public PreconditionBase build() {
            return new PreconditionBase(operator, additionalProperties);
        }
    }
}