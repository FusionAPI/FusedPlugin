package org.cyberpwn.fusionexample;

import org.bukkit.plugin.java.JavaPlugin;
import org.cyberpwn.fusionapi.registry.Fuse;
import org.cyberpwn.fusionapi.registry.FuseMod;

// Implement Fuse to notify we are a fuse plugin
@FuseMod(source = "exampleplugin")
public class ExamplePlugin extends JavaPlugin implements Fuse
{
	@Override
	public void onEnable()
	{
		
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	public void onRegister()
	{
		// Register our data
	}
}
