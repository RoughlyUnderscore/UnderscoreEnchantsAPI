package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * This interface is used to register actions. Implement this interface to create a new action and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see com.roughlyunderscore.enchantsapi.registry.Registry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrableAction extends Registrable {
  default void executePlayer(final Player player) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  default void executeEntity(final Entity entity) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  default String getName() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
