package me.deopoler.spigotkotlintemplate

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin(), CommandExecutor, Listener {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(this, this)
        this.getCommand("Check")?.setExecutor(this)
    }

    override fun onDisable() {

    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (label.equals("Check", true)) {
            if (sender is Player) {
                sender.sendMessage("Check")
                return true
            }else {
                sender.sendMessage("Console Check")
            }
        }
        return false
    }

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        e.joinMessage = "Welcome To My Server!"
    }
}