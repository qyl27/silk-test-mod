package cx.rain.mc.silk.testmod;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SilkTest implements DedicatedServerModInitializer {
    private static SilkTest INSTANCE;

    private Logger logger = LogManager.getLogger("SilkTest");

    public SilkTest() {
        INSTANCE = this;
    }
    public static SilkTest getInstance() {
        return INSTANCE;
    }

    public Logger getLogger() {
        return logger;
    }

    @Override
    public void onInitializeServer() {
        logger.info("I am loaded!");
    }
}
