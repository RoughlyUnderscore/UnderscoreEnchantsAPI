package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This interface is used to register actions. Implement this interface to create a new action and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see UEAPIRegistry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrableAction extends Registrable {
  /**
   * Executes an action, given a player as context.
   * @param player the player
   */
  default void executeOnPlayer(final @NotNull Player player) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Executes an action, given an entity as context.
   * @param entity the entity
   */
  default void executeOnEntity(final @NotNull Entity entity) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * Executes an action, given a block as context.
   * @param block the block
   */
  default void executeOnBlock(final @NotNull Block block) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
