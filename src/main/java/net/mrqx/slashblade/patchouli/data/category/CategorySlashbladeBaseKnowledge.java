package net.mrqx.slashblade.patchouli.data.category;

import com.reimnop.pgen.builder.PGenCategoryBuilder;
import com.reimnop.pgen.builder.PGenLangBuilder;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.registry.SlashBladeItems;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrqx.slashblade.patchouli.SlashbladePatchouli;
import net.mrqx.slashblade.patchouli.data.page.SimpleProcessingRecipePageBuilder;

public class CategorySlashbladeBaseKnowledge {
    public static final String ID = "slashblade_base_knowledge";

    public static void enUsCategoryBuilder(PGenCategoryBuilder builder) {
        builder.withSortnum(0);
    }

    public static void zhCnCategoryBuilder(PGenCategoryBuilder builder) {
        builder.withSortnum(0);
    }

    public static void enUsEntryBuilder(PGenLangBuilder builder) {
        builder.addEntry(ID + "/" + "slashblade_intro", "Before Everything Begins...", SlashBladeItems.SLASHBLADE.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0).withPriority(true)
                        .addTextPage("Resharped, meaning to re-sharpen the blade.$()$(br)" +
                                "No matter how golden the age was, it will eventually pass. The weapon known as the Slash Blade has gradually been buried in the dust of history...$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.SLASHBLADE.getId()),
                                pageBuilder -> pageBuilder.withText("Fortunately, a certain swordsmith passed down the art of the Slash Blade and brought it into the new era. We generally honor him as $(l:https://www.curseforge.com/minecraft/mc-mods/the-last-smith)'The Last Smith'.$()"))
                        .addTextPage("Even though the world has undergone many changes, and some swordsmen from the old era are resisting the new changes, countless new swordsmiths have taken up this craft.$()$(br)" +
                                "As one of the new swordsmiths, I cannot judge the merits of this change, but I can vaguely realize that change is necessary... As for how we have done in this change, let future generations judge.$()", pageBuilder -> {
                        })
                        .addTextPage("——mrqx0195$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "proudsoul_intro", "Knowledge of Proud Souls", SlashBladeItems.PROUDSOUL.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("Proud Souls are the crystallization of blades, the souls absorbed by Slash Blades after slaying enemies.$()$(br2)" +
                                "Proud Souls can also be seen as a form of energy stored in Slash Blades. This energy can be used to release Summoned Swords or $(l:slashblade_base_knowledge/special_attack_intro)SA$() for higher-level combat.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Proud Soul Value$() represents the number of Proud Souls accumulated in the blade. When the Proud Soul Value reaches $(thing)10000$(), the Slash Blade gains the $(thing)Soul Eater$() trait - when killing creatures, it repairs the durability of the held Slash Blade based on the amount of experience dropped.$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_TINY.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)Tiny Proud Soul$() is the smallest item form of Proud Souls. When used as strengthening material, it can strengthen a blade up to level 10, with each strengthening providing 100 Proud Soul Value. When used for Blade Stand enchanting, it has only a 25% success rate.$()$(br)" +
                                                "When a Slash Blade breaks, a piece of the blade breaks off and flies forward (specific appearance depends on the blade's model). Before landing, it $(thing)glows$() with a white particle trail. After landing, it sticks in the ground emitting purple particles, and can be picked up as a Tiny Proud Soul.$()")
                                        .withAnchor("proudsoul_tiny"))
                        .addCraftingPage(SlashBlade.prefix("material/tiny"), pageBuilder -> pageBuilder.withText("Based on the blade's $(thing)Proud Soul Value$() at break, you can obtain 1~10 $(item)Tiny Proud Souls$(). If the blade is enchanted, you can additionally obtain 1~10 $(thing)enchanted$() Tiny Proud Souls. Of course, the Proud Soul Value will decrease accordingly.$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)Proud Soul$() is one of the Proud Soul materials. When used as strengthening material, it can strengthen a blade up to level 50, with each strengthening providing 500 Proud Soul Value. When used for Blade Stand enchanting, it has a 50% success rate.$()")
                                        .withAnchor("proudsoul"))
                        .addCraftingPage(SlashBlade.prefix("material/soul"), pageBuilder -> pageBuilder.withText("If $(thing)enchanted$() $(item)Tiny Proud Souls$() are used in crafting, the resulting Proud Soul will inherit all enchantments from them (same enchantments take the level from the last Tiny Proud Soul in the crafting grid). Subsequent Proud Soul materials follow the same principle.$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_INGOT.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)Proud Soul Ingot$() is one of the Proud Soul materials. When used as strengthening material, it can strengthen a blade up to level 100, with each strengthening providing 1000 Proud Soul Value. When used for Blade Stand enchanting, it has a 75% success rate.$()$(br)" +
                                                "Additionally, it has another use: $(thing)copying a blade's $(l:slashblade_base_knowledge/special_attack_intro)SA$().$()")
                                        .withAnchor("proudsoul_ingot"))
                        .addCraftingPage(SlashBlade.prefix("material/ingot"), pageBuilder -> pageBuilder.withText("Place an enchanted blade on the Blade Stand, left-click it with an enchanted Proud Soul Ingot, then the following checks occur:$()$(br)" +
                                "If the blade $(c)does not$() have an SA, it $(c)will not$() copy;$()$(br)" +
                                "For each enchantment on the Proud Soul Ingot: if the blade has the $(c)same enchantment$(), and the blade's enchantment level is $(c)not less than the maximum level$() of that enchantment, copying occurs.$()$(br)" +
                                "After copying, you obtain a $(item)Proud Soul Sphere$() with the blade's SA, and the Proud Soul Ingot is consumed.$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_SPHERE.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)Proud Soul Sphere$() is one of the Proud Soul materials. When used as strengthening material, it can strengthen a blade up to level 150, with each strengthening providing 1500 Proud Soul Value. When used for Blade Stand enchanting, it has a 100% success rate.$()$(br)" +
                                                "Additionally, it has another use: $(thing)changing a blade's $(l:slashblade_base_knowledge/special_attack_intro)SA$().$()")
                                        .withAnchor("proudsoul_sphere"))
                        .addSmeltingPage(SlashBlade.prefix("material/sphere_smelting"), pageBuilder -> pageBuilder.withText("Place a blade on the Blade Stand, left-click it with a Proud Soul Sphere containing an SA to transfer the SA to the blade.$()$(br)" +
                                "The blade's original SA will $(c)be overwritten$(), and the Proud Soul Sphere will $(c)be consumed$().$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_CRYSTAL.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)Proud Soul Crystal$() is one of the Proud Soul materials. When used as strengthening material, it can strengthen a blade up to level 200, with each strengthening providing 2000 Proud Soul Value. When used for Blade Stand enchanting, it has a 100% success rate.$()$(br)" +
                                                "Additionally, it has two other uses: $(thing)copying/removing a blade's $(l:slashblade_base_knowledge/special_effect_intro)SE$(), and $(thing)adding SE to a blade$().$()")
                                        .withAnchor("proudsoul_crystal"))
                        .addPage(new SimpleProcessingRecipePageBuilder("blasting", entryBuilder.modId,
                                SlashBlade.prefix("material/crystal_blasting")).withText("Place a blade with SE on the Blade Stand, left-click it with a Proud Soul Crystal without SE, and it will attempt to copy SEs in order:$()$(br)" +
                                "If the SE $(c)cannot be copied$(), skip it;$()$(br)" +
                                "If the SE $(c)can be copied$(), consume the Proud Soul Crystal and drop a Proud Soul Crystal with that SE;$()$(br)" +
                                "If the SE $(c)can be removed$(), remove it.$()$(br)" +
                                "The result is copying/removing the blade's SE.$()$(br)" +
                                "For blades with multiple SEs, it attempts in order—meaning the first $(c)copyable and non-removable$() SE will be the $(c)only one$() that can be copied.$()$(br)" +
                                "After obtaining a Proud Soul Crystal with SE, left-click a blade on the Blade Stand to transfer the SE to it.$()").build())
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_TRAPEZOHEDRON.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)Proud Soul Trapezohedron$() is one of the Proud Soul materials. As the most precious material, it has only two uses—when used for Blade Stand enchanting, it $(c)guarantees success$(), and it can strengthen blades $(c)without limit$().$()")
                                        .withAnchor("proudsoul_trapezohedron"))
                        .addPage(new SimpleProcessingRecipePageBuilder("blasting", entryBuilder.modId,
                                SlashBlade.prefix("material/trapezohedron_blasting")).build())
        );
        builder.addEntry(ID + "/" + "special_attack_intro", "Knowledge of SA (Special Attack)", SlashBladeItems.PROUDSOUL_SPHERE.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("Special Attack, abbreviated as SA, is an active skill possessed by Slash Blades.$()$(br)" +
                                "Generally, you can hold down $(k:use) for a while and then release to execute SA.$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_INGOT.getId()).addItem(SlashBladeItems.PROUDSOUL_SPHERE.getId()),
                                pageBuilder -> pageBuilder.withText("Using $(item)Proud Soul Ingot$() and $(item)Proud Soul Sphere$(), you can copy and change a Slash Blade's SA. For specific methods, refer to the $(l:slashblade_base_knowledge/proudsoul_intro)'Knowledge of Proud Souls'$() section.$()"))
                        .addTextPage("If you hold down $(k:use), or release at the 'right moment' after using certain sword skills, you trigger $(thing)'Quick Charge'$(), and the SA released will be more powerful.$()$(br)" +
                                "Usually, this moment is when the blade is $(thing)sheathed$().$()", pageBuilder -> {
                        })
                        .addTextPage("If your blade $(l:slashblade_base_knowledge/blade_states#fiercer_edge)contains a certain power$() and is at full durability, you can use an even more powerful Super Slash Arts.$()$(br)" +
                                "Different SAs correspond to different Super Slash Arts. In most cases, this Super Slash Arts is $(thing)Dimensional Slash - Absolute$()—releasing a Dimensional Slash against all lockable targets around you.$()$(br)" +
                                "Releasing Super Slash Arts consumes half of the durability, so it usually cannot be used multiple times in a row.$()", pageBuilder -> pageBuilder
                                .withAnchor("super_slash_arts"))
        );
        builder.addEntry(ID + "/" + "special_effect_intro", "Knowledge of SE (Special Effect)", SlashBladeItems.PROUDSOUL_CRYSTAL.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("Special Effect, abbreviated as SE, is a passive skill possessed by Slash Blades.$()$(br)" +
                                "Different SEs have different effects, and multiple SEs can coexist in one blade.$()$(br)" +
                                "Some SEs can be copied or removed, while others cannot.$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_CRYSTAL.getId()),
                                pageBuilder -> pageBuilder.withText("Using $(item)Proud Soul Crystal$(), you can copy, remove, and add SEs to Slash Blades. For specific methods, refer to the $(l:slashblade_base_knowledge/proudsoul_intro)'Knowledge of Proud Souls'$() section.$()"))
        );
        builder.addEntry(ID + "/" + "enchantment_effects", "Enchantment Enhancement Effects", ForgeRegistries.ITEMS.getKey(Items.ENCHANTED_GOLDEN_APPLE),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Enchantment Enhancement Effects$() are special mechanics in the Slash Blade mod, activating additional effects when the Slash Blade has specific enchantments.$()$(br2)" +
                                "Currently, the mod provides two enchantment enhancement effects:$()" +
                                "$(li)$(thing)Soul Speed$(): Extends the timing window for Guard and Special Attacks.$()" +
                                "$(li)$(thing)Slow Fall$(): Slows falling speed in the air, enhancing aerial mobility.$()$(br2)" +
                                "These enhancement effects increase with the enchantment level and are an important supplement to the Slash Blade combat system.$()$(br2)" +
                                "$(o)Note: Enchantment enhancement effects only activate when the Slash Blade has the corresponding enchantment.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Soul Speed$()$(br2)" +
                                "$(thing)Activation Condition$(): Slash Blade is enchanted with $(thing)Soul Speed$().$()$(br2)" +
                                "$(thing)Effect$():$()" +
                                "$(li)Each level extends the Guard timing window by $(thing)1 game tick$() (default window is 5 ticks).$()" +
                                "$(li)Each level extends the timing window for using Special Attacks $(thing)during sheathing$() by $(thing)1 game tick$() (default window is 3 ticks).$()" +
                                "$(li)At level 3 and above, each level extends the Special Attack timing window by $(thing)1 game tick$() (default window is 5 ticks).$()$(br2)" +
                                "$(thing)Practical Value$():$()$(br)" +
                                "Soul Speed significantly reduces the timing requirements for $(thing)Guard$() and $(thing)Special Attacks$(), making these advanced techniques easier to perform.$()$(br2)" +
                                "$(o)Core Role: Increases operational fault tolerance, allowing you to perform precise Guards and powerful Special Attacks more easily.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Slow Fall$()$(br2)" +
                                "$(thing)Activation Condition$(): Slash Blade is enchanted with $(thing)Feather Falling$().$()$(br2)" +
                                "$(thing)Effect$():$()" +
                                "$(li)When using $(thing)most Sword Arts$() in the air, significantly slows falling speed.$()" +
                                "$(li)The slowing effect increases with enchantment level: each level increases the $(thing)gravity reduction coefficient$().$()" +
                                "$(li)Manifests as significantly extended air time.$()$(br2)" +
                                "$(thing)Mechanism Explanation$():$()$(br)" +
                                "When using aerial Sword Arts, the game locks the falling distance calculation and resets the falling speed, allowing you to:$()" +
                                "$(li)Perform more combos in the air.$()" +
                                "$(li)Adjust aerial position more precisely.$()" +
                                "$(li)Safely descend from greater heights.$()$(br2)" +
                                "$(o)Note: This effect stacks with the inherent slowing effect of Sword Arts, producing significant results.$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "blade_stand_intro", "Blade Stand", SlashBladeItems.BLADESTAND_1.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("The Blade Stand is a tool for displaying Slash Blades and can be placed like a block.$()$(br)" +
                                "$(thing)Standing$() Blade Stands can only be placed on the $(c)top$() of blocks, while $(thing)hanging$() Blade Stands can only be placed on the $(c)side$() of blocks.$()$(br)" +
                                "Once placed, the Blade Stand is an entity (similar to an $(item)Armor Stand$()). Hold a Slash Blade and $(k:use) on it to place the blade on the stand.$()$(br)" +
                                "The Blade Stand is one of the core items of this mod, used for various enhancements of Slash Blades—including Proud Soul Enchanting, $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_ingot)copying SA$(), $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_sphere)changing SA$(), and $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_crystal)copying/changing SE$().$()", pageBuilder -> {
                        })
                        .addTextPage("To perform Proud Soul Enchanting, simply place the Slash Blade to be enchanted on any Blade Stand, hold an enchanted $(l:slashblade_base_knowledge/proudsoul_intro)Proud Soul material$() and press $(k:attack) on it.$()$(br)" +
                                "Enchanting success probabilities for different materials: $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_tiny)Tiny Proud Soul$(): 25%; $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul)Proud Soul$(): 50%; $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_ingot)Proud Soul Ingot$(): 75%; $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_sphere)Proud Soul Sphere$() / $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_crystal)Proud Soul Crystal$() / $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_trapezohedron)Proud Soul Trapezohedron$(): 100%.$()$(br)" +
                                "For other unmentioned Proud Soul materials (usually added by addons), the probability is also typically 100%.$()$(br)" +
                                "Note that Proud Soul Enchanting has the lowest priority. If the action satisfies one of copying SA, changing SA, or copying/changing SE, those operations will take priority, and Proud Soul Enchanting will not be triggered.$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "blade_states", "Blade States", ForgeRegistries.ITEMS.getKey(Items.ENCHANTED_BOOK),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Blade States$() are one of the core mechanics of Slash Blades, determining the blade's attributes, abilities, and growth stages.$()$(br2)" +
                                "$(thing)Basic States$():$()" +
                                "$(li)$(thing)Noname$(): Basic state with no name and no enchantments.$()" +
                                "$(li)$(thing)Enchanted$(): State with enchantments.$()" +
                                "$(li)$(thing)Bewitched$(): State with enchantments and a custom name.$()$(br2)" +
                                "$(thing)Advanced States$():$()" +
                                "$(li)$(thing)Fiercer Edge$(): Obtained when Kill Count ≥ 1000.$()" +
                                "$(li)$(thing)Soul Eater$(): Obtained when Proud Soul Value ≥ 10000.$()$(br)" +
                                "$(thing)Abnormal States$():$()" +
                                "$(li)$(thing)Broken$(): Damaged state when durability reaches zero.$()" +
                                "$(li)$(thing)Sealed$(): Basic sealed state of some blades.$()", pageBuilder -> {

                        })
                        .addTextPage("$(thing)Basic State - Sealed$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "When the Slash Blade is not in $(thing)Enchanted$() or $(thing)Bewitched$() state, the tooltip displays as 'Sealed'.$()$(br2)" +
                                "$(thing)Description$():$()$(br)" +
                                "This is the most basic initial state of the Slash Blade, indicating the blade has not been enchanted or named.$()$(br)" +
                                "In this state, the blade can only use the most basic attacks and combos.$()$(br2)" +
                                "$(o)Note: This 'Sealed' state is different from the hidden $(thing)Sealed$() state!$()", pageBuilder -> pageBuilder
                                .withAnchor("noname"))
                        .addTextPage("$(thing)Basic State - Enchanted$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "Obtained when the Slash Blade has $(thing)any enchantment$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)The blade's $(thing)rarity becomes Rare$() (blue).$()" +
                                "$(li)Can $(thing)use $(l:slashblade_base_knowledge/special_attack_intro)SA$().$()$(br2)" +
                                "$(thing)Note$():$()$(br)" +
                                "Some Slash Blades, including $(thing)Anonymity -Wood-$(), cannot obtain this state.$()", pageBuilder -> pageBuilder
                                .withAnchor("enchanted"))
                        .addTextPage("$(thing)Basic State - Bewitched$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "Simultaneously satisfies:$()" +
                                "$(li)Has $(thing)any enchantment$().$()" +
                                "$(li)Has a custom name via $(thing)anvil naming$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)The blade's $(thing)rarity becomes Epic$() (purple).$()" +
                                "$(li)Tooltip will $(thing)display $(l:slashblade_base_knowledge/special_attack_intro)SA$().$()" +
                                "$(li)Allows release of $(l:slashblade_base_knowledge/special_attack_intro#super_slash_arts)Super Slash Arts$() (requires also having $(thing)Fiercer Edge$() state).$()" +
                                "$(li)If configuration allows, it will $(thing)automatically consume hunger and experience to repair$() itself while in the inventory.$()$(br2)" +
                                "This state overrides the display of the $(thing)Enchanted$() state.", pageBuilder -> pageBuilder
                                .withAnchor("bewitched"))
                        .addTextPage("$(thing)Advanced State - Fiercer Edge$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "Slash Blade's $(thing)Kill Count ≥ 1000$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Allows release of $(l:slashblade_base_knowledge/special_attack_intro#super_slash_arts)Super Slash Arts$() (requires also having $(thing)Bewitched$() state).$()" +
                                "$(li)$(thing)Refine Count$() has a greater impact on attack damage.$()" +
                                "$(li)Kill Count is displayed in $(thing)dark purple$() (default gray).$()$(br2)" +
                                "$(o)Tip: This is an important milestone in blade growth, unlocking powerful finishing moves.$()", pageBuilder -> pageBuilder
                                .withAnchor("fiercer_edge"))
                        .addTextPage("$(thing)Advanced State - Soul Eater$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "Slash Blade's $(thing)Proud Soul Value ≥ 10000$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)When killing creatures and gaining Proud Souls, $(thing)automatically repairs durability$() (repair amount = Proud Souls gained / 4, minimum 1 point).$()" +
                                "$(li)Proud Soul Value is displayed in $(thing)dark purple$() (default gray).$()$(br2)" +
                                "$(o)Tip: This is a sign of deep resonance between the blade and souls, greatly enhancing sustainability.$()", pageBuilder -> pageBuilder
                                .withAnchor("soul_eater"))
                        .addTextPage("$(thing)Abnormal State - Broken$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "Blade's $(thing)durability reaches zero$() and the blade does not disappear as a result.$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Attack damage $(thing)greatly reduced$() (usually cannot deal damage).$()" +
                                "$(li)Blade appearance $(thing)model changes$() (displayed as broken).$()" +
                                "$(li)$(thing)Cannot use$(): $(l:slashblade_base_knowledge/special_attack_intro)SA$(), Super Slash Arts, all Summoned Sword skills, Guard/Just Guard.$()$(br2)" +
                                "$(thing)Repair Method$():$()$(br)" +
                                "If the blade does not have $(thing)Sealed$() state, $(thing)repair to full durability$() to recover.$()$(br2)" +
                                "$(o)Warning: After breaking, the blade's combat capability is almost zero. Repair it promptly!$()", pageBuilder -> pageBuilder
                                .withAnchor("broken"))
                        .addTextPage("$(thing)Abnormal State - Sealed$()$(br2)" +
                                "$(thing)Acquisition Condition$():$()$(br)" +
                                "$(thing)Basic state$() of some Slash Blades, such as:$()" +
                                "$(li)Broken Sabigatana$()" +
                                "$(li)Broken Yamato$()$(br)" +
                                "$(thing)Effects$():$()" +
                                "$(li)All states are $(thing)hidden$() (not shown in tooltip).$()" +
                                "$(li)$(thing)Cannot enter Bewitched state$().$()" +
                                "$(li)$(thing)Cannot be repaired to unbroken state through normal methods$().$()" +
                                "$(li)$(thing)Cannot use$(): Special Attacks (SA), Super Slash Arts, all Summoned Sword skills.$()$(br2)" +
                                "$(o)Note: This is the sealed state of the blade, requiring special synthesis to解除.$()", pageBuilder -> pageBuilder
                                .withAnchor("sealed"))
                        .addTextPage("$(thing)State Relationships and Growth$()：$()$(br2)" +
                                "$(thing)Basic Growth Path$():$()" +
                                "$(li)$(thing)Noname$() → $(thing)Enchanted$() (enchant) → $(thing)Bewitched$() (name)$()" +
                                "$(li)$(thing)Bewitched$() + Kill Count 1000 → $(thing)Fiercer Edge$()" +
                                "$(li)$(thing)Bewitched$() + Proud Soul Value 10000 → $(thing)Soul Eater$()$(br2)" +
                                "$(thing)Abnormal State Handling$():$()" +
                                "$(li)$(thing)Broken$(): Recover by repairing durability.$()" +
                                "$(li)$(thing)Sealed$():解除封印 through specific synthesis.$()$(br2)" +
                                "$(thing)Important Notes$():$()" +
                                "$(li)$(thing)Bewitched$() state is a prerequisite for unlocking advanced abilities.$()" +
                                "$(li)$(thing)Fiercer Edge$() and $(thing)Soul Eater$() can be possessed simultaneously.$()" +
                                "$(li)Some special Slash Blades (e.g., Anonymity -Wood-) have $(thing)unique state rules$().$()$(br2)" +
                                "$(o)Tip: Blade growth is the core of Slash Blade gameplay. Nurture your blade carefully, and it will become increasingly powerful!$()", pageBuilder -> {
                        })
        );
    }

    public static void zhCnEntryBuilder(PGenLangBuilder builder) {
        builder.addEntry(ID + "/" + "slashblade_intro", "在一切开始之前……", SlashBladeItems.SLASHBLADE.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0).withPriority(true)
                        .addTextPage("重锋，即重新磨砺刀刃。$()$(br)" +
                                "再怎么黄金的时代，也终究是会过去的。而名为拔刀剑的武器，也逐渐埋没在历史的尘埃之下……$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.SLASHBLADE.getId()),
                                pageBuilder -> pageBuilder.withText("所幸，某位刀匠将拔刀剑的技艺传承了下来，并将其带到了新时代。我们一般尊称他为$(l:https://www.mcmod.cn/class/966.html)“最后的太刀匠人”$()。"))
                        .addTextPage("纵然，这个世界发生了诸多改变，从旧时代来的一些剑客也在抗拒新的改变。但，无数新生的刀匠接过了这项技艺。$()$(br)" +
                                "身为新生的刀匠之一，我无法评价这次变革的好坏，但我能够隐约意识到，变革是必要的……至于变革中我们做的如何，就交给后人来评价吧。$()", pageBuilder -> {
                        })
                        .addTextPage("——mrqx0195$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "proudsoul_intro", "耀魂的知识", SlashBladeItems.PROUDSOUL.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("耀魂是刀剑的结晶，是拔刀剑斩杀敌人后所吸收的灵魂。$()$(br2)" +
                                "耀魂也可以看作是拔刀剑中储存的一种能量，利用这种能量能够释放幻影剑或$(l:slashblade_base_knowledge/special_attack_intro)SA$()，以进行更高水平的战斗。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)耀魂值$()代表着刀身中所积累的耀魂数目。当耀魂值达到$(thing)10000$()时，拔刀剑将会获得$(thing)噬魂者$()特性——在击杀生物时，将会基于其经验值掉落量修复手中拔刀剑的耐久值。$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_TINY.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)破碎的耀魂$()是耀魂最小的物品形式，作为强化材料时，其最高可以将拔刀强化至10级，同时每次强化会提供100耀魂值，用于刀挂台附魔时仅有25%的成功概率。$()$(br)" +
                                                "当拔刀剑折断时，会有一截刀刃断开并向前飞出（具体样式取决于刀本身的模型），其在落地前会$(thing)发光$()并有白色粒子组成的轨迹，落地后会插在地上并发出紫色的粒子，靠近后就会以破碎的耀魂的形式进入物品栏。$()")
                                        .withAnchor("proudsoul_tiny"))
                        .addCraftingPage(SlashBlade.prefix("material/tiny"), pageBuilder -> pageBuilder.withText("根据断裂时拔刀剑的$(thing)耀魂值$()，可以获取到 1~10 枚$(item)破碎的耀魂$()，如果拔刀剑带有附魔，则可以额外再获取 1~10 枚$(thing)带有附魔的$()破碎的耀魂。当然，耀魂值也会因此而减少。$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)耀魂碎片$()是耀魂材料之一。作为强化材料时，其最高可以将拔刀强化至50级，同时每次强化会提供500耀魂值，用于刀挂台附魔时仅有50%的成功概率。$()")
                                        .withAnchor("proudsoul"))
                        .addCraftingPage(SlashBlade.prefix("material/soul"), pageBuilder -> pageBuilder.withText("若合成时使用了$(thing)带有附魔的$()$(item)破碎的耀魂$()，合成出的耀魂碎片会带有所有破碎的耀魂上的附魔（相同附魔取合成栏中最后一个破碎的耀魂的附魔等级），后续耀魂材料同理。$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_INGOT.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)耀魂铁锭$()是耀魂材料之一。作为强化材料时，其最高可以将拔刀强化至100级，同时每次强化会提供1000耀魂值，用于刀挂台附魔时具有75%的成功概率。$()$(br)" +
                                                "除此之外，它还有另外一个用途：$(thing)复制拔刀的$(l:slashblade_base_knowledge/special_attack_intro)SA$()。$()")
                                        .withAnchor("proudsoul_ingot"))
                        .addCraftingPage(SlashBlade.prefix("material/ingot"), pageBuilder -> pageBuilder.withText("将一把带有附魔的拔刀置于刀挂台上，手持带有附魔的耀魂铁锭对其左键，之后会进行如下判定：$()$(br)" +
                                "如果拔刀$(c)没有$()SA，则$(c)不会$()进行复制；$()$(br)" +
                                "对耀魂铁锭上的每个附魔进行遍历：如果拔刀上存在$(c)相同的附魔$()，且拔刀上该附魔的等级$(c)不小于该附魔的最大等级$()，则会进行复制。$()$(br)" +
                                "复制后会得到一个带有该拔刀SA的$(item)耀魂宝珠$()，耀魂铁锭则会被消耗。$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_SPHERE.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)耀魂宝珠$()是耀魂材料之一。作为强化材料时，其最高可以将拔刀强化至150级，同时每次强化会提供1500耀魂值，用于刀挂台附魔时具有100%的成功概率。$()$(br)" +
                                                "除此之外，它还有另外一个用途：$(thing)改变拔刀的$(l:slashblade_base_knowledge/special_attack_intro)SA$()。$()")
                                        .withAnchor("proudsoul_sphere"))
                        .addSmeltingPage(SlashBlade.prefix("material/sphere_smelting"), pageBuilder -> pageBuilder.withText("将拔刀置于刀挂台上，手持带有SA的耀魂宝珠左键即可将宝珠中的SA转移至拔刀上$()$(br)" +
                                "拔刀上原有的SA会$(c)被覆盖$()，耀魂宝珠则会$(c)被消耗$()。$()"))
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_CRYSTAL.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)耀魂结晶$()是耀魂材料之一。作为强化材料时，其最高可以将拔刀强化至200级，同时每次强化会提供2000耀魂值，用于刀挂台附魔时具有100%的成功概率。$()$(br)" +
                                                "除此之外，它还有另外两个用途：$(thing)复制/取下拔刀的$(l:slashblade_base_knowledge/special_effect_intro)SE$()，以及$(thing)为拔刀附加SE$()。$()")
                                        .withAnchor("proudsoul_crystal"))
                        .addPage(new SimpleProcessingRecipePageBuilder("blasting", entryBuilder.modId,
                                SlashBlade.prefix("material/crystal_blasting")).withText("将一把带有SE的拔刀置于刀挂台上，手持一个没有SE的耀魂结晶左键，就会按照拔刀所带有的SE顺序进行复制SE的尝试：$()$(br)" +
                                "如果该SE$(c)不可被复制$()，则跳过该SE；$()$(br)" +
                                "如果该SE$(c)可被复制$()，则消耗手中的耀魂结晶，掉落一个带有该SE的耀魂结晶；$()$(br)" +
                                "如果该SE$(c)可被移除$()，则将其移除。$()$(br)" +
                                "最终所表现出来的就是复制/取下了该拔刀的SE。$()$(br)" +
                                "对于有多个SE的拔刀，会按照顺序尝试复制/取下——这意味着第一个$(c)可被复制且不可被移除$()的SE将会是这把刀$(c)唯一一个$()可被复制的SE。$()$(br)" +
                                "获得带有SE的耀魂结晶后，手持它左键刀挂台上的刀即可将SE转移至这把刀上。$()").build())
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_TRAPEZOHEDRON.getId()),
                                pageBuilder -> pageBuilder.withText("$(item)耀偏方三八面魂$()是耀魂材料之一。作为耀魂材料中最贵重的材料，其用途只有两个——用于刀挂台附魔时$(c)必定成功$()，与$(c)无上限$()强化拔刀。$()")
                                        .withAnchor("proudsoul_trapezohedron"))
                        .addPage(new SimpleProcessingRecipePageBuilder("blasting", entryBuilder.modId,
                                SlashBlade.prefix("material/trapezohedron_blasting")).build())
        );
        builder.addEntry(ID + "/" + "special_attack_intro", "SA（特殊攻击）的知识", SlashBladeItems.PROUDSOUL_SPHERE.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("特殊攻击，简称SA，是拔刀剑所拥有的一种主动技能。$()$(br)" +
                                "一般而言，你可以长按$(k:use)一段时间后松开来释放SA。$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_INGOT.getId()).addItem(SlashBladeItems.PROUDSOUL_SPHERE.getId()),
                                pageBuilder -> pageBuilder.withText("利用$(item)耀魂铁锭$()和$(item)耀魂宝珠$()，可以复制和改变拔刀剑的SA。具体方法请参考$(l:slashblade_base_knowledge/proudsoul_intro)“耀魂的知识”$()一节。$()"))
                        .addTextPage("如果长按$(k:use)、或是使用某些剑技后在“恰当的时机”松开，将会触发$(thing)“迅速蓄力”$()，此时释放的SA将会更加强力。$()$(br)" +
                                "通常，这个时机是在$(thing)纳刀的瞬间$()。$()", pageBuilder -> {
                        })
                        .addTextPage("如果你的刀中$(l:slashblade_base_knowledge/blade_states#fiercer_edge)蕴含了某种力量$()且为满耐久，你将可以使用更为强大的超SA（Super Slash Arts）。$()$(br)" +
                                "不同SA对应着不同的超SA，大多数情况下，这个超SA是$(thing)次元斩·绝$()——对你附近的所以可锁定目标释放一次次元斩。$()$(br)" +
                                "释放超SA会折损一半的耐久值，因此通常无法连续多次使用。$()", pageBuilder -> pageBuilder
                                .withAnchor("super_slash_arts"))
        );
        builder.addEntry(ID + "/" + "special_effect_intro", "SE（特殊效果）的知识", SlashBladeItems.PROUDSOUL_CRYSTAL.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("特殊效果，简称SE，是拔刀剑所拥有的一种被动技能。$()$(br)" +
                                "不同的SE有着不同的效果，一把刀中可以共存多个SE。$()$(br)" +
                                "有些SE可以被复制或取下，有些SE则不行。$()", pageBuilder -> {
                        })
                        .addSpotlightPage(itemBuilder -> itemBuilder.addItem(SlashBladeItems.PROUDSOUL_CRYSTAL.getId()),
                                pageBuilder -> pageBuilder.withText("利用$(item)耀魂结晶$()，可以复制、取下和添加拔刀剑的SE。具体方法请参考$(l:slashblade_base_knowledge/proudsoul_intro)“耀魂的知识”$()一节。$()"))
        );
        builder.addEntry(ID + "/" + "enchantment_effects", "附魔增效", ForgeRegistries.ITEMS.getKey(Items.ENCHANTED_GOLDEN_APPLE),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)附魔增效$()是拔刀剑模组中的特殊机制，当拔刀剑拥有特定附魔时会激活额外效果。$()$(br2)" +
                                "目前模组提供两种附魔增效：$()" +
                                "$(li)$(thing)灵魂疾行$()：延长格挡和特殊攻击的判定窗口。$()" +
                                "$(li)$(thing)缓降$()：减缓空中下落速度，提升空中机动性。$()$(br2)" +
                                "这些增效效果会随着附魔等级提升而增强，是拔刀剑战斗体系的重要补充。$()$(br2)" +
                                "$(o)提示：附魔增效效果仅在拔刀剑持有对应附魔时生效。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)灵魂疾行$()$(br2)" +
                                "$(thing)触发条件$()：拔刀剑附有$(thing)灵魂疾行$()附魔。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)每级延长$(thing)格挡$()的判定窗口$(thing)1游戏刻$()（默认窗口为5刻）。$()" +
                                "$(li)每级延长$(thing)收刀期间使用特殊攻击$()的判定窗口$(thing)1游戏刻$()（默认窗口为3刻）。$()" +
                                "$(li)3级及以上时，每级延长$(thing)特殊攻击$()的判定窗口$(thing)1游戏刻$()（默认窗口为5刻）。$()$(br2)" +
                                "$(thing)实战价值$()：$()$(br)" +
                                "灵魂疾行能显著降低$(thing)格挡$()和$(thing)特殊攻击$()的时机要求，让这些高级技巧更容易成功施展。$()$(br2)" +
                                "$(o)核心作用：提升操作的容错率，让你更轻松地施展精准格挡和强力特殊攻击。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)缓降$()$(br2)" +
                                "$(thing)触发条件$()：拔刀剑附有$(thing)摔落缓冲$()附魔。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)在空中使用$(thing)大部分剑技$()时，大幅减缓下落速度。$()" +
                                "$(li)减缓效果随附魔等级提升：每级提升$(thing)重力折减系数$()。$()" +
                                "$(li)实际表现为在空中停留时间显著延长。$()$(br2)" +
                                "$(thing)机制说明$()：$()$(br)" +
                                "使用空中剑技时，游戏会锁定下落距离计算，并重设下落速度，使你能够：$()" +
                                "$(li)在空中施展更多连击。$()" +
                                "$(li)更精准地调整空中位置。$()" +
                                "$(li)从更高处安全下落。$()$(br2)" +
                                "$(o)注意：此效果与剑技本身的减缓下落效果叠加，效果显著。$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "blade_stand_intro", "刀挂台", SlashBladeItems.BLADESTAND_1.getId(),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("刀挂台用于摆放拔刀剑的工具，可以像方块一样放下。$()$(br)" +
                                "$(thing)立式$()刀挂台只能放于方块$(c)顶部$()，$(thing)挂式$()刀挂台只能放于方块$(c)侧面$()。$()$(br)" +
                                "放下后的刀挂台是实体（与$(item)盔甲架$()类似），手持拔刀对其$(k:use)可将其置入刀挂台。$()$(br)" +
                                "刀挂台是本模组的核心物品之一，用于对拔刀剑进行各种强化——包括耀魂附魔、$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_ingot)复制SA$()、$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_sphere)改变SA$()、$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_crystal)复制/改变SE$()。$()", pageBuilder -> {
                        })
                        .addTextPage("若要进行耀魂附魔，只需将需要附魔的拔刀置于任意刀挂台上，手持带有附魔的$(l:slashblade_base_knowledge/proudsoul_intro)耀魂材料$()对其按下$(k:attack)即可。$()$(br)" +
                                "不同材料的附魔成功概率：$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_tiny)破碎的耀魂$()：25%；$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul)耀魂碎片$()：50%；$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_ingot)耀魂铁锭$()：75%；$(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_sphere)耀魂宝珠$() / $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_crystal)耀魂结晶$() / $(l:slashblade_base_knowledge/proudsoul_intro#proudsoul_trapezohedron)耀偏方三八面魂$()：100%。$()$(br)" +
                                "对于其他未提及的耀魂材料（一般由附属添加），其概率通常也为100%。$()$(br)" +
                                "需要注意，耀魂附魔的优先级是最低的，如果操作满足复制SA、改变SA、复制/改变SE之一，则会优先进行这些操作，耀魂附魔则不会被触发。$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "blade_states", "刀的状态", ForgeRegistries.ITEMS.getKey(Items.ENCHANTED_BOOK),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)刀的状态$()是拔刀剑的核心机制之一，决定了刀的属性、能力和成长阶段。$()$(br2)" +
                                "$(thing)基础状态$()：$()" +
                                "$(li)$(thing)封$()：未命名、无附魔的基础状态。$()" +
                                "$(li)$(thing)印$()：拥有附魔的状态。$()" +
                                "$(li)$(thing)妖$()：拥有附魔且已命名的状态。$()$(br2)" +
                                "$(thing)进阶状态$()：$()" +
                                "$(li)$(thing)Fiercer Edge$()：杀敌数≥1000时获得。$()" +
                                "$(li)$(thing)Soul Eater$()：耀魂数≥10000时获得。$()$(br)" +
                                "$(thing)异常状态$()：$()" +
                                "$(li)$(thing)Broken$()：耐久归零时的损坏状态。$()" +
                                "$(li)$(thing)Sealed$()：部分刀的基础封印状态。$()", pageBuilder -> {

                        })
                        .addTextPage("$(thing)基础状态 - 封$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "当拔刀剑不处于$(thing)Sealed$()、$(thing)印$()或$(thing)妖$()状态时，工具提示会显示为“封”。$()$(br2)" +
                                "$(thing)说明$()：$()$(br)" +
                                "这是拔刀剑最基础的初始状态，表示刀尚未被附魔或命名。$()$(br)" +
                                "在此状态下，刀只能使用最基本的攻击和连招。$()$(br2)" +
                                "$(o)注意：这个“封”状态与隐藏的$(thing)Sealed$()状态不同！$()", pageBuilder -> pageBuilder
                                .withAnchor("noname"))
                        .addTextPage("$(thing)基础状态 - 印$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "拔刀剑上存在$(thing)任意附魔$()时获得。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)刀的$(thing)稀有度变为稀有$()（蓝色）。$()" +
                                "$(li)可以$(thing)使用$(l:slashblade_base_knowledge/special_attack_intro)SA$()。$()$(br2)" +
                                "$(thing)注意$()：$()$(br)" +
                                "包括$(thing)无铭刀「木偶」$()在内的一些拔刀剑无法获得此状态。$()", pageBuilder -> pageBuilder
                                .withAnchor("enchanted"))
                        .addTextPage("$(thing)基础状态 - 妖$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "同时满足：$()" +
                                "$(li)拥有$(thing)任意附魔$()。$()" +
                                "$(li)通过$(thing)铁砧命名$()拥有自定义名称。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)刀的$(thing)稀有度变为史诗$()（紫色）。$()" +
                                "$(li)工具提示中会$(thing)显示$(l:slashblade_base_knowledge/special_attack_intro)SA$()。$()" +
                                "$(li)允许释放$(l:slashblade_base_knowledge/special_attack_intro#super_slash_arts)超SA$()（需同时拥有$(thing)Fiercer Edge$()状态）。$()" +
                                "$(li)若配置允许，在物品栏中会$(thing)自动消耗饥饿值和经验值修复$()自身。$()$(br2)" +
                                "此状态会覆盖$(thing)印$()状态的显示。", pageBuilder -> pageBuilder
                                .withAnchor("bewitched"))
                        .addTextPage("$(thing)进阶状态 - Fiercer Edge$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "拔刀剑的$(thing)杀敌数≥1000$()。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)允许释放$(l:slashblade_base_knowledge/special_attack_intro#super_slash_arts)超SA$()（需同时拥有$(thing)妖$()状态）。$()" +
                                "$(li)$(thing)锻造数$()对攻击伤害的影响更大。$()" +
                                "$(li)杀敌数显示为$(thing)深紫色$()（默认灰色）。$()$(br2)" +
                                "$(o)提示：这是刀成长的重要里程碑，解锁强力终结技。$()", pageBuilder -> pageBuilder
                                .withAnchor("fiercer_edge"))
                        .addTextPage("$(thing)进阶状态 - Soul Eater$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "拔刀剑的$(thing)耀魂数≥10000$()。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)击杀生物获得耀魂时，$(thing)自动修复耐久$()（修复量=获得耀魂数/4，至少1点）。$()" +
                                "$(li)耀魂数显示为$(thing)深紫色$()（默认灰色）。$()$(br2)" +
                                "$(o)提示：这是刀与灵魂深度共鸣的标志，极大提升续航能力。$()", pageBuilder -> pageBuilder
                                .withAnchor("soul_eater"))
                        .addTextPage("$(thing)异常状态 - Broken$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "刀的$(thing)耐久归零$()，且刀不会因此消失。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)攻击伤害$(thing)大幅降低$()（通常无法造成伤害）。$()" +
                                "$(li)刀的外观$(thing)模型变化$()（显示为折断状态）。$()" +
                                "$(li)$(thing)无法使用$()：$(l:slashblade_base_knowledge/special_attack_intro)SA$()、超SA、所有射技、防御/格挡。$()$(br2)" +
                                "$(thing)修复方法$()：$()$(br)" +
                                "如果刀没有$(thing)Sealed$()状态，$(thing)修复至满耐久$()即可恢复。$()$(br2)" +
                                "$(o)警告：刀折断后战斗力几乎归零，请及时修复！$()", pageBuilder -> pageBuilder
                                .withAnchor("broken"))
                        .addTextPage("$(thing)异常状态 - Sealed$()$(br2)" +
                                "$(thing)获取条件$()：$()$(br)" +
                                "部分拔刀剑的$(thing)基础状态$()，如：$()" +
                                "$(li)锈刀（断）$()" +
                                "$(li)阎魔刀（断）$()$(br)" +
                                "$(thing)效果$()：$()" +
                                "$(li)所有状态$(thing)被隐藏$()（工具提示不显示）。$()" +
                                "$(li)$(thing)无法进入妖状态$()。$()" +
                                "$(li)$(thing)无法通过常规方式修复$()至未折断状态。$()" +
                                "$(li)$(thing)无法使用$()：特殊攻击（SA）、超SA、所有射技。$()$(br2)" +
                                "$(o)注意：这是刀的封印状态，需要特殊合成才能解除。$()", pageBuilder -> pageBuilder
                                .withAnchor("sealed"))
                        .addTextPage("$(thing)状态关系与成长$()：$()$(br2)" +
                                "$(thing)基础成长路线$()：$()" +
                                "$(li)$(thing)封$() → $(thing)印$()（附魔） → $(thing)妖$()（命名）$()" +
                                "$(li)$(thing)妖$() + 杀敌数1000 → $(thing)Fiercer Edge$()" +
                                "$(li)$(thing)妖$() + 耀魂数10000 → $(thing)Soul Eater$()$(br2)" +
                                "$(thing)异常状态处理$()：$()" +
                                "$(li)$(thing)Broken$()：通过修复耐久恢复。$()" +
                                "$(li)$(thing)Sealed$()：通过特定合成解除封印。$()$(br2)" +
                                "$(thing)重要提示$()：$()" +
                                "$(li)$(thing)妖$()状态是解锁高级能力的前提。$()" +
                                "$(li)$(thing)Fiercer Edge$()和$(thing)Soul Eater$()可同时拥有。$()" +
                                "$(li)部分特殊拔刀剑（如无铭刀「木偶」）有$(thing)独特的状态规则$()。$()$(br2)" +
                                "$(o)提示：刀的成长是拔刀剑玩法的核心，悉心培养你的刀，它会变得越来越强大！$()", pageBuilder -> {
                        })
        );
    }
}
