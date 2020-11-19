package pr;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.ConsoleCommandSender;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase{


	public Item npcWand = new Item(ItemID.STICK);

	@Override
	public void onEnable() {

<<<<<<< HEAD

			getServer().getPluginManager().registerEvents(new ShopGui(),this);


=======
>>>>>>> master
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

			if(label.equalsIgnoreCase("admin") && (player.isOp() || player.getName().equalsIgnoreCase("InzProgramista"))){
				if (args.length == 0) {
					player.sendMessage("You only typed hello!");
				}
				else{
					if(args[0].equalsIgnoreCase("get")){
						if(args[1].equalsIgnoreCase("npcWand")){
							player.getInventory().setItemInHand(npcWand);
						}
					}
				}
			}
		}




		return super.onCommand(sender, command, label, args);
	}



	int test;
}
