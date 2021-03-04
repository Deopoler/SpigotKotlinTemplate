package me.deopoler.spigotkotlintemplate

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SampleCommand : CommandExecutor {
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
}