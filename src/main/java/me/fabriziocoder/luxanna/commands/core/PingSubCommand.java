package me.fabriziocoder.luxanna.commands.core;

import com.jagrosh.jdautilities.command.SlashCommand;
import com.jagrosh.jdautilities.command.SlashCommandEvent;
import net.dv8tion.jda.api.Permission;

public class PingSubCommand extends SlashCommand {
    public PingSubCommand() {
        this.name = "ping";
        this.cooldown = 5;
        this.help = "Returns the latency of the bot";
        this.botPermissions = new Permission[]{Permission.MESSAGE_SEND};
    }

    @Override
    public void execute(SlashCommandEvent event) {
        long gateway = event.getJDA().getGatewayPing();
        long rest = event.getJDA().getRestPing().complete();
        event.deferReply().queue(
                hook -> hook.editOriginal(String.format("Pong! (gateway: %sms, rest: %sms)", gateway, rest)).queue()
        );
    }
}