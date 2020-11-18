package pr;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {


	@Override
	public void onEnable() {
		super.onEnable();
	}

	@Override
	public void onDisable() {


	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


		if(sender instanceof Player)
		{
			Player player = (Player) sender;












		}




		return super.onCommand(sender, command, label, args);
	}



	int test;
}
