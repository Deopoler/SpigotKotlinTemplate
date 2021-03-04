package me.deopoler.spigotkotlintemplate

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(SampleListener(), this)
        this.getCommand("Check")?.setExecutor(SampleCommand())
    }

    override fun onDisable() {

    }
}