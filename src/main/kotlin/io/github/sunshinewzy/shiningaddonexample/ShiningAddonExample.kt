package io.github.sunshinewzy.shiningaddonexample

import io.github.sunshinewzy.shining.api.addon.ShiningAddon
import io.github.sunshinewzy.shining.api.addon.registerListener
import io.github.sunshinewzy.shining.api.event.guide.ShiningGuideOpenEvent
import io.github.sunshinewzy.shining.api.event.guide.ShiningGuideTeamSetupEvent

object ShiningAddonExample : ShiningAddon() {

    override fun onInit() {
        
    }

    override fun onEnable() {
        addonManager.registerListener<ShiningGuideTeamSetupEvent> {
            it.isCancelled = true
            it.player.sendMessage("Setting up teams...")
        }
    }

    override fun onActive() {
        
    }

    override fun onDisable() {
        
    }
    
}