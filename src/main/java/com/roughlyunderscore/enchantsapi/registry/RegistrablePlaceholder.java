package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * This interface is used to register placeholders. Implement this interface to create a new placeholder and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see com.roughlyunderscore.enchantsapi.registry.Registry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrablePlaceholder extends Registrable {
  /**
   * This method replaces the placeholder, having a player in mind.
   * @param player the player
   * @return the replaced placeholder
   */
  default String replaceForPlayer(final Player player) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method replaces the placeholder, having an entity in mind.
   * @param entity the entity
   * @return the replaced placeholder
   */
  default String replaceForEntity(final Entity entity) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Returns the name of the placeholder.
   * @return the name of the placeholder
   */
  default String getName() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
