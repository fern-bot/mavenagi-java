/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mavenagi.api.resources.conversation.types;

import com.mavenagi.api.resources.commons.types.EntityIdBase;

public interface IUserMessageBase extends IConversationMessageBase {
    EntityIdBase getUserId();

    String getText();

    UserConversationMessageType getUserMessageType();
}