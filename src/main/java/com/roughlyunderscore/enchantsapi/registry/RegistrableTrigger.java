package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.event.Event;

/**
 * This interface is used to register triggers. Implement this interface to create a new trigger and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see com.roughlyunderscore.enchantsapi.registry.Registry
 */
public interface RegistrableTrigger extends Registrable {
  /**
   * Checks if the trigger is an entity event.
   * @return true if the trigger is an entity event, false otherwise
   */
  default boolean isEntityEvent() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Checks if the trigger is a player event.
   * @return true if the trigger is a player event, false otherwise
   */
  default boolean isPlayerEvent() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Returns the event class.
   * @return the event class
   */
  default Class<? extends Event> getEventClass() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Returns the name of the trigger.
   * @return the name of the trigger
   */
  default String getName() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
