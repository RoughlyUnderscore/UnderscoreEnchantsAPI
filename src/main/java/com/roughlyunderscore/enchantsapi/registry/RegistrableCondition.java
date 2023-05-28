package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

/**
 * This interface is used to register conditions. Implement this interface to create a new condition and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see UEAPIRegistry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrableCondition extends Registrable {
  /**
   * Evaluates the condition based on the trigger and the event.
   * @param trigger the trigger
   * @param event the event
   * @return true if the condition is met, false otherwise
   */
  default boolean evaluateTriggerEvent(final @NotNull RegistrableTrigger trigger, @NotNull final Event event) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
