package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This interface is used to register placeholders. Implement this interface to create a new placeholder and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see UEAPIRegistry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrablePlaceholder extends Registrable {
  /**
   * Replaces the placeholder for an event & trigger.
   * @param text the text to replace
   * @param event the event
   * @param trigger the trigger
   * @return the replaced text
   */
  default @NotNull String replaceEvent(final @NotNull String text, final @NotNull Event event, final @NotNull RegistrableTrigger trigger) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
//  /**
//   * Returns whether the placeholder is applicable for a player.
//   * If this method returns false, {@link #replaceForPlayer(Player)} should return null.
//   * @return true if the placeholder is applicable for a player, false otherwise
//   */
//  default boolean isApplicableForPlayer() {
//    throw new UnsupportedOperationException("This has not been implemented.");
//  }
//
//  /**
//   * Returns whether the placeholder is applicable for an entity.
//   * If this method returns false, {@link #replaceForEntity(Entity)} should return null.
//   * @return true if the placeholder is applicable for an entity, false otherwise
//   */
//  default boolean isApplicableForEntity() {
//    throw new UnsupportedOperationException("This has not been implemented.");
//  }
//
//  /**
//   * Returns whether the placeholder is applicable for a block.
//   * If this method returns false, {@link #replaceForBlock(Block)} should return null.
//   * @return true if the placeholder is applicable for a block, false otherwise
//   */
//  default boolean isApplicableForBlock() {
//    throw new UnsupportedOperationException("This has not been implemented.");
//  }
//
//  /**
//   * This method replaces the placeholder, having a player in mind.
//   * Check {@link #isApplicableForPlayer()} before calling this method.
//   * @param player the player
//   * @return the replaced placeholder
//   */
//  default @Nullable String replaceForPlayer(final @NotNull Player player) {
//    throw new UnsupportedOperationException("This has not been implemented.");
//  }
//
//  /**
//   * This method replaces the placeholder, having an entity in mind.
//   * Check {@link #isApplicableForEntity()} before calling this method.
//   * @param entity the entity
//   * @return the replaced placeholder
//   */
//  default @Nullable String replaceForEntity(final @NotNull Entity entity) {
//    throw new UnsupportedOperationException("This has not been implemented.");
//  }
//
//  /**
//   * This method replaces the placeholder, having a block in mind.
//   * Check {@link #isApplicableForBlock()} before calling this method.
//   * @param block the block
//   * @return the replaced placeholder
//   */
//  default @Nullable String replaceForBlock(final @NotNull Block block) {
//    throw new UnsupportedOperationException("This has not been implemented.");
//  }
}
