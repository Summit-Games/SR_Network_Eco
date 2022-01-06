package com.willfp.eco.core.entities.args;

import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @param test     The test for the entity.
 * @param modifier The modifier to apply to the entity.
 * @see EntityArgParser
 */
public record EntityArgParseResult(@NotNull Predicate<Entity> test,
                                   @NotNull Consumer<Entity> modifier) {
}