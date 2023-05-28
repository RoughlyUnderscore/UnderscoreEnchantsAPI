package com.roughlyunderscore.enchantsapi;

import com.roughlyunderscore.enchantsapi.registry.UEAPIRegistry;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface UEAPI {

	/**
	 * Gets the data registry. Use it to register your placeholders,
	 * actions, conditions, etc. This is the <b>only</b> way that you should
	 * fetch the UnderscoreEnchantsAPI registry.
	 * @return the registry
	 */
	@NotNull UEAPIRegistry getRegistry();

	/**
	 * Disenchants an ItemStack - removes an enchantment of this name
	 * @param item the item to disenchant
	 * @param name the name of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found or if the item doesn't have the given enchantment
	 * @return the disenchanted item
	 */
	@NotNull ItemStack disenchant(@NotNull ItemStack item, @NotNull String name);

	/**
	 * Disenchants an ItemStack - removes an enchantment, found by this namespaced key
	 * @param item the item to disenchant
	 * @param key the namespaced key of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found or if the item doesn't have the given enchantment
	 * @return the disenchanted item
	 */
	@NotNull ItemStack disenchant(@NotNull ItemStack item, @NotNull NamespacedKey key);

	/**
	 * Disenchants an ItemStack - removes a given enchantment
	 * @param item the item to disenchant
	 * @param ench the enchantment
	 * @throws IllegalArgumentException if the item doesn't have the given enchantment
	 * @return the disenchanted item
	 */
	@NotNull ItemStack disenchant(@NotNull ItemStack item, @NotNull Enchantment ench);

	/**
	 * Fully disenchants an ItemStack
	 * @param item the item to disenchant
	 * @return the disenchanted item
	 */
	@NotNull ItemStack fullyDisenchant(@NotNull ItemStack item);

	/**
	 * Enchants an ItemStack with an enchantment of this name
	 * @param item the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found or if the level exceeds the maximum or is lower than 1.
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	@Nullable ItemStack enchant(@NotNull ItemStack item, @NotNull String name, int level);

	/**
	 * Enchants an ItemStack with an enchantment, found by this namespaced key
	 * @param item the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found or if the level exceeds the maximum or is lower than 1.
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	@Nullable ItemStack enchant(@NotNull ItemStack item, @NotNull NamespacedKey key, int level);

	/**
	 * Enchants an ItemStack with a given enchantment
	 * @param item the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the level exceeds the maximum or is lower than 1.
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	@Nullable ItemStack enchant(@NotNull ItemStack item, @NotNull Enchantment ench, int level);

	/**
	 * Enchants a player's item with an enchantment of this name, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(@NotNull Player player, @NotNull EquipmentSlot slot, @NotNull String name, int level);

	/**
	 * Enchants a player's item with an enchantment, found by this namespaced key, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(@NotNull Player player, @NotNull EquipmentSlot slot, @NotNull NamespacedKey key, int level);

	/**
	 * Enchants a player's item with a given enchantment, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(@NotNull Player player, @NotNull EquipmentSlot slot, @NotNull Enchantment ench, int level);
	
	/**
	 * Enchants an ItemStack with an enchantment of this name with no level or enchantment limit restrictions
	 * @param item the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found
	 * @return the enchanted item
	 */
	@NotNull ItemStack enchantUnrestricted(@NotNull ItemStack item, @NotNull String name, int level);

	/**
	 * Enchants an ItemStack with an enchantment, found by this namespaced key with no level or enchantment limit restrictions
	 * @param item the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found
	 * @return the enchanted item
	 */
	@NotNull ItemStack enchantUnrestricted(@NotNull ItemStack item, @NotNull NamespacedKey key, int level);

	/**
	 * Enchants an ItemStack with a given enchantment with no level or enchantment limit restrictions
	 * @param item the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @return the enchanted item
	 */
	@NotNull ItemStack enchantUnrestricted(@NotNull ItemStack item, @NotNull Enchantment ench, int level);

	/**
	 * Enchants a player's item with an enchantment of this name with no level or enchantment limit restrictions
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found
	 */
	void enchantUnrestricted(@NotNull Player player, @NotNull EquipmentSlot slot, @NotNull String name, int level);

	/**
	 * Enchants a player's item with an enchantment, found by this namespaced key with no level or enchantment limit restrictions
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment was not found
	 */
	void enchantUnrestricted(@NotNull Player player, @NotNull EquipmentSlot slot, @NotNull NamespacedKey key, int level);

	/**
	 * Enchants a player's item with a given enchantment with no level or enchantment limit restrictions
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 */
	void enchantUnrestricted(@NotNull Player player, @NotNull EquipmentSlot slot, @NotNull Enchantment ench, int level);

	/**
	 * Attempts to load an enchantment from a given name.
	 * @param enchantmentName the name of the enchantment
	 * @return LOADED if the enchantment was not loaded before, RELOADED if it was
	 */
	@NotNull EnchantmentLoadResponse loadEnchantment(@NotNull String enchantmentName);

	/**
	 * Attempts to unload an enchantment from a given name.
	 * @param enchantmentName the name of the enchantment
	 * @return UNLOADED if the enchantment was loaded before, NOT_FOUND if the enchantment was not found
	 */
	@NotNull EnchantmentUnloadResponse unloadEnchantment(@NotNull String enchantmentName);
}
