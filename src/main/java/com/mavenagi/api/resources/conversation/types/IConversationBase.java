/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.mavenagi.api.resources.conversation.types;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface IConversationBase {
    Optional<ResponseConfig> getResponseConfig();

    Optional<String> getSubject();

    Optional<String> getUrl();

    Optional<OffsetDateTime> getCreatedAt();

    Optional<OffsetDateTime> getUpdatedAt();

    Optional<Set<String>> getTags();

    Optional<Map<String, String>> getMetadata();
}