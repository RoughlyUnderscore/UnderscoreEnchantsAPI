package com.roughlyunderscore.enchantsapi.registry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is the registry class. This class is used to register triggers and placeholders.
 * Do not reimplement this class.
 * @since 2.2
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableTrigger
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrablePlaceholder
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableCondition
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableAction
 * @see com.roughlyunderscore.enchantsapi.registry.Registrable
 * @author Roughly_
 */
public interface UEAPIRegistry {

  /**
   * This method registers a registrable. No implementation of this method should allow
   * for duplicate registrables to be registered. Anyhow, this method should only be implemented
   * by UnderscoreEnchants.
   * @param registrable the registrable
   * @throws UnsupportedOperationException if this method has not been implemented
   * @since 2.2
   * @see com.roughlyunderscore.enchantsapi.registry.Registrable
   * @see com.roughlyunderscore.enchantsapi.registry.RegistrableTrigger
   * @see com.roughlyunderscore.enchantsapi.registry.RegistrablePlaceholder
   * @see com.roughlyunderscore.enchantsapi.registry.RegistrableCondition
   * @see com.roughlyunderscore.enchantsapi.registry.RegistrableAction
   * @see com.roughlyunderscore.enchantsapi.registry.RegistrableApplicable
   * @see com.roughlyunderscore.enchantsapi.registry.RegistrableActivationIndicator
   * @author Roughly_
   */
  default void register(final @NotNull Registrable registrable) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method finds an action by its name (alias).
   * @param name the name (alias)
   * @return the action, or null if not found
   * @throws UnsupportedOperationException if this method has not been implemented
   */
  default @Nullable RegistrableAction findAction(final @NotNull String name) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method finds an applicable by its name (alias).
   * @param name the name (alias)
   * @return the applicable, or null if not found
   */
  default @Nullable RegistrableApplicable findApplicable(final @NotNull String name) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method finds a condition by its name (alias).
   * @param name the name (alias)
   * @return the condition, or null if not found
   */
  default @Nullable RegistrableCondition findCondition(final @NotNull String name) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method finds an activation indicator by its name (alias).
   * @param name the name (alias)
   * @return the activation indicator, or null if not found
   */
  default @Nullable RegistrableActivationIndicator findIndicator(final @NotNull String name) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method finds a placeholder by its name (alias).
   * @param name the name (alias)
   * @return the placeholder, or null if not found
   */
  default @Nullable RegistrablePlaceholder findPlaceholder(final @NotNull String name) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }

  /**
   * This method finds a trigger by its name (alias).
   * @param name the name (alias)
   * @return the trigger, or null if not found
   */
  default @Nullable RegistrableTrigger findTrigger(final @NotNull String name) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
