/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mavenagi.api.resources.conversation.types;

import java.util.List;

public interface IBotActionFormResponse {
    String getId();

    String getFormLabel();

    List<ActionFormField> getFields();

    String getSubmitLabel();
}
