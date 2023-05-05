package com.roughlyunderscore.enchantsapi.registry;

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
public interface Registry {
  /**
   * This method registers a registrable.
   * @param registrable the registrable
   */
  default void register(final Registrable registrable) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
