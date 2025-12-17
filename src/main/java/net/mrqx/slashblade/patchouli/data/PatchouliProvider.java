package net.mrqx.slashblade.patchouli.data;

import com.reimnop.pgen.PGenBookProvider;
import com.reimnop.pgen.builder.PGenLangBuilder;
import mods.flammpfeil.slashblade.SlashBladeCreativeGroup;
import mods.flammpfeil.slashblade.registry.SlashBladeItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.mrqx.slashblade.patchouli.SlashbladePatchouli;
import net.mrqx.slashblade.patchouli.data.category.CategoryAbilitiesAndMechanics;
import net.mrqx.slashblade.patchouli.data.category.CategoryBladeArts;
import net.mrqx.slashblade.patchouli.data.category.CategorySlashbladeBaseKnowledge;

import java.util.concurrent.CompletableFuture;

public class PatchouliProvider extends PGenBookProvider {
    public PatchouliProvider(CompletableFuture<HolderLookup.Provider> lookupProvider, PackOutput packOutput) {
        super(SlashbladePatchouli.MODID, lookupProvider, packOutput);
    }

    @Override
    protected void generate(HolderLookup.Provider provider) {
        this.addBook("slashblade_book", "patchouli.slashblade_patchouli.book.name", "patchouli.slashblade_patchouli.book.landing", true,
                builder -> builder.withCreativeTab(SlashBladeCreativeGroup.SLASHBLADE_GROUP.getId())
                        .withSubtitle("patchouli.slashblade_patchouli.book.subtitle")
                        .withModel(SlashbladePatchouli.prefix("book_slashblade"))
                        .withShowProgress(true)
                        .withVersion("3")
                        .addLanguage("en_us", PatchouliProvider::enUsLangBuilder)
                        .addLanguage("zh_cn", PatchouliProvider::zhCnLangBuilder));
    }

    public static void enUsLangBuilder(PGenLangBuilder builder) {
        builder.addCategory(CategorySlashbladeBaseKnowledge.ID, "Basic knowledge",
                "The basics of Slashblade",
                SlashBladeItems.PROUDSOUL.getId(), CategorySlashbladeBaseKnowledge::enUsCategoryBuilder);
        CategorySlashbladeBaseKnowledge.enUsEntryBuilder(builder);

        builder.addCategory(CategoryBladeArts.ID, "Blade Arts",
                "Introduction to basic Slashblade Blade Arts",
                SlashBladeItems.PROUDSOUL_INGOT.getId(), CategoryBladeArts::enUsCategoryBuilder);
        CategoryBladeArts.enUsEntryBuilder(builder);

        builder.addCategory(CategoryAbilitiesAndMechanics.ID, "Abilities and Mechanics",
                "Special abilities and mechanics of Slashblade",
                SlashBladeItems.PROUDSOUL_CRYSTAL.getId(), CategoryAbilitiesAndMechanics::enUsCategoryBuilder);
        CategoryAbilitiesAndMechanics.enUsEntryBuilder(builder);
    }

    public static void zhCnLangBuilder(PGenLangBuilder builder) {
        builder.addCategory(CategorySlashbladeBaseKnowledge.ID, "基本知识",
                "拔刀剑的基础知识",
                SlashBladeItems.PROUDSOUL.getId(), CategorySlashbladeBaseKnowledge::zhCnCategoryBuilder);
        CategorySlashbladeBaseKnowledge.zhCnEntryBuilder(builder);

        builder.addCategory(CategoryBladeArts.ID, "剑技",
                "基础的拔刀剑剑技介绍",
                SlashBladeItems.PROUDSOUL_INGOT.getId(), CategoryBladeArts::zhCnCategoryBuilder);
        CategoryBladeArts.zhCnEntryBuilder(builder);

        builder.addCategory(CategoryAbilitiesAndMechanics.ID, "能力与机制",
                "拔刀剑所拥有的特殊能力与机制",
                SlashBladeItems.PROUDSOUL_CRYSTAL.getId(), CategoryAbilitiesAndMechanics::zhCnCategoryBuilder);
        CategoryAbilitiesAndMechanics.zhCnEntryBuilder(builder);
    }
}
