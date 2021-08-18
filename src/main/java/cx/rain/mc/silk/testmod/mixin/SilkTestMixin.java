package cx.rain.mc.silk.testmod.mixin;

import cx.rain.mc.silk.testmod.SilkTest;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class SilkTestMixin {
    private Logger log = LogManager.getLogger("Silk");

    @Inject(at = @At("TAIL"), remap = false, method = "loadWorld")
    public void afterLoadWorld(String str, CallbackInfo ci) {
//        SilkTest.getInstance().getLogger().info("World " + str + " Loaded!");
//        SilkTest.getInstance().getLogger().info("Mixin successful!");
        log.info("World " + str + " Loaded!");
        log.info("Mixin successful!");
    }
}
