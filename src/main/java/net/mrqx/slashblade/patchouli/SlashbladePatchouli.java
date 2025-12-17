package net.mrqx.slashblade.patchouli;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(SlashbladePatchouli.MODID)
public class SlashbladePatchouli {
    public static final String MODID = "slashblade_patchouli";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation prefix(String s) {
        return ResourceLocation.fromNamespaceAndPath(MODID, s);
    }

    public SlashbladePatchouli() {
    }
}
