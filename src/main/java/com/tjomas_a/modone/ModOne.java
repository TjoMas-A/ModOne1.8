package com.tjomas_a.modone;


import com.tjomas_a.modone.proxy.IProxy;
import com.tjomas_a.modone.reference.Reference;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModOne
{
    @Mod.Instance(Reference.MOD_ID)
    public static ModOne instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        //ModItems.init();
        //ModBlocks.init();
        //PacketHandler.init();
        //LogHelper.info("Pre-Init Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Recipes.init();
        //TileEntities.init();
        //GameRegistry.registerWorldGenerator(new WorldGenNova(ModBlocks.novaculite, 32, ConfigurationHandler.novaculiteAmount), 1000);
        //LogHelper.info("Init Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //LogHelper.info("Post-Init Complete");
    }
}
