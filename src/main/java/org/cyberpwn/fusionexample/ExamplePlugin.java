package org.cyberpwn.fusionexample;

import org.bukkit.plugin.java.JavaPlugin;
import org.cyberpwn.fusionapi.registry.Fuse;
import org.cyberpwn.fusionapi.registry.Registrant;
import org.cyberpwn.fusionapi.registry.Registrar;
import org.cyberpwn.fusionapi.type.FBlock;
import org.cyberpwn.fusionapi.type.FItem;
import org.cyberpwn.fusionapi.type.FModel;
import org.cyberpwn.fusionapi.type.FShader;
import org.cyberpwn.fusionapi.type.FSound;
import org.cyberpwn.fusionapi.type.FTexture;
import org.cyberpwn.fusionapi.type.FusionTexture;

// Implement Fuse to notify we are a fuse plugin
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
	
	@Override
	public String getSource()
	{
		return getName().toLowerCase();
	}
	
	@Override
	public void onRegister(Registrar registrar)
	{
		Registrant<FBlock> blockReg = registrar.getBlockRegistrant();
		Registrant<FItem> itemReg = registrar.getItemRegistrant();
		Registrant<FSound> soundReg = registrar.getSoundRegistrant();
		Registrant<FTexture> textureReg = registrar.getTextureRegistrant();
		Registrant<FModel> modelReg = registrar.getModelRegistrant();
		Registrant<FShader> shaderReg = registrar.getShaderRegistrant();
		
		textureReg.register("texture_sapphire_ore", new FusionTexture("org/cyberpwn/fusionexample/res/sapphire_ore.png"));
		blockReg.register("material_sapphire_ore", new BlockSapphireOre());
	}
}
