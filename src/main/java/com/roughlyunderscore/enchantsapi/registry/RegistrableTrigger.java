package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Method;

/**
 * This interface is used to register triggers. Implement this interface to create a new trigger and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see UEAPIRegistry
 */
public interface RegistrableTrigger extends Registrable {
  /**
   * Checks if the trigger is an entity event (extends {@link org.bukkit.event.entity.EntityEvent}).
   * @return true if the trigger is an entity event, false otherwise
   */
  default boolean isEntityEvent() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Checks if the trigger is a one-player event.
   * @return true if the trigger is a one-player event, false otherwise
   */
  default boolean isOnePlayerEvent() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Checks if the trigger is a two-player event.
   * @return true if the trigger is a two-player event, false otherwise
   */
  default boolean isTwoPlayerEvent() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Returns the event class.
   * @return the event class
   */
  default @NotNull Class<? extends Event> getEventClass() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method returns the method that returns a player that has the enchanted item and
   * procs the enchantment. This API method is needed, because there's no standard way to
   * find a player amongst all event types - for example, a method "getPlayer()" would not
   * work for entity events. As such, this method should generally return a method that finds
   * a player that's involved in this particular event. The method in question, of course,
   * should be a method of the event class.
   * @return the method that returns a player that has the enchanted item and procs the enchantment
   */
  default @NotNull Method getFirstPlayerFetchingMethod() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method returns the method that returns a player that was affected by a player
   * who has procced the enchantment. For example, in a PVP event, this method should
   * return the player who has been hit by the player who has procced the enchantment.
   * This method can return null if the event does not have a second player - this
   * should be checked with {@link #isTwoPlayerEvent()}.
   * @return the method that returns a player that was affected by a player who has procced the enchantment
   */
  default @Nullable Method getSecondPlayerFetchingMethod() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method returns the method that returns an entity that has been affected
   * by a player who has procced the enchantment. For example, in an Entity RMB event,
   * this method should return the entity that has been RMBed by the player who has
   * procced the enchantment. This method can return null if the event does not have
   * an entity - this check is not equivalent to {@link #isEntityEvent()}.
   * @return the method that returns an entity that has been affected by a player who has procced the enchantment
   */
  default @Nullable Method getEntityFetchingMethod() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method returns the method that returns a block that has been affected
   * by a player who has procced the enchantment. For example, in a Block RMB event,
   * this method should return the block that has been RMBed by the player who has
   * procced the enchantment. This method can return null if the event does not have
   * a block.
   * @return the method that returns a block that has been affected by a player who has procced the enchantment
   */
  default @Nullable Method getBlockFetchingMethod() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
