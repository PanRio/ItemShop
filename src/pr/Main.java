package pr;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {


	public Item item = new Item(ItemID.EMERALD,12);

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


			String lowerCmd = command.getName().toLowerCase();
			//Inventory inv = player.getInventory();



			switch(lowerCmd)
			{
				case "openinv":



					break;
				case "getItem":




					break;
			}






		}




		return super.onCommand(sender, command, label, args);
	}



	int test;
}
