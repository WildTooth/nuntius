package com.github.wildtooth.nuntius.core;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class EventProviderAddon extends LabyAddon<EventProviderConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<EventProviderConfiguration> configurationClass() {
    return EventProviderConfiguration.class;
  }
}
