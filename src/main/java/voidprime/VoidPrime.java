package voidprime;

import voidprime.Commons;
import voidprime.Proxy.CommonProxy;
import java.util.logging.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Commons.MODID, name = Commons.NAME, version = Commons.VER)
public class VoidPrime {
    @Mod.Instance
    public static VoidPrime INSTANCE;

    @SidedProxy(clientSide = Commons.PROXY_CLIENT, serverSide = Commons.PROXY_NORMAL)
    public static CommonProxy PROXY;

    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		PROXY.postInit(event);
	}
}
