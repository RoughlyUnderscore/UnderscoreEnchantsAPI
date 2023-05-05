package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * This interface is used to register conditions. Implement this interface to create a new condition and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see com.roughlyunderscore.enchantsapi.registry.Registry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrableCondition extends Registrable {
  default boolean evaluatePlayer(final Player player) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  default boolean evaluateEntity(final Entity entity) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  default String getName() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
