// Copyright 2024 RoughlyUnderscore
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.roughlyunderscore.data

import com.roughlyunderscore.annotations.Since
import com.roughlyunderscore.annotations.Stable
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

/**
 * This class serves the purpose of storing all messages used by the plugin.
 * They are loaded from the respective message file. Everything but the locale
 * identifier is nullable, because the plugin will not crash if a message is
 * missing.
 * @property localeIdentifier An identifier for the locale (e.g. en_US).
 */

// The fields are in fact used by the plugin and 100+ pointless warnings is annoying to look at
@Suppress("unused")
@Since("2.2")
@Serializable
@Stable
class UELocale(val localeIdentifier: String) {
  val mapping = mutableMapOf<String, String>()

  /**
   * The word "yes".
   */
  @Since("2.2") @Transient
  val yes = ""

  /**
   * The word "no".
   */
  @Since("2.2") @Transient
  val no = ""

  /**
   * When the plugin could not connect to a database.
   */
  @Since("2.2") @Transient
  val invalidConnection = ""

  /**
   * When a player attempts to execute an action that requires
   * higher permissions than they have.
   */
  @Since("2.2") @Transient
  val noPermissions = ""

  /**
   * When a command that requires a player is executed via the console.
   */
  @Since("2.2") @Transient
  val notForConsole = ""

  /**
   * The "next" button for a paginated UI.
   */
  @Since("2.2") @Transient
  val uiNext = ""

  /**
   * The "previous" button for a paginated UI.
   */
  @Since("2.2") @Transient
  val uiPrevious = ""

  /**
   * The "back" button for a UI.
   */
  @Since("2.2") @Transient
  val uiBack = ""

  /**
   * The "close" button for a UI.
   */
  @Since("2.2") @Transient
  val uiClose = ""

  /**
   * The prompt to sort a browsing UI by downloads.
   */
  @Since("2.2") @Transient
  val uiBrowsingSortByDownloads = ""

  /**
   * The prompt to sort a browsing UI by name.
   */
  @Since("2.2") @Transient
  val uiBrowsingSortByName = ""

  /**
   * The prompt to sort a browsing UI by author.
   */
  @Since("2.2") @Transient
  val uiBrowsingSortByAuthor = ""

  /**
   * The prompt to sort a browsing UI by amount.
   */
  @Since("2.2") @Transient
  val uiBrowsingSortByAmount = ""

  /**
   * The amount of times a browsable entry has been downloaded.
   *
   * Placeholders:
   * - **amount**: The amount of times.
   */
  @Since("2.2") @Transient
  val uiBrowsingDownloaded = ""

  /**
   * The prompt to toggle something in a UI.
   */
  @Since("2.2") @Transient
  val uiBrowsingClickToToggle = ""

  /**
   * The "ON" state for a toggleable UI element.
   */
  @Since("2.2") @Transient
  val uiStateOn = ""

  /**
   * The "OFF" state for a toggleable UI element.
   */
  @Since("2.2") @Transient
  val uiStateOff = ""

  /**
   * The title of the pack browsing UI.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingTitle = ""

  /**
   * The prompt to click on an item in a browsing UI.
   */
  @Since("2.2") @Transient
  val uiBrowsingClick = ""

  /**
   * The prompt to shift-click on an item in a browsing UI.
   */
  @Since("2.2") @Transient
  val uiBrowsingShiftClick = ""

  /**
   * The prompt to right-click on an item in a browsing UI.
   */
  @Since("2.2") @Transient
  val uiBrowsingRightClick = ""

  /**
   * The prompt to download an item in a preview UI.
   */
  @Since("2.2") @Transient
  val uiBrowsingDownload = ""

  /**
   * The prompt to load an item in a preview UI.
   */
  @Since("2.2") @Transient
  val uiBrowsingLoad = ""

  /**
   * The author of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **author**: The author of the pack.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackAuthor = ""

  /**
   * The amount of enchantments in the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **amount**: The amount of enchantments in the pack.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackAmount = ""


  /**
   * The website of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **website**: The website of the pack.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackWebsite = ""

  /**
   * The website of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **website**: The website of the pack.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingHasConflictsFirstLine = ""

  /**
   * The website of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **website**: The website of the pack.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingHasConflictsSecondLine = ""

  /**
   * Whether to show downloaded packs in the pack browsing UI.
   *
   * Placeholders:
   * - **state**: The state of the setting.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingShowDownloaded = ""

  /**
   * The header line for the pack description in the pack browsing UI.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackDescription = ""

  /**
   * The first line informing the player that the pack
   * contains blacklisted/whitelisted worlds.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackWhitelistsFirstLine = ""

  /**
   * The second line informing the player that the pack
   * contains blacklisted/whitelisted worlds.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackWhitelistsSecondLine = ""

  /**
   * The line indicating all enchantments of a pack.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackEnchantments = ""

  /**
   * The line following the enchantments line for when
   * the list of enchantments is too long (truncation).
   *
   * Placeholders:
   * - **amount**: The amount of enchantments not listed.
   */
  @Since("2.2") @Transient
  val uiPackBrowsingPackTruncated = ""

  /**
   * The title of the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingTitle = ""

  /**
   * The author of the enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **author**: The author of the enchantment.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingEnchantmentAuthor = ""

  /**
   * Whether to show downloaded enchantments in the enchantment browsing UI.
   *
   * Placeholders:
   * - **state**: The state of the setting.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingShowDownloaded = ""

  /**
   * The header line for the enchantment description in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingDescription = ""

  /**
   * The activation chance for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **chance**: The activation chance.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingChance = ""

  /**
   * The trigger for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **trigger**: The trigger.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingTrigger = ""

  /**
   * The conflicts for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **conflicts**: The conflicts.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingConflicts = ""

  /**
   * The cooldown for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **cooldown**: The cooldown.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingCooldown = ""

  /**
   * The forbidden materials for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **forbidden**: The forbidden materials.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingForbidden = ""

  /**
   * Whether the enchantment is unique in the enchantment browsing UI.
   *
   * Placeholders:
   * - **unique**: The state of the setting.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingUnique = ""

  /**
   * The seekers for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **seekers**: The seekers.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingSeekers = ""

  /**
   * The names of the required enchantments for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **required**: The required enchantments.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequired = ""

  /**
   * A word token for "seconds" (sec).
   */
  @Since("2.2") @Transient
  val uiEnchantmentPreviewSeconds = ""

  /**
   * A word token for "minutes" (min).
   */
  @Since("2.2") @Transient
  val uiEnchantmentPreviewMinutes = ""

  /**
   * A word token for "hours" (hr).
   */
  @Since("2.2") @Transient
  val uiEnchantmentPreviewHours = ""

  /**
   * A word token for "day" (day).
   */
  @Since("2.2") @Transient
  val uiEnchantmentPreviewDay = ""

  /**
   * The header line for the required plugins in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPlugins = ""

  /**
   * The syntax for a required plugin in the enchantment browsing UI.
   *
   * Placeholders:
   * - **plugin**: The name of the plugin.
   * - **installed**: Whether the plugin is installed.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPlugin = ""

  /**
   * The state of being installed for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPluginInstalled = ""

  /**
   * The state of not being installed for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPluginNotInstalled = ""

  /**
   * The prompt to click on a required plugin in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPluginClick = ""

  /**
   * The first line of the disclaimer for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPluginDisclaimerFirstLine = ""

  /**
   * The second line of the disclaimer for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2") @Transient
  val uiEnchantmentBrowsingRequiredPluginDisclaimerSecondLine = ""

  /**
   * The syntax for a chat message sent for an operator to download plugins.
   *
   * Placeholders:
   * - **plugin**: The name of the plugin.
   * - **link**: The link to the plugin download page.
   *
   */
  @Since("2.2") @Transient
  val uiEnchantmentRequiredPluginChatSyntax = ""

  /**
   * The title of the locale browsing UI.
   */
  @Since("2.2")
  @Transient
  val uiLocaleBrowsingTitle = ""

  /**
   * Whether to show downloaded locales.
   *
   * Placeholders:
   * - **state**: Whether this is currently turned on or off.
   */
  @Since("2.2")
  @Transient
  val uiLocaleBrowsingShowDownloaded = ""
    

  /**
   * When a log is being created.
   */
  @Since("2.2") @Transient
  val creatingLog = ""

  /**
   * When a log has been created successfully.
   *
   * Placeholders:
   * - **location**: The location of the log file.
   */
  @Since("2.2") @Transient
  val logCreated = ""

  /**
   * When a log could not be created.
   */
  @Since("2.2") @Transient
  val logNotCreated = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenAuthors = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenCreated = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorlds = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldName = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldUuid = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldEnv = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldSeed = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldDifficulty = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldSpawn = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldTime = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldRain = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldThunder = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenWorldSpawnLimit = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistry = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryActionSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryActionPlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryApplicableSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryApplicablePlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryConditionSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryConditionPlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryIndicatorSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryIndicatorPlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryPlaceholderSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryPlaceholderPlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistrySeekerSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistrySeekerPlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryTriggerSingular = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryTriggerPlural = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryLoaded = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenRegistryProvider = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenEnchantments = ""

  /**
   * A word token used for logging.
   */
  @Since("2.2") @Transient
  val logTokenEnchantmentsLoaded = ""

  /**
   * When a string is attempted to be parsed into an enchantment
   * name, but the enchantment with that name does not exist.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val invalidEnchantmentName = ""

  /**
   * When a string is attempted to be parsed into an integer,
   * but the string is not a valid integer.
   *
   * Placeholders:
   * - **level** The string that was attempted to be parsed.
   */
  @Since("2.2") @Transient
  val invalidEnchantmentLevel = ""

  /**
   * When a parameter passed to a command is invalid and does not
   * have a concrete message.
   *
   * Placeholders:
   * - **parameter**: The name of the parameter.
   */
  @Since("2.2") @Transient
  val invalidParameter = ""

  /**
   * When the provided string is not a valid URL or is not a direct
   * download URL.
   *
   * Placeholders:
   * - **url**: The URL that was invalid.
   */
  @Since("2.2") @Transient
  val invalidUrl = ""

  /**
   * When an enchantment level is out of bounds.
   *
   * Placeholders:
   * - **level**: The level that was out of bounds.
   * - **min**: The minimum level.
   * - **max**: The maximum level.
   */
  @Since("2.2") @Transient
  val enchantmentLevelOutOfBounds = ""

  /**
   * When an enchantment is attempted to be applied to an item, but the item
   * has the maximum number of enchantments.
   *
   * Placeholders:
   * - **limit**: The maximum number of enchantments.
   */
  @Since("2.2") @Transient
  val overTheLimit = ""

  /**
   * When an enchantment is attempted to be applied to an item, but the item
   * contains enchantments that conflict with the given one.
   */
  @Since("2.2") @Transient
  val enchantmentConflicts = ""

  /**
   * When a unique enchantment is attempted to be applied to an item that
   * contains enchantments.
   */
  @Since("2.2") @Transient
  val enchantmentUnique = ""

  /**
   * When an enchantment is attempted to be applied to an item that contains
   * a unique enchantment.
   */
  @Since("2.2") @Transient
  val hasUniqueEnchantment = ""

  /**
   * When the plugin is unable to check for updates.
   */
  @Since("2.2") @Transient
  val badUpdate = ""

  /**
   * When a player cannot be found.
   *
   * Placeholders:
   * - **player**: The name of the player.
   */
  @Since("2.2") @Transient
  val playerNotFound = ""

  /**
   * When a registrable being registered conflicts with
   * some other registrable's aliases.
   *
   * Placeholders:
   * - **new**: The aliases of the new registrable.
   * - **old**: The aliases of the old registrable.
   * - **plugin**: The plugin that's registered the old registrable.
   */
  @Since("2.2") @Transient
  val alreadyRegistered = ""

  /**
   * When a player enchanted an item with a command.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **level**: The level of the enchantment.
   */
  @Since("2.2") @Transient
  val enchantedItem = ""

  /**
   * When a player enchanted someone else's item with a command.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **level**: The level of the enchantment.
   * - **player**: The name of the player whose item was enchanted.
   */
  @Since("2.2") @Transient
  val enchantedItemOther = ""

  /**
   * When a player activated an enchantment. If the enchantment
   * uses a custom activation indicator, its message will be used instead.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val defaultActivationIndicator = ""

  /**
   * When an enchantment is downloaded successfully.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val downloadedEnchantment = ""

  /**
   * When an enchantment pack is downloaded successfully.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2") @Transient
  val downloadedPack = ""

  /**
   * When a locale is downloaded successfully.
   *
   * Placeholders:
   * - **locale**: The name of the locale.
   */
  @Since("2.2")
  @Transient
  val downloadedLocale = ""

  /**
   * When an enchantment could not be downloaded successfully.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val failedToDownloadEnchantment = ""

  /**
   * When an enchantment pack could not be downloaded successfully.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2") @Transient
  val failedToDownloadPack = ""

  /**
   * When a locale could not be downloaded successfully.
   *
   * Placeholders:
   * - **locale**: The name of the locale.
   */
  @Since("2.2")
  @Transient
  val failedToDownloadLocale = ""

  /**
   * When an enchantment is loaded from a file.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val loadedEnchantment = ""

  /**
   * When an enchantment pack is loaded from a file.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   * - **amount**: The amount of enchantments in the pack.
   */
  @Since("2.2") @Transient
  val loadedPack = ""

  /**
   * When a locale is loaded from a file.
   *
   * Placeholders:
   * - **locale**: The name of the locale.
   */
  @Since("2.2")
  @Transient
  val loadedLocale = ""

  /**
   * When an enchantment could not be loaded from a file.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val failedToLoadEnchantment = ""

  /**
   * When an enchantment pack could not be loaded from a file.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2") @Transient
  val failedToLoadPack = ""

  /**
   * When a locale could not be loaded from a file.
   *
   * Placeholders:
   * - **locale**: The name of the locale.
   */
  @Since("2.2")
  @Transient
  val failedToLoadLocale = ""

  /**
   * When an enchantment is unloaded.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val unloadedEnchantment = ""

  /**
   * When an enchantment pack is unloaded.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2") @Transient
  val unloadedPack = ""

  /**
   * When a player toggles an enchantment on/off.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **state**: The state of the enchantment.
   */
  @Since("2.2") @Transient
  val toggledEnchantment = ""

  /**
   * When a player toggles another player's enchantment on/off.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **state**: The state of the enchantment.
   * - **player**: The player whose enchantment was toggled.
   */
  @Since("2.2") @Transient
  val toggledEnchantmentOther = ""

  /**
   * When a player's enchantment gets toggled on/off externally.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **state**: The state of the enchantment.
   */
  @Since("2.2") @Transient
  val toggledEnchantmentExternally = ""

  /**
   * A filler for when an enchantment is toggled on ([toggledEnchantment]).
   */
  @Since("2.2") @Transient
  val stateOn = ""

  /**
   * A filler for when an enchantment is toggled off ([toggledEnchantment]).
   */
  @Since("2.2") @Transient
  val stateOff = ""

  /**
   * A message for when a player is trying to toggle an enchantment that is vanilla.
   */
  @Since("2.2") @Transient
  val cantToggleVanilla = ""

  /**
   * When a player changes their locale.
   */
  @Since("2.2") @Transient
  val changedLocale = ""

  /**
   * When a player's locale is changed externally.
   */
  @Since("2.2") @Transient
  val changedLocaleExternally = ""

  /**
   * When a player changes an other player's locale.
   *
   * Placeholders:
   * - **player**: the player whose locale was changed.
   */
  @Since("2.2") @Transient
  val changedLocaleOther = ""

  /**
   * When a player attempts to change their locale, but the functionality is disabled.
   */
  @Since("2.2") @Transient
  val cantChangeLocale = ""

  /**
   * When a player attempts to change their locale to an unidentified one.
   *
   * Placeholders:
   * - **locale**: the locale argument.
   */
  @Since("2.2") @Transient
  val noSuchLocale = ""

  /**
   * When the player's data has not been loaded yet.
   */
  @Since("2.2") @Transient
  val loading = ""

  /**
   * When the player's data has been loaded successfully.
   */
  @Since("2.2") @Transient
  val loaded = ""

  /**
   * When a plugin is reloaded.
   *
   * Placeholders:
   * - **ms**: The time it took to reload the plugin in milliseconds.
   */
  @Since("2.2") @Transient
  val reloaded = ""

  /**
   * The message sent to the player when they do not provide a name of an enchantment
   * when using the enchant command.
   */
  @Since("2.2") @Transient
  val commandEnchantNoEnchantmentName = ""

  /**
   * The message sent to the player when they do not provide a level of an enchantment
   * when using the enchant command.
   */
  @Since("2.2") @Transient
  val commandEnchantNoEnchantmentLevel = ""

  /**
   * The message sent to the player when the enchantment they are trying to apply
   * is not applicable to the item they are trying to enchant.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2") @Transient
  val commandEnchantCannotApply = ""

  /**
   * When a player hovers over a command in the help command.
   */
  @Since("2.2") @Transient
  val commandHover = ""

  /**
   * The message hinting the player to click on a command to write it into the chat.
   */
  @Since("2.2") @Transient
  val commandHoverHint = ""

  /**
   * The title of the help command.
   */
  @Since("2.2") @Transient
  val commandHelpTitle = ""

  /**
   * The message about the debug command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpDebug = ""

  /**
   * The message about the enchant command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpEnchant = ""

  /**
   * The message about the toggle command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpToggle = ""

  /**
   * The message about the download command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpDownload = ""

  /**
   * The message about the locale command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpLocale = ""

  /**
   * The message about the help command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpHelp = ""

  /**
   * The message about the load command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpLoad = ""

  /**
   * The message about the unload command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpUnload = ""

  /**
   * The message about the reload command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpReload = ""

  /**
   * The message about the browsepacks command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpBrowsePacks = ""

  /**
   * The message about the browseenchs command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpBrowseEnchs = ""

  /**
   * The message about the browselocales command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpBrowseLocales = ""

  /**
   * The message about the browse command, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpBrowse = ""

  /**
   * The message about the commands' syntax details, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpSyntaxDetails = ""

  /**
   * The message about the commands' syntax details, used in the help command.
   */
  @Since("2.2") @Transient
  val commandHelpSyntaxExceptions = ""

  /**
   * The title of the debug help command.
   */
  @Since("2.2") @Transient
  val debugHelpTitle = ""

  /**
   * The message about the debug-registry command, used in the debug help command.
   */
  @Since("2.2") @Transient
  val debugHelpRegistry = ""

  /**
   * The message about the debug-log command, used in the debug help command.
   */
  @Since("2.2") @Transient
  val debugHelpLog = ""

  /**
   * The message about the debug-enchantment command, used in the debug help command.
   */
  @Since("2.2") @Transient
  val debugHelpEnchantment = ""

  /**
   * The message indicating that a feature is not yet implemented and will
   * be available in the future.
   */
  @Since("2.2") @Transient
  val featureDelayed = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantment = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentChance = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentIndicator = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentApplicables = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentAuthor = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentConditions = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentConflicts = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentCooldown = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentDescription = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentForbidden = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentUnique = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentLevels = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentNegated = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentActions = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentRestrictions = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentRequiredEnchantments = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentRequiredPlugins = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentSeekers = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentTrigger = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentWhitelist = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentBlacklist = ""

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentRequiredPluginLink = ""

  /**
   * A word token used for enchantment pack debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantmentBy = ""

  /**
   * A word token used for enchantment pack debugging.
   */
  @Since("2.2") @Transient
  val tokenEnchantments = ""

  /**
   * The title of the debug-registry command.
   */
  @Since("2.2") @Transient
  val registryDebugTitle = ""

  /**
   * The message used by the registry debug command, showing how many
   * actions are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of actions loaded.
   */
  @Since("2.2") @Transient
  val registryDebugActionsLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * applicables are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of applicables loaded.
   */
  @Since("2.2") @Transient
  val registryDebugApplicablesLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * conditions are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of conditions loaded.
   */
  @Since("2.2") @Transient
  val registryDebugConditionsLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * indicators are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of indicators loaded.
   */
  @Since("2.2") @Transient
  val registryDebugIndicatorsLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * placeholders are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of placeholders loaded.
   */
  @Since("2.2") @Transient
  val registryDebugPlaceholdersLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * seekers are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of seekers loaded.
   */
  @Since("2.2") @Transient
  val registryDebugSeekersLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * triggers are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of triggers loaded.
   */
  @Since("2.2") @Transient
  val registryDebugTriggersLoaded = ""

  /**
   * The message used by the registry debug command, showing how many
   * built-in registrable items of a certain type are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of items loaded.
   */
  @Since("2.2") @Transient
  val registryDebugBuiltInAmount = ""

  /**
   * The helper message used by the registry debug command, showing how to
   * use the command for a certain registrable item type.
   */
  @Since("2.2") @Transient
  val registryDebugMoreInfo = ""

  /**
   * The message used by the registry debug command, indicating that the
   * player did not specify a valid registrable item type.
   */
  @Since("2.2") @Transient
  val registryDebugInvalidType = ""

  /**
   * The title of the registry debug command's output for actions.
   */
  @Since("2.2") @Transient
  val registryDebugActionsTitle = ""

  /**
   * The brief description used by the registry debug command for actions.
   *
   * Placeholders:
   * - **amount**: The amount of actions loaded.
   */
  @Since("2.2") @Transient
  val registryDebugActionsInfo = ""

  /**
   * The description of an action provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the action.
   */
  @Since("2.2") @Transient
  val registryDebugActionsBuiltIn = ""

  /**
   * The description of an custom action. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the action.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugActionsCustom = ""

  /**
   * The title of the registry debug command's output for applicables.
   *
   * Placeholders:
   * - **amount**: The amount of applicables loaded.
   */
  @Since("2.2") @Transient
  val registryDebugApplicablesTitle = ""

  /**
   * The brief description used by the registry debug command for applicables.
   */
  @Since("2.2") @Transient
  val registryDebugApplicablesInfo = ""

  /**
   * The description of an applicable provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the applicable.
   */
  @Since("2.2") @Transient
  val registryDebugApplicablesBuiltIn = ""

  /**
   * The description of an custom applicable. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the applicable.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugApplicablesCustom = ""

  /**
   * The title of the registry debug command's output for conditions.
   *
   * Placeholders:
   * - **amount**: The amount of conditions loaded.
   */
  @Since("2.2") @Transient
  val registryDebugConditionsTitle = ""

  /**
   * The brief description used by the registry debug command for conditions.
   */
  @Since("2.2") @Transient
  val registryDebugConditionsInfo = ""

  /**
   * The description of a condition provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the condition.
   */
  @Since("2.2") @Transient
  val registryDebugConditionsBuiltIn = ""

  /**
   * The description of a custom condition. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the condition.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugConditionsCustom = ""

  /**
   * The title of the registry debug command's output for indicators.
   */
  @Since("2.2") @Transient
  val registryDebugIndicatorsTitle = ""

  /**
   * The brief description used by the registry debug command for indicators.
   *
   * Placeholders:
   * - **amount**: The amount of indicators loaded.
   */
  @Since("2.2") @Transient
  val registryDebugIndicatorsInfo = ""

  /**
   * The description of an indicator provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the indicator.
   */
  @Since("2.2") @Transient
  val registryDebugIndicatorsBuiltIn = ""

  /**
   * The description of an custom indicator. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the indicator.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugIndicatorsCustom = ""

  /**
   * The title of the registry debug command's output for placeholders.
   */
  @Since("2.2") @Transient
  val registryDebugPlaceholdersTitle = ""

  /**
   * The brief description used by the registry debug command for placeholders.
   *
   * Placeholders:
   * - **amount**: The amount of placeholders loaded.
   */
  @Since("2.2") @Transient
  val registryDebugPlaceholdersInfo = ""

  /**
   * The description of a placeholder provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the placeholder.
   */
  @Since("2.2") @Transient
  val registryDebugPlaceholdersBuiltIn = ""

  /**
   * The description of a custom placeholder. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the placeholder.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugPlaceholdersCustom = ""

  /**
   * The title of the registry debug command's output for seekers.
   */
  @Since("2.2") @Transient
  val registryDebugSeekersTitle = ""

  /**
   * The brief description used by the registry debug command for seekers.
   *
   * Placeholders:
   * - **amount**: The amount of seekers loaded.
   */
  @Since("2.2") @Transient
  val registryDebugSeekersInfo = ""

  /**
   * The description of a seeker provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the seeker.
   */
  @Since("2.2") @Transient
  val registryDebugSeekersBuiltIn = ""

  /**
   * The description of a custom seeker. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the seeker.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugSeekersCustom = ""

  /**
   * The title of the registry debug command's output for triggers.
   *
   * Placeholders:
   * - **amount**: The amount of triggers loaded.
   */
  @Since("2.2") @Transient
  val registryDebugTriggersTitle = ""

  /**
   * The brief description used by the registry debug command for triggers.
   *
   * Placeholders:
   * - **amount**: The amount of triggers loaded.
   */
  @Since("2.2") @Transient
  val registryDebugTriggersInfo = ""

  /**
   * The description of a trigger provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the trigger.
   */
  @Since("2.2") @Transient
  val registryDebugTriggersBuiltIn = ""

  /**
   * The description of a custom trigger. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the trigger.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2") @Transient
  val registryDebugTriggersCustom = ""

  /**
   * The header of the help message for the /ue download command.
   */
  @Since("2.2") @Transient
  val downloadHelpTitle = ""

  /**
   * A message instructing the player to download an enchantment, a part
   * of the help message for the /ue download command.
   */
  @Since("2.2") @Transient
  val downloadHelpEnchantment = ""

  /**
   * A message instructing the player to download an enchantment pack, a part
   * of the help message for the /ue download command.
   */
  @Since("2.2") @Transient
  val downloadHelpPack = ""

  /**
   * A message instructing the player to download a locale, a part
   * of the help message for the /ue download command.
   */
  @Since("2.2") @Transient
  val downloadHelpLocale = ""

  /**
   * An error message stating that the command sender has submitted an invalid
   * type of content to download.
   */
  @Since("2.2") @Transient
  val downloadInvalidType = ""

  /**
   * An error message stating that the command sender has not submitted an
   * ID for the content to download.
   */
  @Since("2.2") @Transient
  val downloadNoId = ""

  /**
   * A vague error message stating that the download failed.
   */
  @Since("2.2") @Transient
  val downloadUnsuccessful = ""

  /**
   * A message indicating that the enchantment was downloaded successfully
   * and prompting the player to load it.
   */
  @Since("2.2") @Transient
  val downloadEnchantmentSuccessful = ""

  /**
   * A message indicating that the enchantment was downloaded successfully.
   */
  @Since("2.2") @Transient
  val downloadEnchantmentSuccessfulNoPrompt = ""

  /**
   * A message indicating that the enchantment was downloaded & loaded successfully.
   */
  @Since("2.2") @Transient
  val downloadAndLoadEnchantmentSuccessful = ""

  /**
   * The hover message for the [downloadEnchantmentSuccessful] message.
   */
  @Since("2.2") @Transient
  val downloadEnchantmentClickToLoad = ""

  /**
   * A message indicating that the enchantment pack was downloaded successfully
   * and prompting the player to load it.
   */
  @Since("2.2") @Transient
  val downloadPackSuccessful = ""

  /**
   * A message indicating that the enchantment pack was downloaded successfully.
   */
  @Since("2.2") @Transient
  val downloadPackSuccessfulNoPrompt = ""

  /**
   * A message indicating that the pack was downloaded & loaded successfully.
   */
  @Since("2.2") @Transient
  val downloadAndLoadPackSuccessful = ""

  /**
   * The hover message for the [downloadPackSuccessful] message.
   */
  @Since("2.2") @Transient
  val downloadPackClickToLoad = ""

  /**
   * A message indicating that the locale was downloaded successfully
   * and prompting the player to load it.
   */
  @Since("2.2") @Transient
  val downloadLocaleSuccessful = ""

  /**
   * A message indicating that the locale was downloaded successfully.
   */
  @Since("2.2") @Transient
  val downloadLocaleSuccessfulNoPrompt = ""

  /**
   * A message indicating that the locale was downloaded & loaded successfully.
   */
  @Since("2.2") @Transient
  val downloadAndLoadLocaleSuccessful = ""

  /**
   * The hover message for the [downloadPackSuccessful] message.
   */
  @Since("2.2") @Transient
  val downloadLocaleClickToLoad = ""

  /**
   * The header of the help message for the /ue load command.
   */
  @Since("2.2") @Transient
  val loadHelpTitle = ""

  /**
   * A message instructing the player to load an enchantment, a part
   * of the help message for the /ue load command.
   */
  @Since("2.2") @Transient
  val loadHelpEnchantment = ""

  /**
   * A message instructing the player to load an enchantment pack, a part
   * of the help message for the /ue load command.
   */
  @Since("2.2") @Transient
  val loadHelpPack = ""

  /**
   * A message instructing the player to unload a locale, a part
   * of the help message for the /ue load command.
   */
  @Since("2.2") @Transient
  val loadHelpLocale = ""

  /**
   * An error message stating that the command sender has submitted an invalid
   * type of content to load.
   */
  @Since("2.2") @Transient
  val loadInvalidType = ""

  /**
   * An error message stating that the command sender has not submitted a
   * filename for the content to load.
   */
  @Since("2.2") @Transient
  val loadNoFilename = ""

  /**
   * A message indicating that the enchantment was loaded successfully.
   */
  @Since("2.2") @Transient
  val loadEnchantmentSuccessful = ""

  /**
   * A message indicating that the enchantment was reloaded successfully.
   */
  @Since("2.2") @Transient
  val loadEnchantmentReloaded = ""

  /**
   * An error message stating that the enchantment could not be found.
   */
  @Since("2.2") @Transient
  val loadEnchantmentNotFound = ""

  /**
   * A message indicating that the enchantment pack was loaded successfully.
   */
  @Since("2.2") @Transient
  val loadPackSuccessful = ""

  /**
   * A message indicating that the enchantment pack could not be found.
   */
  @Since("2.2") @Transient
  val loadPackNotFound = ""

  /**
   * A message indicating that the locale was loaded successfully.
   */
  @Since("2.2") @Transient
  val loadLocaleSuccessful = ""

  /**
   * A message indicating that the locale could not be found.
   */
  @Since("2.2") @Transient
  val loadLocaleNotFound = ""

  /**
   * The header of the help message for the /ue unload command.
   */
  @Since("2.2") @Transient
  val unloadHelpTitle = ""

  /**
   * A message instructing the player to unload an enchantment, a part
   * of the help message for the /ue unload command.
   */
  @Since("2.2") @Transient
  val unloadHelpEnchantment = ""

  /**
   * A message instructing the player to unload an enchantment pack, a part
   * of the help message for the /ue unload command.
   */
  @Since("2.2") @Transient
  val unloadHelpPack = ""

  /**
   * A message instructing the player to unload a locale, a part
   * of the help message for the /ue unload command.
   */
  @Since("2.2") @Transient
  val unloadHelpLocale = ""

  /**
   * An error message stating that the command sender has submitted an invalid
   * type of content to unload.
   */
  @Since("2.2") @Transient
  val unloadInvalidType = ""

  /**
   * An error message stating that the command sender has not submitted a
   * name for the content to unload.
   */
  @Since("2.2") @Transient
  val unloadNoName = ""

  /**
   * A message indicating that the enchantment was unloaded successfully.
   */
  @Since("2.2") @Transient
  val unloadEnchantmentSuccessful = ""

  /**
   * An error message stating that the enchantment could not be found.
   */
  @Since("2.2") @Transient
  val unloadEnchantmentNotFound = ""

  /**
   * A message indicating that the enchantment pack was unloaded successfully.
   */
  @Since("2.2") @Transient
  val unloadPackSuccessful = ""

  /**
   * An error message stating that the enchantment pack could not be found.
   */
  @Since("2.2") @Transient
  val unloadPackNotFound = ""

  /**
   * A message indicating that the locale was unloaded successfully.
   */
  @Since("2.2") @Transient
  val unloadLocaleSuccessful = ""

  /**
   * An error message stating that the locale could not be found.
   */
  @Since("2.2") @Transient
  val unloadLocaleNotFound = ""


  /**
   * The message used to indicate an action being started.
   *
   * Placeholders:
   * - **action**: The action in question
   */
  @Since("2.2") @Transient
  val started = ""

  /**
   * The message used to indicate an action being finished.
   *
   * Placeholders:
   * - **action**: The action in question.
   * - **ms**: The time it took to finish the action in milliseconds.
   */
  @Since("2.2") @Transient
  val finished = ""

  /**
   * The action of populating the registry.
   */
  @Since("2.2") @Transient
  val populatingRegistry = ""

  /**
   * The action of initializing the connection data.
   */
  @Since("2.2") @Transient
  val initializingConnection = ""

  /**
   * The action of initializing the data storage.
   */
  @Since("2.2") @Transient
  val initializingData = ""

  /**
   * The action of preparing bStats.
   */
  @Since("2.2") @Transient
  val preparingMetrics = ""

  /**
   * The action of checking for updates.
   */
  @Since("2.2") @Transient
  val checkingUpdates = ""

  /**
   * The action of creating some runnable tasks.
   */
  @Since("2.2") @Transient
  val creatingTasks = ""

  /**
   * The action of registering listeners.
   */
  @Since("2.2") @Transient
  val registeringListeners = ""

  /**
   * The action of registering commands.
   */
  @Since("2.2") @Transient
  val initializingCommands = ""

  /**
   * The action of initializing the economy.
   */
  @Since("2.2") @Transient
  val initializingEconomy = ""

  /**
   * The action of registering enchantments.
   */
  @Since("2.2") @Transient
  val registeringEnchantments = ""

  /**
   * The action of creating the README file (if necessary).
   */
  @Since("2.2") @Transient
  val addingReadme = ""

  /**
   * The action of implementing the UnderscoreEnchants API.
   */
  @Since("2.2") @Transient
  val implementingApi = ""

  /**
   * The action of starting Retrofit and initializing a repository.
   */
  @Since("2.2") @Transient
  val startingRetrofit = ""

  /**
   * The message indicating about a successful plugin initialization.
   *
   * Placeholders:
   * - **plugin**: The plugin name and version.
   * - **ms**: The time it took to initialize the plugin in milliseconds.
   */
  @Since("2.2") @Transient
  val initialized = ""

  /**
   * The message instructing the users to report bugs promptly.
   */
  @Since("2.2") @Transient
  val reportBugsHere = ""

  /**
   * The message asking the users to review the plugin.
   *
   * Placeholders:
   * - **link**: The URL to the plugin's Spigot page.
   */
  @Since("2.2") @Transient
  val reviewRequest = ""

  /**
   * The message expressing the gratitude for using UnderscoreEnchants. ❤️
   */
  @Since("2.2") @Transient
  val thanksForUsingUe = ""


  /**
   * Finds a message by its configuration key.
   * @param key The key of the message.
   * @return The message, or null if not found.
   */
  fun byKey(key: String): String? = mapping[key]
}
