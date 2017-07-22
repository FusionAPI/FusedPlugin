package org.cyberpwn.fusionexample;

import org.bukkit.plugin.java.JavaPlugin;
import org.cyberpwn.fusionapi.registry.Fuse;
import org.cyberpwn.fusionapi.registry.Registrant;
import org.cyberpwn.fusionapi.registry.Registrar;
import org.cyberpwn.fusionapi.type.FMaterial;
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
	
	public String getSource()
	{
		return getName().toLowerCase();
	}
	
	public void onRegister(Registrar registrar)
	{
		Registrant<FMaterial> materialReg = registrar.getMaterialRegistrant();
		Registrant<FSound> soundReg = registrar.getSoundRegistrant();
		Registrant<FTexture> textureReg = registrar.getTextureRegistrant();
		Registrant<FModel> modelReg = registrar.getModelRegistrant();
		Registrant<FShader> shaderReg = registrar.getShaderRegistrant();
		
		textureReg.register("texture_sapphire_ore", new FusionTexture());
		materialReg.register("material_sapphire_ore", new BlockSapphireOre());
	}
}
