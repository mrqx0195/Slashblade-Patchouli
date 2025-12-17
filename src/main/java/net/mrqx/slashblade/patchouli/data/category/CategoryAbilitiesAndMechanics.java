package net.mrqx.slashblade.patchouli.data.category;

import com.reimnop.pgen.builder.PGenCategoryBuilder;
import com.reimnop.pgen.builder.PGenLangBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrqx.slashblade.patchouli.SlashbladePatchouli;

public class CategoryAbilitiesAndMechanics {
    public static final String ID = "abilities_and_mechanics";

    public static void enUsCategoryBuilder(PGenCategoryBuilder builder) {
        builder.withSortnum(2);
    }

    public static void zhCnCategoryBuilder(PGenCategoryBuilder builder) {
        builder.withSortnum(2);
    }

    public static void enUsEntryBuilder(PGenLangBuilder builder) {
        builder.addEntry(ID + "/" + "guard_and_just_guard", "Guard / Just Guard", ForgeRegistries.ITEMS.getKey(Items.SHIELD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Guard$() and $(thing)Just Guard$() are core defensive techniques of Slash Blades, allowing you to block or parry enemy attacks while holding a Slash Blade.$()$(br2)" +
                                "$(thing)Guard$()：" +
                                "$(li)Used to $(thing)block projectiles$() (like arrows, fireballs);$()" +
                                "$(li)Activated by holding $(k:sneak);$()" +
                                "$(li)Successful Guard consumes 1 durability (except when rank is S or above).$()$(br2)" +
                                "$(thing)Just Guard$()：" +
                                "$(li)Used to $(thing)instantly parry attacks$() (including melee);$()" +
                                "$(li)Activated by pressing $(k:sneak) $(thing)just before$() an attack lands;$()" +
                                "$(li)Successful Just Guard $(thing)does not consume durability$(), increases rank, and automatically counterattacks.$()", pageBuilder -> {
                        })
                        .addTextPage("To activate Guard or Just Guard, all the following conditions must be met:$()" +
                                "$(li)Holding an $(thing)undamaged$() Slash Blade with $(thing)Thorns$() enchantment;$()" +
                                "$(li)Standing on $(thing)ground$();$()" +
                                "$(li)Holding $(k:sneak) $(thing)and not holding any directional keys$().$()$(br2)" +
                                "$(thing)Additional requirements for Just Guard$():$()" +
                                "$(li)When the attack lands, you are $(thing)not$() using 'Trick' type skills;$()" +
                                "$(li)Your facing direction $(thing)must not directly face$() the attack source (should face sideways or away).$()$(br2)" +
                                "$(thing)Advanced techniques$():$()" +
                                "$(li)When battle rank reaches $(thing)S or above$(), successful Guard also $(thing)does not consume durability$();$()" +
                                "$(li)'$(thing)Soul Speed$()' enchantment $(thing)extends the Just Guard timing window$(), making it easier to succeed.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Success effects$():$()" +
                                "$(li)$(thing)Blocking projectiles$(): Performs a sheath animation, blocking the projectile;$()" +
                                "$(li)$(thing)Successful Just Guard$(): Automatically swings forward in counterattack, knocking back melee enemies, and $(thing)does not consume durability$().$()$(br2)" +
                                "$(thing)Failure cases$() (cannot trigger):$()" +
                                "$(li)Receiving unblockable damage (like suffocation, fall damage, most explosions and magic damage);$()" +
                                "$(li)Pressing sneak too early (only counts as Guard, ineffective against non-projectiles);$()" +
                                "$(li)Attempting to defend while using $(thing)Sword Arts$().$()$(br2)" +
                                "$(thing)Practical advice$():$()" +
                                "$(li)For monsters with wind-up attacks, practicing 'Just Guard' is very rewarding;$()" +
                                "$(li)For fast-attacking monsters, $(thing)dodging is more reliable than Just Guard$();$()" +
                                "$(li)Note: Many Bosses use area damage, terrain damage, or other non-standard attacks, where Just Guard mechanics are $(thing)limited in applicability$().", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "kick_jump", "Kick Jump", ForgeRegistries.ITEMS.getKey(Items.SLIME_BLOCK),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Kick Jump$() (also known as wall jump) is a special aerial maneuver that allows you to perform a second jump by kicking off a wall while in the air.$()$(br2)" +
                                "$(thing)Core functions$():$()" +
                                "$(li)$(thing)Kick off walls to jump again$(), enhancing aerial mobility;$()" +
                                "$(li)Has a $(thing)cancel$() (Jump Cancel, JC) effect, which can interrupt current Sword Arts for advanced combos.$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)Player is $(thing)not on the ground$() (in the air);$()" +
                                "$(li)Press $(k:jump) while $(thing)not holding the jump key$() (usually the first press);$()" +
                                "$(li)Player is $(thing)not in Kick Jump cooldown$();$()" +
                                "$(li)Player's side is $(thing)near a block$() (within detection range).$()$(br2)" +
                                "Meeting all conditions triggers Kick Jump and grants advancement $(thing)【Abilities - Kick Jump】$().", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Trigger effects$(): Upon successful activation, the following effects occur in order:$()" +
                                "$(li)Grants $(thing)0.5 seconds$() of $(thing)invincibility$() (Untouchable);$()" +
                                "$(li)Enters $(thing)0.1 seconds$() of Kick Jump cooldown;$()" +
                                "$(li)Resets vertical fall speed to $(thing)0.8 blocks/second$() (equivalent to a new jump);$()" +
                                "$(li)Resets current Sword Art of the held Slash Blade to $(thing)none$() (achieving the 'cancel' effect).$()" +
                                "$(thing)Cancel (JC) mechanism explained$():$()$(br)" +
                                "Kick Jump forcibly interrupts any ongoing Sword Art, resetting it to no Sword Art state. This allows you to quickly chain other Sword Arts or actions in combos, a key technique for complex combos.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Detection range explanation$():$()$(br)" +
                                "The 'near a block' detection range is based on the player's hitbox, extended in all directions:$()" +
                                "$(li)In $(thing)±X direction$() (left/right): extends $(thing)0.5 blocks$() each;$()" +
                                "$(li)In $(thing)±Z direction$() (front/back): extends $(thing)1 block$() each.$()$(br2)" +
                                "This means you don't need to be right against the wall; you can trigger it within a certain distance.$()$(br2)" +
                                "$(thing)Practical techniques$():$()" +
                                "$(li)Used to $(thing)extend air time$(), dodge ground attacks, or adjust position;$()" +
                                "$(li)Using the $(thing)cancel effect$(), you can immediately follow up with other actions after Sword Arts recovery, keeping combos fluid;$()" +
                                "$(li)Very short cooldown allows $(thing)repeated use$() for multiple aerial movements.$()$(br2)" +
                                "$(o)Tip: Kick Jump is a recreation of the classic Devil May Cry move. Mastering it greatly enhances combat spectacle and operability.$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "enemy_step", "Enemy Step", ForgeRegistries.ITEMS.getKey(Items.RABBIT_FOOT),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Enemy Step$() (also known as enemy jump) is an aerial maneuver that uses creatures as stepping stones, allowing you to perform a second jump when near a creature in the air.$()$(br2)" +
                                "$(thing)Core functions$():$()" +
                                "$(li)$(thing)Use enemies as stepping stones for a double jump$(), greatly enhancing aerial mobility;$()" +
                                "$(li)Has a $(thing)cancel$() (Jump Cancel, JC) effect, which can interrupt current Sword Arts for advanced combos.$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)Player is $(thing)not on the ground$() (in the air);$()" +
                                "$(li)Press $(k:jump) while $(thing)not holding the jump key$() (usually the first press);$()" +
                                "$(li)Player is $(thing)not in Kick Jump cooldown$();$()" +
                                "$(li)Player is $(thing)near a creature$() (within detection range).$()$(br2)" +
                                "Meeting all conditions triggers Enemy Step and grants advancement $(thing)【Abilities - Enemy Step】$().", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Trigger effects$(): Upon successful activation, the following effects occur in order:$()" +
                                "$(li)Grants $(thing)0.5 seconds$() of $(thing)invincibility$() (Untouchable);$()" +
                                "$(li)Resets vertical fall speed to $(thing)0.5 blocks/second$() (equivalent to a low-height jump);$()" +
                                "$(li)Resets current Sword Art of the held Slash Blade to $(thing)none$() (achieving the 'cancel' effect).$()" +
                                "$(thing)Cancel (JC) mechanism explained$():$()$(br)" +
                                "Same as Kick Jump, Enemy Step forcibly interrupts any ongoing Sword Art, resetting it to no Sword Art state. This allows you to quickly chain other Sword Arts or actions in combos, a key technique for complex combos.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Detection range explanation$():$()$(br)" +
                                "The 'near a creature' detection range is based on the player's hitbox, extended in all directions:$()" +
                                "$(li)In $(thing)±X direction$() (left/right): extends $(thing)1 block$() each;$()" +
                                "$(li)In $(thing)±Y direction$() (up/down): extends $(thing)1 block$() each;$()" +
                                "$(li)In $(thing)±Z direction$() (front/back): extends $(thing)1 block$() each.$()$(br2)" +
                                "This means you don't need to be right against the creature; you can trigger it within a certain distance.$()$(br2)" +
                                "$(thing)Practical techniques$():$()" +
                                "$(li)Use creatures as $(thing)aerial pivots$() for multiple jumps, covering greater distances;$()" +
                                "$(li)Combine with Kick Jump for $(thing)continuous aerial maneuvers$(), achieving complex aerial combos;$()" +
                                "$(li)In Boss fights, use Enemy Step to $(thing)prolong air time$(), dodge ground skills and maintain output.$()$(br2)" +
                                "$(o)Tip: Enemy Step is a recreation of the classic Devil May Cry move. Mastering it greatly enhances combat mobility and combo potential.$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "trick_series", "Trick Series", ForgeRegistries.ITEMS.getKey(Items.ENDER_PEARL),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Trick Series$() are key movement and evasion abilities of Slash Blades, allowing players to teleport instantly in different situations, greatly enhancing mobility.$()$(br2)" +
                                "$(thing)Trick Up$(): Teleport upward$()$(br)" +
                                "$(thing)Air Trick$(): Teleport to a locked enemy's head$()$(br)" +
                                "$(thing)Trick Down$(): Quickly land from the air$()$(br)" +
                                "$(thing)Trick Dodge$(): Short-distance teleport in any direction to evade$()$(br2)" +
                                "These abilities share some keys, and most have a $(thing)cancel$() (Cancel) effect that can interrupt Sword Arts recovery for advanced combos.$()$(br2)" +
                                "$(o)Tip: Most of these abilities grant 0.5 seconds of invincibility (Untouchable). Use them wisely to avoid significant damage.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Common characteristics and techniques$():$()" +
                                "$(li)Most Tricks grant $(thing)0.5 seconds invincibility$(). Use them to avoid critical damage;$()" +
                                "$(li)The cancel effect of Air Trick and Trick Dodge sets Sword Arts to $(thing)'standby' state$(), different from Kick Jump's $(thing)'none' state$(). In some checks, it's still considered as using Sword Arts;$()" +
                                "$(li)Trick Up and Air Trick $(thing)share keys$(), with Air Trick having priority;$()" +
                                "$(li)Trick Down and Trick Dodge trigger under their own conditions, $(thing)not conflicting$() with each other.$()$(br2)" +
                                "$(thing)Practical applications$():$()" +
                                "$(li)Use Air Trick to $(thing)quickly close in on ranged enemies$() or evade area skills;$()" +
                                "$(li)Use Trick Down for $(thing)quick landing to avoid aerial attacks$();$()" +
                                "$(li)Use Trick Dodge in Boss fights for $(thing)precise positioning$() and $(thing)canceling Sword Arts recovery$();$()" +
                                "$(li)Use Trick Dodge while traveling to $(thing)increase movement efficiency$().", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Trick Up$()$()$(br2)" +
                                "$(thing)Function$(): Teleport upward a certain distance.$()$(br)" +
                                "$(thing)Keys$(): $(k:sneak) + $(k:forward) + $(k:slashblade.special_move)$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)Special move key was not pressed previously;$()" +
                                "$(li)Simultaneously hold $(thing)sneak, forward, and special move$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Grants $(thing)0.5 seconds$() invincibility;$()" +
                                "$(li)Resets vertical fall speed to $(thing)0.8 blocks/second$() (similar to a jump).$()" +
                                "If a target is locked, $(thing)Air Trick$() will be triggered first.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Air Trick$()$()$(br2)" +
                                "$(thing)Function$(): Instantly teleport to the head position of a $(thing)locked target$().$()$(br)" +
                                "$(thing)Keys$(): $(k:sneak) + $(k:forward) + $(k:slashblade.special_move)$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)A target is locked;$()" +
                                "$(li)Key conditions same as Trick Up.$()$(br2)" +
                                "$(thing)Priority$(): When both Trick Up and Air Trick conditions are met, $(thing)Air Trick takes priority$().", pageBuilder -> pageBuilder
                                .withAnchor("air_trick"))
                        .addTextPage("$(thing)Air Trick trigger process$():$()" +
                                "$(li)If the target $(thing)damaged you within 5 seconds$(), teleport directly;$()" +
                                "$(li)Otherwise, fires a $(thing)very low-damage Summoned Sword$() that teleports you upon hit (if it hits a different target, teleport is canceled).$()$(br2)" +
                                "$(thing)Teleport effects$():$()" +
                                "$(li)Grants $(thing)0.5 seconds$() invincibility;$()" +
                                "$(li)Resets Sword Arts to $(thing)'standby' state$() (cancel effect);$()" +
                                "$(li)Teleports to $(thing)in front of the target's face$() (can cross dimensions);$()" +
                                "$(li)Forces exit from riding/sleeping state.$()$(br2)" +
                                "$(o)Note: 'Standby' state is still considered as using Sword Arts in some checks, different from Kick Jump's 'none' state.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Trick Down$()$()$(br2)" +
                                "$(thing)Function$(): Quickly land when in the air.$()$(br)" +
                                "$(thing)Keys$(): $(k:sneak) + $(k:back) + $(k:slashblade.special_move)$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)Trick Up or Air Trick was not triggered previously;$()" +
                                "$(li)In the $(thing)air$();$()" +
                                "$(li)Simultaneously hold $(thing)sneak, backward, and special move$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Moves downward $(thing)5 blocks$() (succeeds if lands, otherwise reverts);$()" +
                                "$(li)Grants $(thing)0.5 seconds$() invincibility.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Trick Dodge$()$()$(br2)" +
                                "$(thing)Function$(): Short-distance teleport in $(thing)any direction$(), used to evade damage or travel.$()$(br)" +
                                "$(thing)Keys$(): $(k:slashblade.special_move) + $(k:forward) / $(k:back) / $(k:left) / $(k:right)$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)No other Trick abilities triggered previously;$()" +
                                "$(li)Standing on $(thing)ground$();$()" +
                                "$(li)Holding $(thing)special move$() and any directional key;$()" +
                                "$(li)$(thing)Consecutive uses less than 3$(), or $(thing)1 second$() has passed since last use.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Trick Dodge effects$():$()" +
                                "$(li)Displaces $(thing)3 blocks$() in the key direction (won't fall off edges);$()" +
                                "$(li)Grants $(thing)0.5 seconds$() invincibility;$()" +
                                "$(li)Resets Sword Arts to $(thing)'standby' state$() (cancel effect, same as Air Trick).$()$(br2)" +
                                "$(thing)Consecutive use limit$():$()$(br)" +
                                "Maximum $(thing)3 consecutive uses$(), then requires $(thing)1 second$() cooldown before reuse.$()$(br2)" +
                                "$(thing)Travel technique$():$()$(br)" +
                                "Intermittently press $(k:slashblade.special_move) + $(k:forward) for $(thing)consecutive forward teleports$(), greatly increasing movement speed.", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "summoned_swords_series", "Summoned Swords Series", ForgeRegistries.ITEMS.getKey(Items.DIAMOND_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Summoned Swords Series$() are ranged attack methods of Slash Blades, consuming $(thing)Proud Soul Value$() to summon and control Summoned Swords for attacks.$()$(br2)" +
                                "$(thing)Basic Summoned Sword$(): Consumes 2 Proud Soul, fires one Summoned Sword at target.$()$(br)" +
                                "$(thing)Spiral Swords$(): Consumes 20 Proud Soul, forms a defensive sword circle around self.$()$(br)" +
                                "$(thing)Storm Swords$(): Consumes 20 Proud Soul, surrounds target with Summoned Swords.$()$(br)" +
                                "$(thing)Blistering Swords$(): Consumes 20 Proud Soul, unfolds two rows of Summoned Swords for rapid strikes.$()$(br)" +
                                "$(thing)Heavy Rain Swords$(): Consumes 20 Proud Soul, summons大量 falling swords above target.$()$(br2)" +
                                "All Summoned Swords damage is based on the Slash Blade's $(thing)Power enchantment level$().$()$(br2)" +
                                "$(o)Note: Except for Basic Summoned Sword, using other Shooting Arts also triggers one Basic Summoned Sword, so actual consumption is higher!$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Common mechanisms$():$()$(br)" +
                                "$(li)All Summoned Swords damage is based on the Slash Blade's $(thing)Power enchantment level$();$()" +
                                "$(li)Except Basic Summoned Sword, other Shooting Arts cost $(thing)20 Proud Soul$() (default);$()" +
                                "$(li)Using advanced Shooting Arts $(thing)also triggers one Basic Summoned Sword$(), consuming extra Proud Soul.$()$(br2)" +
                                "$(thing)Rank influence$():$()$(br)" +
                                "$(li)Spiral/Storm/Blistering Swords: Generate $(thing)8 swords$() at rank ≥S, otherwise $(thing)6 swords$();$()" +
                                "$(li)Heavy Rain Swords: Number increases with rank, from $(thing)19 swords$() (no rank/D) to $(thing)31 swords$() (SSS).$()$(br2)" +
                                "$(thing)Combat techniques$():$()$(br)" +
                                "$(li)Basic Summoned Sword is for $(thing)ranged harassment$() and triggering other effects;$()" +
                                "$(li)Spiral Swords is suitable for $(thing)defending against close enemies$() or clearing mobs;$()" +
                                "$(li)Storm Swords is used to $(thing)control and focus fire on a single target$();$()" +
                                "$(li)Blistering Swords is good for $(thing)rapid burst damage$();$()" +
                                "$(li)Heavy Rain Swords is extremely effective against $(thing)large targets or groups$().$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Basic Summoned Sword$()$()$(br2)" +
                                "$(thing)Cost$(): $(thing)2 points$() Proud Soul (default).$()$(br)" +
                                "$(thing)Keys$(): $(k:slashblade.summon_blade)$()$(br2)" +
                                "$(thing)Trigger conditions$():$()" +
                                "$(li)Holding an undamaged, non-Sealed Slash Blade with $(thing)Power$() enchantment;$()" +
                                "$(li)Summon key was not held previously, currently pressing summon key.$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Fires one Summoned Sword at $(thing)locked target$() or $(thing)within 40 blocks ahead$();$()" +
                                "$(li)Damage equals Power enchantment level;$()" +
                                "$(li)Alternates left/right generation (odd count left, even count right).$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Spiral Swords$()$()$(br2)" +
                                "$(thing)Cost$(): $(thing)20 points$() Proud Soul (default).$()$(br)" +
                                "$(thing)Keys$(): $(thing)Hold$() $(k:slashblade.summon_blade) for at least 0.5 seconds$()$(br)" +
                                "$(thing)Additional condition$(): $(thing)Cannot move$() while holding (no directional keys pressed).$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Generates $(thing)6/8$() (8 if rank ≥S) rotating Summoned Swords around self;$()" +
                                "$(li)Swords in the circle damage approaching enemies;$()" +
                                "$(li)Holding summon key again fires all Summoned Swords.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Storm Swords$()$()$(br2)" +
                                "$(thing)Cost$(): $(thing)20 points$() Proud Soul (default).$()$(br)" +
                                "$(thing)Keys$(): $(k:sneak) + $(k:back) + $(thing)hold$() $(k:slashblade.summon_blade) for at least 0.5 seconds$()$(br)" +
                                "$(thing)Additional condition$(): Requires a $(thing)locked target$().$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Generates $(thing)6/8$() (8 if rank ≥S) rotating Summoned Swords around target;$()" +
                                "$(li)After 1 second, swords stop rotating and shoot at target together;$()" +
                                "$(li)Has $(thing)knockback$() effect.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Blistering Swords$()$()$(br2)" +
                                "$(thing)Cost$(): $(thing)20 points$() Proud Soul (default).$()$(br)" +
                                "$(thing)Keys$(): $(k:sneak) + $(k:forward) + $(thing)hold$() $(k:slashblade.summon_blade) for at least 0.5 seconds then release$()$(br)" +
                                "$(thing)Additional condition$(): $(thing)Not pressed back key$() in the last 1 second.$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Unfolds $(thing)6$() (8 if rank ≥S) Summoned Swords on both sides of body;$()" +
                                "$(li)While holding summon key, maintains unfolded state; $(thing)upon release, shoots at target sequentially$();$()" +
                                "$(li)If no locked target, shoots within 40 blocks ahead.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Heavy Rain Swords$()$()$(br2)" +
                                "$(thing)Cost$(): $(thing)20 points$() Proud Soul (default).$()$(br)" +
                                "$(thing)Keys$(): $(k:sneak) + $(k:back) → $(k:forward) + $(thing)hold$() $(k:slashblade.summon_blade) for at least 0.5 seconds then release$()$(br)" +
                                "$(thing)Additional condition$(): Pressed $(thing)back key$() within last 1.5 seconds.$()$(br2)" +
                                "$(thing)Effects$():$()" +
                                "$(li)Generates $(thing)19-31$() (increases with rank) Summoned Swords 7 blocks above target/self;$()" +
                                "$(li)Swords randomly offset in X, Z directions (at least 1 directly above);$()" +
                                "$(li)While holding summon key, hovers; $(thing)upon release, falls vertically sequentially$().$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "lock_on", "Lock On", ForgeRegistries.ITEMS.getKey(Items.ENDER_EYE),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Lock On$() is an ability of Slash Blades that allows you to concentrate attacks and certain skills on a single target.$()$(br2)" +
                                "$(thing)Basic operation$():$()$(br)" +
                                "$(li)$(thing)Press sneak$() to start locking;$()" +
                                "$(li)Release sneak to $(thing)clear current locked target$().$()$(br2)" +
                                "$(thing)Functions$():$()$(br)" +
                                "$(li)Concentrate attacks on $(thing)the same target$();$()" +
                                "$(li)Track target position in real-time;$()" +
                                "$(li)Prerequisite for abilities like $(thing)Air Trick, Storm Swords$().$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Lock On detection$():$()$(br)" +
                                "When you press sneak, the system searches for targets in this order:$()$(br2)" +
                                "$(li)First, from player's eye position, extend up to $(thing)40 blocks$() in $(thing)sight direction$(), detecting all creatures in the ray (creature hitboxes extended by 0.5 blocks);$()" +
                                "$(li)If none found, detect all creatures in the $(thing)surrounding area$().$()$(br2)" +
                                "Then filter each found creature; those meeting any of the following conditions are excluded:$()" +
                                "$(li)Players and PvP not enabled;$()" +
                                "$(li)Armor stands with Marker tag not true;$()" +
                                "$(li)Non-hostile creatures and friendly creature locking not enabled;$()" +
                                "$(li)Carrying a player;$()" +
                                "$(li)Has tag $(thing)slashblade:blacklist/attackable$() (default includes villagers, little maids).$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Priority determination$():$()$(br)" +
                                "The following conditions increase a creature's lock priority:$()$(br)" +
                                "$(li)The creature is your $(thing)revenge target$();$()" +
                                "$(li)The creature is hostile and currently targeting you or an ally;$()" +
                                "$(li)The creature is under $(thing)Glowing$() effect;$()" +
                                "$(li)The creature $(thing)has a team$().$()$(br2)" +
                                "Finally, the $(thing)closest$()符合条件的 creature is selected as locked target.$()$(br2)" +
                                "$(thing)Revenge target requirement$():$()$(br)" +
                                "Target's last received attack was from player or ally (same team, tamed, etc.), or the target is hostile and currently targeting player or ally.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Surrounding area range$():$()$(br)" +
                                "Based on player's hitbox, extended in all directions:$()$(br)" +
                                "$(li)X direction (left/right): $(thing)±12 blocks$();$()" +
                                "$(li)Z direction (front/back): $(thing)±12 blocks$();$()" +
                                "$(li)Y direction (up/down): $(thing)±6 blocks$().$()$(br2)" +
                                "This is a large area, ensuring you can lock onto creatures out of sight but nearby.$()$(br2)" +
                                "$(thing)Tracking target$():$()$(br)" +
                                "When holding a Slash Blade, having a living locked target and holding sneak, the view smoothly $(thing)turns toward target direction$() to track moving enemies.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Configuration influence$():$()$(br)" +
                                "$(li)$(thing)pvp_enable$(): Controls whether locking other players is allowed;$()" +
                                "$(li)$(thing)friendly_enable$(): Controls whether locking non-hostile creatures (like villagers, animals) is allowed.$()$(br)" +
                                "$(thing)Tag system$():$()$(br)" +
                                "Creatures with tag $(thing)slashblade:blacklist/attackable$() cannot be locked.$()$(br)" +
                                "(Default includes: $(thing)vanilla villagers$(), $(thing)Touhou Little Maid's little maids$())$()$(br2)" +
                                "$(thing)Did you know$():$()$(br)" +
                                "Lock detection only occurs on the $(thing)server side$(), so it won't lock targets that only exist client-side.", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Practical applications$():$()$(br)" +
                                "$(li)Use Lock On to ensure $(thing)accurate hits with ranged skills$() (like Summoned Swords, Air Trick);$()" +
                                "$(li)In chaotic battles, lock onto key targets for优先集火;$()" +
                                "$(li)Increase specific target's lock priority via Glowing effect or team marking.$()$(br2)" +
                                "$(thing)Notes$():$()$(br)" +
                                "$(li)Locking requires $(thing)sneak key$() operation; be careful not to confuse with Guard/Just Guard;$()" +
                                "$(li)After locking a target, some abilities (like Air Trick) will $(thing)automatically track$() target position;$()" +
                                "$(li)Lock can be $(thing)cleared$() (release sneak) and needs re-locking.$()$(br2)" +
                                "$(o)Tip: Proficient use of Lock On is fundamental to mastering advanced Slash Blade techniques. Practice in safe environments.$()", pageBuilder -> {
                        })
        );
    }

    public static void zhCnEntryBuilder(PGenLangBuilder builder) {
        builder.addEntry(ID + "/" + "guard_and_just_guard", "防御 / 格挡", ForgeRegistries.ITEMS.getKey(Items.SHIELD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)防御$()和$(thing)格挡$()是拔刀剑的核心防御技巧，可让你手持拔刀剑时抵挡或弹反敌人的攻击。$()$(br2)" +
                                "$(thing)防御$()：" +
                                "$(li)用于$(thing)抵挡飞行物$()（如箭、火球）；$()" +
                                "$(li)按住$(k:sneak)键发动；$()" +
                                "$(li)成功防御会消耗1点耐久（评价S级及以上时除外）。$()$(br2)" +
                                "$(thing)格挡$()：" +
                                "$(li)用于$(thing)瞬间弹开攻击$()（包括近战）；$()" +
                                "$(li)在攻击命中前$(thing)瞬间$()按下$(k:sneak)键发动；$()" +
                                "$(li)成功格挡$(thing)不消耗耐久$()，并能提升评价且自动反击。$()", pageBuilder -> {
                        })
                        .addTextPage("要发动防御或格挡，必须同时满足：$()" +
                                "$(li)手持$(thing)未损坏$()且带有$(thing)荆棘$()附魔的拔刀剑；$()" +
                                "$(li)站在$(thing)地面$()上；$()" +
                                "$(li)按住$(k:sneak)$(thing)且没有按住任何方向键$()。$()$(br2)" +
                                "$(thing)格挡的额外要求$()：$()" +
                                "$(li)攻击命中时，你$(thing)没有$()在使用“瞬步”类技能；$()" +
                                "$(li)你的面朝方向$(thing)不能正对$()攻击来源（需面向或侧对）。$()$(br2)" +
                                "$(thing)高级技巧$()：$()" +
                                "$(li)战斗评价达到$(thing)S级或以上$()时，普通防御成功也$(thing)不消耗耐久$()；$()" +
                                "$(li)“$(thing)灵魂疾行$()”附魔能$(thing)延长格挡判定时间$()，让你更容易成功。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)成功效果$()：$()" +
                                "$(li)$(thing)防御飞行物$()：做出收刀动作，挡掉飞行物；$()" +
                                "$(li)$(thing)成功格挡$()：自动向前挥刀反击，击退近战敌人，且$(thing)不消耗耐久$()。$()$(br2)" +
                                "$(thing)失败情况$()（无法触发）：$()" +
                                "$(li)受到无法格挡的伤害（如窒息、坠落、大多数爆炸和魔法伤害）；$()" +
                                "$(li)过早按下潜行键（仅视为普通防御，对非飞行物无效）；$()" +
                                "$(li)在发动$(thing)剑技$()期间尝试防御。$()$(br2)" +
                                "$(thing)实战建议$()：$()" +
                                "$(li)对于有前摇的怪物，练习“格挡”收益很高；$()" +
                                "$(li)对于攻击快速的怪物，$(thing)闪避比格挡更可靠$()；$()" +
                                "$(li)注意：许多Boss使用范围伤害、地形伤害等非标准攻击，此时格挡机制$(thing)适用性有限$()。", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "kick_jump", "踢跃", ForgeRegistries.ITEMS.getKey(Items.SLIME_BLOCK),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)踢跃$()（又称蹬墙跳）是一项特殊的空中机动能力，允许你在空中贴近墙壁时进行二次跳跃。$()$(br2)" +
                                "$(thing)核心作用$()：$()" +
                                "$(li)$(thing)蹬开墙壁再度跳跃$()，提升空中机动性；$()" +
                                "$(li)具有$(thing)取消$()（Jump Cancel，简称JC）效果，可中断当前剑技，用于组织高阶连招。$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)玩家$(thing)不在地上$()（处于空中）；$()" +
                                "$(li)在$(thing)未按住跳跃键$()时$(thing)按下跳跃键$()（一般为首次按下）；$()" +
                                "$(li)玩家$(thing)未处于踢跃冷却时间$()；$()" +
                                "$(li)玩家侧面$(thing)贴近方块$()（在判定范围内）。$()$(br2)" +
                                "满足以上条件即可触发踢跃，并获得进度$(thing)【能力-踢跃】$()。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)触发效果$()：成功发动踢跃后，按顺序发生以下效果：$()" +
                                "$(li)获得$(thing)0.5秒$()的$(thing)无敌状态$()（Untouchable）；$()" +
                                "$(li)进入$(thing)0.1秒$()的踢跃冷却时间；$()" +
                                "$(li)重置垂直下落速度为$(thing)0.8格/秒$()（相当于一次新的跳跃）；$()" +
                                "$(li)重置手持拔刀剑的当前剑技为$(thing)无$()（实现“取消”效果）。$()" +
                                "$(thing)取消（JC）机制详解$()：$()$(br)" +
                                "踢跃可强制中断当前正在进行的剑技，重置为无剑技状态。这允许你在连招中快速衔接其他剑技或行动，是实现复杂连招的关键技巧。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)判定范围说明$()：$()$(br)" +
                                "踢跃的“贴近方块”判定范围以玩家碰撞箱为基础，向四周拓展：$()" +
                                "$(li)在$(thing)±X方向$()（左右）各拓展$(thing)0.5格$()；$()" +
                                "$(li)在$(thing)±Z方向$()（前后）各拓展$(thing)1格$()。$()$(br2)" +
                                "这意味着你无需紧贴墙壁，在一定距离内即可触发踢跃。$()$(br2)" +
                                "$(thing)实战技巧$()：$()" +
                                "$(li)用于$(thing)延长空中停留时间$()，躲避地面攻击或调整位置；$()" +
                                "$(li)利用$(thing)取消效果$()，可在剑技后摇中立即接续其他行动，保持连击流畅；$()" +
                                "$(li)冷却时间极短，可$(thing)连续使用$()进行多次空中位移。$()$(br2)" +
                                "$(o)提示：踢跃是鬼泣系列经典动作的还原，熟练掌握可极大提升战斗的观赏性与操作性。$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "enemy_step", "借力跳", ForgeRegistries.ITEMS.getKey(Items.RABBIT_FOOT),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)借力跳$()（又称踩怪跳）是一种以生物为垫脚石的空中机动能力，允许你在空中贴近生物时进行二次跳跃。$()$(br2)" +
                                "$(thing)核心作用$()：$()" +
                                "$(li)$(thing)把敌人作为垫脚石以二段跳$()，大幅提升空中机动性；$()" +
                                "$(li)具有$(thing)取消$()（Jump Cancel，简称JC）效果，可中断当前剑技，用于组织高阶连招。$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)玩家$(thing)不在地上$()（处于空中）；$()" +
                                "$(li)在$(thing)未按住跳跃键$()时$(thing)按下跳跃键$()（一般为首次按下）；$()" +
                                "$(li)玩家$(thing)未处于踢跃的冷却时间$()；$()" +
                                "$(li)玩家$(thing)贴近生物$()（在判定范围内）。$()$(br2)" +
                                "满足以上条件即可触发借力跳，并获得进度$(thing)【能力-借力跳】$()。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)触发效果$()：成功发动借力跳后，按顺序发生以下效果：$()" +
                                "$(li)获得$(thing)0.5秒$()的$(thing)无敌状态$()（Untouchable）；$()" +
                                "$(li)重置垂直下落速度为$(thing)0.5格/秒$()（相当于一次低高度跳跃）；$()" +
                                "$(li)重置手持拔刀剑的当前剑技为$(thing)无$()（实现“取消”效果）。$()" +
                                "$(thing)取消（JC）机制详解$()：$()$(br)" +
                                "与踢跃相同，借力跳也可强制中断当前正在进行的剑技，重置为无剑技状态。这允许你在连招中快速衔接其他剑技或行动，是实现复杂连招的关键技巧。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)判定范围说明$()：$()$(br)" +
                                "借力跳的“贴近生物”判定范围以玩家碰撞箱为基础，向四周拓展：$()" +
                                "$(li)在$(thing)±X方向$()（左右）各拓展$(thing)1格$()；$()" +
                                "$(li)在$(thing)±Y方向$()（上下）各拓展$(thing)1格$()；$()" +
                                "$(li)在$(thing)±Z方向$()（前后）各拓展$(thing)1格$()。$()$(br2)" +
                                "这意味着你无需紧贴生物，在一定距离内即可触发借力跳。$()$(br2)" +
                                "$(thing)实战技巧$()：$()" +
                                "$(li)利用生物作为$(thing)空中支点$()，实现多段跳跃，跨越更大距离；$()" +
                                "$(li)配合踢跃使用，可在$(thing)空中连续机动$()，实现复杂的空中连招；$()" +
                                "$(li)在Boss战中，利用借力跳可$(thing)延长滞空时间$()，躲避地面技能并保持输出。$()$(br2)" +
                                "$(o)提示：借力跳是鬼泣系列经典动作的还原，熟练掌握可极大提升战斗的机动性与连招潜力。$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "trick_series", "瞬步系列", ForgeRegistries.ITEMS.getKey(Items.ENDER_PEARL),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)瞬步系列$()是拔刀剑所拥有的一类关键的移动与闪避能力，允许玩家在不同情境下进行瞬间移动，大幅提升机动性。$()$(br2)" +
                                "$(thing)瞬步上行$()：向上瞬间移动$()$(br)" +
                                "$(thing)隔空瞬步$()：向锁定的敌人头上瞬间移动$()$(br)" +
                                "$(thing)瞬步退行$()：空中迅速落地$()$(br)" +
                                "$(thing)瞬步回避$()：向任意方向短距离瞬移躲避$()$(br2)" +
                                "这些能力共享部分按键，且多数具有$(thing)取消$()（Cancel）效果，可用于中断剑技后摇，实现高阶连招。$()$(br2)" +
                                "$(o)提示：这些能力多具有0.5秒的无敌状态（Untouchable），善用可规避大量伤害。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)共通特性与技巧$()：$()" +
                                "$(li)多数瞬步提供$(thing)0.5秒无敌$()，善用可规避关键伤害；$()" +
                                "$(li)隔空瞬步和瞬步回避的取消效果为$(thing)“待命”状态$()，与踢跃的$(thing)“无”状态$()不同，在部分判定中仍被视为使用剑技；$()" +
                                "$(li)瞬步上行和隔空瞬步$(thing)共享按键$()，隔空瞬步优先；$()" +
                                "$(li)瞬步退行和瞬步回避在各自条件下触发，$(thing)互不冲突$()。$()$(br2)" +
                                "$(thing)实战应用$()：$()" +
                                "$(li)利用隔空瞬步$(thing)快速贴近远程敌人$()或躲避范围技能；$()" +
                                "$(li)瞬步退行用于$(thing)快速落地规避空中攻击$()；$()" +
                                "$(li)瞬步回避在Boss战中用于$(thing)精确调整位置$()和$(thing)取消剑技后摇$()；$()" +
                                "$(li)赶路时用瞬步回避$(thing)提升移动效率$()。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)瞬步上行$()$()$(br2)" +
                                "$(thing)作用$()：向上瞬间移动一段距离。$()$(br)" +
                                "$(thing)按键$()：$(k:sneak) + $(k:forward) + $(k:slashblade.special_move)$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)此前未按下特殊移动键；$()" +
                                "$(li)同时按住$(thing)潜行、向前移动、特殊移动$()。$()$(br2)" +
                                "$(thing)触发效果$()：$()" +
                                "$(li)获得$(thing)0.5秒$()无敌状态；$()" +
                                "$(li)重置垂直下落速度为$(thing)0.8格/秒$()（类似跳跃）。$()" +
                                "若此时有锁定目标，会优先触发$(thing)隔空瞬步$()。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)隔空瞬步$()$()$(br2)" +
                                "$(thing)作用$()：瞬间移动到$(thing)已锁定目标$()的头部位置。$()$(br)" +
                                "$(thing)按键$()：$(k:sneak) + $(k:forward) + $(k:slashblade.special_move)$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)已锁定一个目标；$()" +
                                "$(li)按键条件同瞬步上行。$()$(br2)" +
                                "$(thing)优先级$()：当同时满足瞬步上行和隔空瞬步条件时，$(thing)隔空瞬步优先$()触发。", pageBuilder -> pageBuilder
                                .withAnchor("air_trick"))
                        .addTextPage("$(thing)隔空瞬步触发流程$()：$()" +
                                "$(li)若目标在$(thing)5秒内伤害过你$()，直接执行传送；$()" +
                                "$(li)否则发射一枚$(thing)伤害极低的幻影剑$()，命中后执行传送（若命中非原目标则取消）。$()$(br2)" +
                                "$(thing)传送效果$()：$()" +
                                "$(li)获得$(thing)0.5秒$()无敌状态；$()" +
                                "$(li)重置剑技为$(thing)“待命”状态$()（实现取消效果）；$()" +
                                "$(li)传送至目标$(thing)面部前方$()位置（可跨维度）；$()" +
                                "$(li)强制退出骑乘/睡觉状态。$()$(br2)" +
                                "$(o)注意：“待命”状态在部分判定中仍被视为使用剑技，与踢跃的“无”状态不同。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)瞬步退行$()$()$(br2)" +
                                "$(thing)作用$()：在空中时迅速落地。$()$(br)" +
                                "$(thing)按键$()：$(k:sneak) + $(k:back) + $(k:slashblade.special_move)$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)此前未触发瞬步上行或隔空瞬步；$()" +
                                "$(li)处于$(thing)空中$()；$()" +
                                "$(li)同时按住$(thing)潜行、向后移动、特殊移动$()。$()$(br2)" +
                                "$(thing)触发效果$()：$()" +
                                "$(li)向下移动$(thing)5格$()（若落地则成功，否则回退）；$()" +
                                "$(li)获得$(thing)0.5秒$()无敌状态。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)瞬步回避$()$()$(br2)" +
                                "$(thing)作用$()：向$(thing)任意方向$()短距离瞬移，用于躲避伤害或赶路。$()$(br)" +
                                "$(thing)按键$()：$(k:slashblade.special_move) + $(k:forward) / $(k:back) / $(k:left) / $(k:right)$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)此前未触发其他瞬步能力；$()" +
                                "$(li)站在$(thing)地面$()上；$()" +
                                "$(li)按住$(thing)特殊移动$()和任意方向键；$()" +
                                "$(li)$(thing)连续使用次数小于3次$()，或距离上次使用已过$(thing)1秒$()。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)瞬步回避效果$()：$()" +
                                "$(li)向按键方向位移$(thing)3格$()（不会从边缘跌落）；$()" +
                                "$(li)获得$(thing)0.5秒$()无敌状态；$()" +
                                "$(li)重置剑技为$(thing)“待命”状态$()（取消效果，同隔空瞬步）。$()$(br2)" +
                                "$(thing)连续使用限制$()：$()$(br)" +
                                "最多连续使用$(thing)3次$()，之后需要等待$(thing)1秒$()冷却才能再次使用。$()$(br2)" +
                                "$(thing)赶路技巧$()：$()$(br)" +
                                "可间断按下 $(k:slashblade.special_move) + $(k:forward )实现$(thing)连续向前瞬移$()，大幅提升移动速度。", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "summoned_swords_series", "幻影剑系列", ForgeRegistries.ITEMS.getKey(Items.DIAMOND_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)幻影剑系列$()是拔刀剑的一种远程攻击手段，通过消耗$(thing)耀魂值$()召唤并操控幻影剑进行攻击。$()$(br2)" +
                                "$(thing)基础幻影剑$()：消耗2点耀魂值，向目标发射一枚幻影剑。$()$(br)" +
                                "$(thing)环形幻剑阵$()：消耗20点耀魂值，在自身周围形成防御剑阵。$()$(br)" +
                                "$(thing)怒风幻剑阵$()：消耗20点耀魂值，在目标周围形成包围剑阵。$()$(br)" +
                                "$(thing)急袭幻剑阵$()：消耗20点耀魂值，展开两列幻影剑快速突刺。$()$(br)" +
                                "$(thing)暴雨幻剑阵$()：消耗20点耀魂值，在目标上方召唤大量落剑。$()$(br2)" +
                                "所有幻影剑伤害基于拔刀剑的$(thing)力量附魔等级$()。$()$(br2)" +
                                "$(o)注意：除了基础幻影剑外，其他射技使用时都会同时触发一次基础幻影剑，实际消耗会更多！$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)共通机制$()：$()$(br)" +
                                "$(li)所有幻影剑伤害基于拔刀剑的$(thing)力量附魔等级$()；$()" +
                                "$(li)除基础幻影剑外，其他射技消耗均为$(thing)20点耀魂值$()（默认）；$()" +
                                "$(li)高级射技使用时$(thing)会同时触发基础幻影剑$()，消耗额外耀魂值。$()$(br2)" +
                                "$(thing)评价影响$()：$()$(br)" +
                                "$(li)环形/怒风/急袭幻剑阵：评价≥S时生成$(thing)8把$()，否则$(thing)6把$()；$()" +
                                "$(li)暴雨幻剑阵：生成数量随评价提升，从$(thing)19把$()（无评价/D）到$(thing)31把$()（SSS）。$()$(br2)" +
                                "$(thing)战斗技巧$()：$()$(br)" +
                                "$(li)基础幻影剑用于$(thing)远程消耗$()和触发其他效果；$()" +
                                "$(li)环形幻剑阵适合$(thing)防御近身敌人$()或清理杂兵；$()" +
                                "$(li)怒风幻剑阵用于$(thing)控制并集火单个目标$()；$()" +
                                "$(li)急袭幻剑阵适合$(thing)快速爆发伤害$()；$()" +
                                "$(li)暴雨幻剑阵对$(thing)大型目标或群体$()有极佳效果。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)基础幻影剑$()$()$(br2)" +
                                "$(thing)消耗$()：$(thing)2点$()耀魂值（默认）。$()$(br)" +
                                "$(thing)按键$()：$(k:slashblade.summon_blade)$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)手持未损坏、非封印状态且带有$(thing)力量$()附魔的拔刀剑；$()" +
                                "$(li)此前未按住召唤键，当前按下召唤键。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)向$(thing)已锁定目标$()或$(thing)前方40格内$()发射一枚幻影剑；$()" +
                                "$(li)伤害等于力量附魔等级；$()" +
                                "$(li)左右交替生成（统计次数奇数左、偶数右）。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)环形幻剑阵$()$()$(br2)" +
                                "$(thing)消耗$()：$(thing)20点$()耀魂值（默认）。$()$(br)" +
                                "$(thing)按键$()：$(thing)长按$()$(k:slashblade.summon_blade)至少0.5秒$()$(br)" +
                                "$(thing)附加条件$()：按住期间$(thing)不能移动$()（不按任何方向键）。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)在自身周围生成$(thing)6/8把$()（评价≥S为8把）旋转的幻影剑；$()" +
                                "$(li)剑阵中的幻影剑会伤害靠近的敌人；$()" +
                                "$(li)再次长按召唤键会将所有幻影剑射出。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)怒风幻剑阵$()$()$(br2)" +
                                "$(thing)消耗$()：$(thing)20点$()耀魂值（默认）。$()$(br)" +
                                "$(thing)按键$()：$(k:sneak) + $(k:back) + $(thing)长按$()$(k:slashblade.summon_blade)至少0.5秒$()$(br)" +
                                "$(thing)附加条件$()：需要$(thing)已锁定目标$()。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)在目标周围生成$(thing)6/8把$()（评价≥S为8把）旋转的幻影剑；$()" +
                                "$(li)1秒后幻影剑停止旋转，一齐射向目标；$()" +
                                "$(li)具有$(thing)击飞$()效果。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)急袭幻剑阵$()$()$(br2)" +
                                "$(thing)消耗$()：$(thing)20点$()耀魂值（默认）。$()$(br)" +
                                "$(thing)按键$()：$(k:sneak) + $(k:forward) + $(thing)长按$()$(k:slashblade.summon_blade)至少0.5秒后松开$()$(br)" +
                                "$(thing)附加条件$()：最近1秒内$(thing)未按过后退键$()。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)在身体两侧展开$(thing)6（评价≥S为8）把$()幻影剑；$()" +
                                "$(li)按住召唤键时保持展开状态，$(thing)松开后依次射向目标$()；$()" +
                                "$(li)若无锁定目标，则射向前方40格内。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)暴雨幻剑阵$()$()$(br2)" +
                                "$(thing)消耗$()：$(thing)20点$()耀魂值（默认）。$()$(br)" +
                                "$(thing)按键$()：$(k:sneak) + $(k:back) → $(k:forward) + $(thing)长按$()$(k:slashblade.summon_blade)至少0.5秒后松开$()$(br)" +
                                "$(thing)附加条件$()：最近1.5秒内按过$(thing)后退键$()。$()$(br2)" +
                                "$(thing)效果$()：$()" +
                                "$(li)在目标/自身上方7格处生成$(thing)19-31把$()（根据评价增加）幻影剑；$()" +
                                "$(li)幻影剑在X、Z方向随机偏移（至少1把在正上方）；$()" +
                                "$(li)按住召唤键时悬停，$(thing)松开后依次垂直落下$()。$()", pageBuilder -> {
                        })
        );
        builder.addEntry(ID + "/" + "lock_on", "锁定目标", ForgeRegistries.ITEMS.getKey(Items.ENDER_EYE),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)锁定目标$()（Lock On）是拔刀剑的能力之一，允许你将攻击和部分技能集中到单一目标上。$()$(br2)" +
                                "$(thing)基本操作$()：$()$(br)" +
                                "$(li)$(thing)按下潜行键$()开始锁定；$()" +
                                "$(li)松开潜行键时$(thing)清除当前锁定目标$()。$()$(br2)" +
                                "$(thing)作用$()：$()$(br)" +
                                "$(li)将攻击集中到$(thing)同一个目标$()上；$()" +
                                "$(li)实时追踪目标位置；$()" +
                                "$(li)是$(thing)隔空瞬步、怒风幻剑阵$()等能力的前提条件。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)锁定目标判定$()：$()$(br)" +
                                "当你按下潜行键时，系统会按照以下顺序寻找目标：$()$(br2)" +
                                "$(li)首先，从玩家眼睛位置向$(thing)视线方向$()延伸最多$(thing)40格$()，检测射线内的所有生物（生物碰撞箱额外拓展0.5格）；$()" +
                                "$(li)如果未找到，则检测$(thing)周围区域$()内的所有生物。$()$(br2)" +
                                "然后对每个找到的生物进行筛选，符合以下条件之一的会被排除：$()" +
                                "$(li)玩家且PVP未开启；$()" +
                                "$(li)盔甲架且Marker标签不为真；$()" +
                                "$(li)非敌对生物且友好生物锁定未开启；$()" +
                                "$(li)载有玩家；$()" +
                                "$(li)带有标签$(thing)slashblade:blacklist/attackable$()（默认包括村民、小女仆）。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)优先级判定$()：$()$(br)" +
                                "以下条件会提高生物的锁定优先级：$()$(br)" +
                                "$(li)该生物是你的$(thing)复仇目标$()；$()" +
                                "$(li)该生物为敌对生物且当前以你或盟友为目标；$()" +
                                "$(li)该生物处于$(thing)发光$()状态；$()" +
                                "$(li)该生物$(thing)有队伍$()。$()$(br2)" +
                                "最终会选取$(thing)距离最近$()的符合条件的生物作为锁定目标。$()$(br2)" +
                                "$(thing)复仇目标要求$()：$()$(br)" +
                                "目标最后受到的攻击来自玩家或盟友（同队伍、驯服关系等），或该目标为敌对生物且当前以玩家或盟友为目标。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)周围区域范围$()：$()$(br)" +
                                "以玩家碰撞箱为基础，向四周拓展：$()$(br)" +
                                "$(li)X方向（左右）：$(thing)±12格$()；$()" +
                                "$(li)Z方向（前后）：$(thing)±12格$()；$()" +
                                "$(li)Y方向（上下）：$(thing)±6格$()。$()$(br2)" +
                                "这是一个较大的区域，确保你能锁定到视线外但靠近的生物。$()$(br2)" +
                                "$(thing)追踪目标$()：$()$(br)" +
                                "当你手持拔刀剑、有存活的锁定目标且按住潜行键时，视角会以平滑的速度$(thing)转向目标方向$()，便于追踪移动的敌人。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)配置影响$()：$()$(br)" +
                                "$(li)$(thing)pvp_enable$()：控制是否允许锁定其他玩家；$()" +
                                "$(li)$(thing)friendly_enable$()：控制是否允许锁定非敌对生物（如村民、动物）。$()$(br)" +
                                "$(thing)标签系统$()：$()$(br)" +
                                "生物若带有$(thing)slashblade:blacklist/attackable$()标签，则无法被锁定。$()$(br)" +
                                "（默认包含：$(thing)原版村民$()、$(thing)车万女仆的小女仆$()）$()$(br2)" +
                                "$(thing)你知道吗$()：$()$(br)" +
                                "锁定判定只在$(thing)服务端$()进行，因此不会锁定仅存在于客户端的目标。", pageBuilder -> {
                        })
                        .addTextPage("$(thing)实战应用$()：$()$(br)" +
                                "$(li)利用锁定确保$(thing)远程技能准确命中$()（如幻影剑、隔空瞬步）；$()" +
                                "$(li)在混战中锁定关键目标，优先集火；$()" +
                                "$(li)通过发光效果或队伍标记提高特定目标的锁定优先级。$()$(br2)" +
                                "$(thing)注意事项$()：$()$(br)" +
                                "$(li)锁定需要$(thing)潜行键$()操作，注意不要与防御/格挡混淆；$()" +
                                "$(li)锁定目标后，部分能力（如隔空瞬步）会$(thing)自动追踪$()目标位置；$()" +
                                "$(li)锁定可被$(thing)清除$()（松开潜行键），需要重新锁定。$()$(br2)" +
                                "$(o)提示：熟练使用锁定是掌握拔刀剑高端技巧的基础，建议在安全环境中练习。$()", pageBuilder -> {
                        })
        );
    }
}
