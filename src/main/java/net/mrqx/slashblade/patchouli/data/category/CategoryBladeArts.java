package net.mrqx.slashblade.patchouli.data.category;

import com.reimnop.pgen.builder.PGenCategoryBuilder;
import com.reimnop.pgen.builder.PGenLangBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrqx.slashblade.patchouli.SlashbladePatchouli;

public class CategoryBladeArts {
    public static final String ID = "blade_arts";

    public static void enUsCategoryBuilder(PGenCategoryBuilder builder) {
        builder.withSortnum(1);
    }

    public static void zhCnCategoryBuilder(PGenCategoryBuilder builder) {
        builder.withSortnum(1);
    }

    public static void enUsEntryBuilder(PGenLangBuilder builder) {
        builder.addEntry(ID + "/" + "combo_series_ground", "Ground Combos", ForgeRegistries.ITEMS.getKey(Items.DIAMOND_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Combo Series$() are the basic attack combinations of Slash Blades, triggered by continuously pressing the attack button while on the ground.$()$(br2)" +
                                "$(thing)Combo A$(): The most basic 4-hit combo, fast attack speed, suitable for quickly clearing mobs.$()$(br)" +
                                "$(thing)Combo B$(): Fast multi-hit combo, can be continued after a pause, high total damage.$()$(br)" +
                                "$(thing)Combo C$(): Powerful two-hit finisher, large attack range.$()$(br)" +
                                "$(thing)Combo A EX$(): Enhanced combo with 5 attacks when under $(thing)Powered$() effects.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Combo A$()$()$(br2)" +
                                "$(thing)Trigger$(): Press $(k:attack) 4 times consecutively on the ground.$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Fast attack speed, small recovery time.$()" +
                                "$(li)1st and 2nd hits are horizontal slashes, 3rd is a diagonal slash, 4th is a spinning slash.$()" +
                                "$(li)The 4th hit has a larger attack range and can knock back surrounding enemies.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Combo B$()$()$(br2)" +
                                "$(thing)Trigger$(): Press $(k:attack) 3 times on the ground, $(thing)pause$() then continue pressing $(k:attack).$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Rapid multi-hit slashes with extremely high attack frequency.$()" +
                                "$(li)Can be looped continuously, suitable for sustained damage on single targets.$()" +
                                "$(li)Complete execution can trigger $(thing)Maximum extension of Combo B$(), dealing powerful finishing attacks.$()$(br2)" +
                                "$(o)Tip: The timing of Combo B's pause is key, practice to master it.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Combo C$()$()$(br2)" +
                                "$(thing)Trigger$(): After $(thing)Combo A$() 2nd hit, $(thing)pause$(), then press $(k:attack).$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Powerful two-hit finisher with high damage.$()" +
                                "$(li)Plays quick sheath sound effect.$()$(br2)" +
                                "$(thing)Combo Example$():$(br)" +
                                "$(o)Attack-Attack-Pause-Attack$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Combo A EX$()$()$(br2)" +
                                "$(thing)Trigger Conditions$():$()" +
                                "$(li)Under $(thing)Strength$() or $(thing)Hunger$() effects.$()" +
                                "$(li)Press $(k:attack) 5 times consecutively on the ground.$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Enhanced 5-hit combo with significantly improved damage and range.$()" +
                                "$(li)4th hit is a spinning area attack, 5th hit is a powerful finishing slash.$()" +
                                "$(li)Visually impressive, extremely high attack power.$()$(br2)" +
                                "$(o)Tip: This is an enhanced version of Combo A, requiring specific conditions to trigger.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Ground Combo Techniques$():$()$(br)" +
                                "$(li)Combo B's pause timing can be judged by sound or animation.$()" +
                                "$(li)Use $(thing)Powered$() effects to trigger Combo A EX, extremely effective against bosses.$()" +
                                "$(li)During combos, use $(thing)Trick$() or $(thing)Kick Jump$() to cancel recovery time, maintaining mobility.$()$(br2)" +
                                "$(o)Tip: Mastering ground combos is fundamental to Slash Blade combat, practice in safe areas.$()", pageBuilder -> {
                        })
        );

        builder.addEntry(ID + "/" + "combo_series_aerial", "Aerial Combos", ForgeRegistries.ITEMS.getKey(Items.FEATHER),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)Aerial Combo Series$() allow you to perform sword techniques in mid-air, enabling three-dimensional combat.$()$(br2)" +
                                "$(thing)Aerial Rave A$(): Basic 3-hit aerial combo, suitable for aerial pursuit.$()$(br)" +
                                "$(thing)Aerial Rave B$(): Spectacular aerial sequence that can launch enemies.$()$(br2)" +
                                "$(thing)Important Mechanic$(): Using any aerial combo will $(thing)clear accumulated fall distance$(), preventing fall damage.$()$(br2)" +
                                "Most aerial combos have a $(thing)slow fall$() effect, extending air time.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Aerial Rave A$()$()$(br2)" +
                                "$(thing)Trigger$(): Press $(k:attack) 3 times consecutively in mid-air.$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Basic 3-hit aerial combo with steady attack rhythm.$()" +
                                "$(li)Slows falling speed, facilitating aerial position adjustment.$()" +
                                "$(li)3rd hit has higher attack power and can knock back enemies.$()" +
                                "$(li)$(thing)Clears accumulated fall distance$(), preventing fall damage.$()$(br2)" +
                                "$(o)Tip: While performing aerial combos, holding the forward key will move you forward.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Aerial Rave B$()$()$(br2)" +
                                "$(thing)Trigger$(): Press $(k:attack) twice in mid-air, $(thing)pause$() then press $(k:attack) twice.$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Spectacular aerial sequence that $(thing)launches enemies upward$().$()" +
                                "$(li)Second hit has strong $(thing)toss$() effect.$()" +
                                "$(li)Suitable for continuous aerial suppression of enemies.$()" +
                                "$(li)$(thing)Clears accumulated fall distance$(), preventing fall damage.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Aerial Combo Techniques$():$()$(br)" +
                                "$(li)Use $(thing)Kick Jump$() or $(thing)Enemy Step$() to extend air time, performing more aerial combos.$()" +
                                "$(li)Aerial Rave B's $(thing)toss$() effect keeps enemies airborne, facilitating continued pursuit.$()" +
                                "$(li)$(thing)Fall Protection$(): Any aerial combo will $(thing)reset fall distance calculation$(), use this mechanic to land safely from heights.$()" +
                                "$(li)Be mindful of $(thing)stamina consumption$() during aerial combos to avoid inability to use other mobility skills.$()$(br2)" +
                                "$(o)Safety Tip: Using aerial combos to reset fall distance is an important survival skill, especially when exploring areas with significant height differences!$()", pageBuilder -> {
                        })
        );

        builder.addEntry(ID + "/" + "special_arts_1", "Special Arts - Rush & Pursuit", ForgeRegistries.ITEMS.getKey(Items.GOLDEN_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(1)
                        .addTextPage("$(thing)Special Arts$() are advanced techniques triggered by specific key combinations, offering unique effects and combat value.$()$(br2)" +
                                "$(thing)Rapid Slash$(): Quickly rush forward and slash enemies ahead.$()$(br)" +
                                "$(thing)Rising Star$(): Pursuit technique after hitting with Rapid Slash, spinning upward attack.$()$(br2)" +
                                "These skills typically require $(thing)direction key + sneak + attack$() combinations.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Rapid Slash$()$()$(br2)" +
                                "$(thing)Trigger$(): On ground, press $(k:sneak) + $(k:forward) + $(k:attack)$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Quickly dash forward, performing multi-hit slashes on enemies along the path.$()" +
                                "$(li)Can follow up with $(thing)Rising Star$() upon hitting enemies.$()" +
                                "$(li)Under $(thing)Strength/Hunger$() effects, starts with a quick sheath animation.$()$(br2)" +
                                "$(o)Tip: Dash distance is affected by movement speed, ensure there's enough space ahead before using.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Rising Star$()$()$(br2)" +
                                "$(thing)Trigger Conditions$():$()" +
                                "$(li)After $(thing)Rapid Slash hits an enemy$().$()" +
                                "$(li)Hold $(k:attack)$() until hitting an enemy.$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Spinning upward attack that $(thing)throws enemies into the air$().$()" +
                                "$(li)You also ascend, enabling aerial pursuit.$()" +
                                "$(li)Visually impressive, high damage.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Rush & Pursuit Techniques$():$()$(br)" +
                                "$(li)Rapid Slash can be used to $(thing)quickly approach ranged enemies$() or $(thing)avoid area attacks$().$()" +
                                "$(li)Rising Star is an excellent $(thing)opening move$() that can launch enemies for aerial combos.$()" +
                                "$(li)Combo usage: $(thing)Rapid Slash→Rising Star→Aerial Combos$() forms a complete combo chain.$()" +
                                "$(li)Be aware of Rapid Slash's $(thing)dash distance$() to avoid rushing into dangerous areas.$()$(br2)" +
                                "$(o)Tip: These skills require precise timing, practice in actual combat.$()", pageBuilder -> {
                        })
        );

        builder.addEntry(ID + "/" + "special_arts_2", "Special Arts - Uppercut & Downward Slash", ForgeRegistries.ITEMS.getKey(Items.NETHERITE_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(1)
                        .addTextPage("$(thing)Vertical Specialized Arts$() are used to handle enemies at different heights and feature unique fall protection mechanics.$()$(br2)" +
                                "$(thing)Upper Slash$(): Powerful uppercut that launches enemies.$()$(br)" +
                                "$(thing)Jumping Slash$(): Pursuit technique after Upper Slash, high jump upward.$()$(br)" +
                                "$(thing)Aerial Cleave$(): Quick downward slash in mid-air, dealing area damage.$()$(br2)" +
                                "$(thing)Fall Protection Mechanic$(): Using these aerial arts will $(thing)clear accumulated fall distance$(), preventing fall damage.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Upper Slash$()$()$(br2)" +
                                "$(thing)Trigger$(): On ground, press $(k:sneak) + $(k:back) + $(k:attack)$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Powerful uppercut that $(thing)launches enemies upward$().$()" +
                                "$(li)Can follow up with $(thing)Jumping Slash$() upon hitting.$()" +
                                "$(li)Causes $(thing)stun$() effect, strong crowd control.$()$(br2)" +
                                "$(o)Tip: Upper Slash launches enemies very high, facilitating subsequent aerial pursuit.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Jumping Slash$()$()$(br2)" +
                                "$(thing)Trigger Conditions$():$()" +
                                "$(li)After using $(thing)Upper Slash$(), keep holding $(k:attack)$().$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Makes you $(thing)jump high upward$().$()" +
                                "$(li)Significant jump height, can pursue enemies launched by Upper Slash.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Aerial Cleave$()$()$(br2)" +
                                "$(thing)Trigger$(): In mid-air, press $(k:sneak) + $(k:back) + $(k:attack)$()$(br2)" +
                                "$(thing)Features$():$()" +
                                "$(li)Quick downward slash in mid-air, dealing $(thing)area damage$() upon landing.$()" +
                                "$(li)Continuously attacks enemies below during descent.$()" +
                                "$(li)Landing has $(thing)meteor$() knockback effect, extremely large area.$()" +
                                "$(li)Generates大量 landing particle effects.$()" +
                                "$(li)$(thing)Clears accumulated fall distance$(), preventing fall damage.$()$(br2)" +
                                "$(o)Core Mechanic: Aerial Cleave not only attacks enemies but also $(thing)resets fall distance$(), making it a key skill for safe landing from heights!$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)Vertical Attack Techniques$():$()$(br)" +
                                "$(li)Upper Slash is suitable for $(thing)flying enemies$(), $(thing)mounted enemies$(), or $(thing)tall boss weak points$().$()" +
                                "$(li)Jumping Slash allows $(thing)quick height adjustment$() after Upper Slash for three-dimensional pursuit.$()" +
                                "$(li)Aerial Cleave is an excellent $(thing)fast landing method$(), combining attack and safety functions.$()" +
                                "$(li)Combo usage: $(thing)Upper Slash→Jumping Slash→Aerial Cleave$() forms a complete vertical combo.$()$(br2)" +
                                "$(thing)Fall Protection Applications$():$()$(br)" +
                                "$(li)When falling from heights, use $(thing)Aerial Cleave$() or any $(thing)aerial combo$() to land safely.$()" +
                                "$(li)In complex terrain, use vertical arts for $(thing)height adjustment$() and $(thing)safe movement$().$()" +
                                "$(li)Be mindful of Jumping Slash's $(thing)upward height$() to avoid hitting ceilings or obstacles.$()$(br2)" +
                                "$(o)Safety Tip: Be especially careful about the environment when using these skills in confined spaces.$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)General Sword Art Techniques$():$()$(br)" +
                                "$(li)All sword arts can be canceled with $(thing)Kick Jump$(), $(thing)Enemy Step$(), or $(thing)Trick$() to reduce recovery time.$()" +
                                "$(li)Sword art damage is affected by $(thing)Power enchantment$() and $(thing)battle rank$().$()" +
                                "$(li)At high ranks, sword arts' $(thing)attack range$() and $(thing)visual effects$() are enhanced.$()" +
                                "$(li)Mastering sword art cancellation is fundamental to $(thing)advanced combos$().$()$(br2)" +
                                "$(thing)Fall Protection Mechanic Explained$():$()$(br)" +
                                "$(li)When using any $(thing)aerial combo$() or $(thing)Aerial Cleave$(), the game $(thing)resets fall distance calculation$().$()" +
                                "$(li)This means even if you jump from extreme heights, as long as you use these skills before landing, you won't take fall damage.$()" +
                                "$(li)This is an important $(thing)survival mechanic$() and $(thing)movement technique$() for Slash Blades.$()$(br2)" +
                                "$(o)Tip: The core of Slash Blade combat is fluid combos, use creativity to develop your own fighting style!$()", pageBuilder -> {
                        })
        );
    }

    public static void zhCnEntryBuilder(PGenLangBuilder builder) {
        builder.addEntry(ID + "/" + "combo_series_ground", "地面连击", ForgeRegistries.ITEMS.getKey(Items.DIAMOND_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)连击系列$()是拔刀剑的基础攻击组合，通过在地面连续按下攻击键触发。$()$(br2)" +
                                "$(thing)连击 A$()：最基础的4连击，攻速快，适合快速清杂。$()$(br)" +
                                "$(thing)连击 B$()：快速多段连击，停顿后可继续，总伤害高。$()$(br)" +
                                "$(thing)连击 C$()：强力的二段终结技，攻击范围大。$()$(br)" +
                                "$(thing)连击 A 绝$()：在$(thing)魔化$()效果下的强化连击，拥有5段攻击。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)连击 A$()$()$(br2)" +
                                "$(thing)触发$()：地面连续按$(k:attack)4次。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)攻速快，硬直小。$()" +
                                "$(li)第1、2段为横向斩击，第3段为斜劈，第4段为回旋斩。$()" +
                                "$(li)第4段攻击范围较大，可击退周围敌人。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)连击 B$()$()$(br2)" +
                                "$(thing)触发$()：地面按$(k:attack)3次，$(thing)停顿$()后继续按$(k:attack)。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)快速的多段斩击，攻击频率极高。$()" +
                                "$(li)完整施展后可触发$(thing)完成连击 B$()，造成强力终结攻击。$()$(br2)" +
                                "$(o)提示：连击B的按键节奏是关键，需要掌握好停顿时机。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)连击 C$()$()$(br2)" +
                                "$(thing)触发$()：在$(thing)连击 A$()第2段后$(thing)停顿$()，再按$(k:attack)。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)强力的二段终结技，伤害较高。$()" +
                                "$(li)会播放快速收刀音效。$()$(br2)" +
                                "$(thing)连招示例$()：$(br)" +
                                "$(o)攻击-攻击-停顿-攻击$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)连击 A 绝$()$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)处于$(thing)力量$()或$(thing)饥饿$()效果下。$()" +
                                "$(li)地面连续按$(k:attack)5次。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)强化版5连击，伤害和范围显著提升。$()" +
                                "$(li)第4段为范围旋转攻击，第5段为强力终结斩。$()" +
                                "$(li)视觉效果华丽，攻击力极高。$()$(br2)" +
                                "$(o)提示：这是连击A的强化版本，需要特定状态才能触发。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)地面连击技巧$()：$()$(br)" +
                                "$(li)连击B的停顿节奏可通过声音或动画判断。$()" +
                                "$(li)利用$(thing)魔化$()触发连击A绝，对付Boss效果极佳。$()" +
                                "$(li)连击过程中可通过$(thing)瞬步$()或$(thing)踢跃$()取消后摇，保持机动性。$()$(br2)" +
                                "$(o)提示：熟练掌握地面连击是拔刀剑战斗的基础，建议在安全区域多加练习。$()", pageBuilder -> {
                        })
        );

        builder.addEntry(ID + "/" + "combo_series_aerial", "空中连击", ForgeRegistries.ITEMS.getKey(Items.FEATHER),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(0)
                        .addTextPage("$(thing)空中连击系列$()允许你在空中施展剑技，实现立体化战斗。$()$(br2)" +
                                "$(thing)御空刀舞 A$()：基础的空中3连击，适合空中追击。$()$(br)" +
                                "$(thing)御空刀舞 B$()：华丽的空中连段，可将敌人击飞。$()$(br2)" +
                                "$(thing)重要机制$()：使用任意空中连击都会$(thing)清除已下落高度$()，避免摔伤。$()$(br2)" +
                                "空中连击多数具有$(thing)减缓下落$()效果，可延长空中停留时间。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)御空刀舞 A$()$()$(br2)" +
                                "$(thing)触发$()：空中连续按$(k:attack)3次。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)基础的空中3连击，攻击节奏平稳。$()" +
                                "$(li)减缓下落速度，便于调整空中位置。$()" +
                                "$(li)第3段攻击力较高，可击退敌人。$()" +
                                "$(li)$(thing)清除已下落高度$()，避免摔伤。$()$(br2)" +
                                "$(o)提示：空中连击时，按住前进键可向前位移。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)御空刀舞 B$()$()$(br2)" +
                                "$(thing)触发$()：空中按$(k:attack)2次，$(thing)停顿$()后按$(k:attack)2次。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)华丽的空中连段，可将敌人$(thing)向上击飞$()。$()" +
                                "$(li)第二段攻击有强力的$(thing)抛投$()效果。$()" +
                                "$(li)适合空中连续压制敌人。$()" +
                                "$(li)$(thing)清除已下落高度$()，避免摔伤。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)空中连击技巧$()：$()$(br)" +
                                "$(li)利用$(thing)踢跃$()或$(thing)借力跳$()延长空中时间，施展更多空中连击。$()" +
                                "$(li)御空刀舞B的$(thing)抛投$()效果可让敌人浮空，便于继续追击。$()" +
                                "$(li)$(thing)坠落保护$()：任何空中连击都会$(thing)重置坠落高度计算$()，善用此机制可安全从高空落地。$()" +
                                "$(li)空中连击时注意$(thing)耐力消耗$()，避免无法使用其他机动技能。$()$(br2)" +
                                "$(o)安全提示：通过空中连击重置坠落高度是重要的生存技巧，尤其在探索高度落差较大的地形时！$()", pageBuilder -> {
                        })
        );

        builder.addEntry(ID + "/" + "special_arts_1", "特殊剑技 - 突进与追击", ForgeRegistries.ITEMS.getKey(Items.GOLDEN_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(1)
                        .addTextPage("$(thing)特殊剑技$()是需要特定按键组合触发的高级技巧，具有独特的效果和战斗价值。$()$(br2)" +
                                "$(thing)迅冲斩$()：快速突进并斩击前方敌人。$()$(br)" +
                                "$(thing)星旋天翔$()：迅冲斩命中后的追击技，向上旋转攻击。$()$(br2)" +
                                "这些技能通常需要$(thing)方向键+潜行+攻击$()的组合。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)迅冲斩$()$()$(br2)" +
                                "$(thing)触发$()：地面按$(k:sneak) + $(k:forward) + $(k:attack)$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)快速向前突进，对路径上的敌人进行多段斩击。$()" +
                                "$(li)命中敌人时可接续$(thing)星旋天翔$()。$()" +
                                "$(li)在$(thing)力量/饥饿$()状态下，起始会有快速收刀动作。$()$(br2)" +
                                "$(o)提示：突进距离受移动速度影响，使用前确保前方有足够空间。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)星旋天翔$()$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)$(thing)迅冲斩命中敌人$()后。$()" +
                                "$(li)按住$(k:attack)$()直到命中敌人。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)向上旋转攻击，将敌人$(thing)抛向空中$()。$()" +
                                "$(li)自身也会跟随上升，实现空中追击。$()" +
                                "$(li)视觉效果华丽，伤害较高。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)突进与追击技巧$()：$()$(br)" +
                                "$(li)迅冲斩可用来$(thing)快速接近远程敌人$()或$(thing)躲避范围攻击$()。$()" +
                                "$(li)星旋天翔是优秀的$(thing)起手技$()，可将敌人打浮空后接空中连击。$()" +
                                "$(li)组合使用：$(thing)迅冲斩→星旋天翔→空中连击$()形成完整连招。$()" +
                                "$(li)注意迅冲斩的$(thing)突进距离$()，避免冲入危险区域。$()$(br2)" +
                                "$(o)提示：这些技能需要精准的按键时机，建议在实战中多加练习。$()", pageBuilder -> {
                        })
        );

        builder.addEntry(ID + "/" + "special_arts_2", "特殊剑技 - 上挑与下劈", ForgeRegistries.ITEMS.getKey(Items.NETHERITE_SWORD),
                SlashbladePatchouli.prefix(ID), entryBuilder -> entryBuilder.withSortnum(1)
                        .addTextPage("$(thing)垂直方向特化剑技$()用于应对不同高度的敌人，并具备独特的坠落保护机制。$()$(br2)" +
                                "$(thing)上斩$()：强力上挑攻击，可将敌人击飞。$()$(br)" +
                                "$(thing)跃升斩$()：上斩后的追击技，自身向上高跳。$()$(br)" +
                                "$(thing)空坠斩$()：空中快速下劈，造成范围伤害。$()$(br2)" +
                                "$(thing)坠落保护机制$()：使用这些空中剑技都会$(thing)清除已下落高度$()，避免摔伤。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)上斩$()$()$(br2)" +
                                "$(thing)触发$()：地面按$(k:sneak) + $(k:back) + $(k:attack)$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)强力上挑斩击，将敌人$(thing)向上击飞$()。$()" +
                                "$(li)命中后可接续$(thing)跃升斩$()。$()" +
                                "$(li)造成$(thing)击晕$()效果，控制能力强。$()$(br2)" +
                                "$(o)提示：上斩的击飞高度很高，便于后续空中追击。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)跃升斩$()$()$(br2)" +
                                "$(thing)触发条件$()：$()" +
                                "$(li)使用$(thing)上斩$()后保持按住$(k:attack)$()。$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)自身$(thing)向上高跳$()。$()" +
                                "$(li)跃起高度可观，可追击被上斩打飞的敌人。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)空坠斩$()$()$(br2)" +
                                "$(thing)触发$()：空中按$(k:sneak) + $(k:back) + $(k:attack)$()$(br2)" +
                                "$(thing)特点$()：$()" +
                                "$(li)空中快速下劈，落地时造成$(thing)范围伤害$()。$()" +
                                "$(li)下落过程中持续攻击下方敌人。$()" +
                                "$(li)落地时有$(thing)陨石$()击退效果，范围极大。$()" +
                                "$(li)生成大量落地粒子效果。$()" +
                                "$(li)$(thing)清除已下落高度$()，避免摔伤。$()$(br2)" +
                                "$(o)核心机制：空坠斩不仅能攻击敌人，还能$(thing)重置坠落高度$()，是从高处安全落地的关键技能！$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)垂直攻击技巧$()：$()$(br)" +
                                "$(li)上斩适合对付$(thing)飞行敌人$()、$(thing)骑乘敌人$()或$(thing)高大Boss的弱点$()。$()" +
                                "$(li)跃升斩可在上斩后$(thing)快速调整高度$()，实现立体追击。$()" +
                                "$(li)空坠斩是优秀的$(thing)快速落地手段$()，同时兼具攻击与安全功能。$()" +
                                "$(li)组合使用：$(thing)上斩→跃升斩→空坠斩$()形成完整的垂直连招。$()$(br2)" +
                                "$(thing)坠落保护应用$()：$()$(br)" +
                                "$(li)从高处坠落时，使用$(thing)空坠斩$()或任意$(thing)空中连击$()可安全落地。$()" +
                                "$(li)在复杂地形中，善用垂直剑技进行$(thing)高度调整$()和$(thing)安全移动$()。$()" +
                                "$(li)注意跃升斩的$(thing)上升高度$()，避免撞到天花板或障碍物。$()$(br2)" +
                                "$(o)安全提示：这些技能在封闭空间使用时需要特别注意环境。$()", pageBuilder -> {
                        })
                        .addTextPage("$(thing)通用剑技技巧$()：$()$(br)" +
                                "$(li)所有剑技都可被$(thing)踢跃$()、$(thing)借力跳$()、$(thing)瞬步$()取消后摇。$()" +
                                "$(li)剑技的伤害受$(thing)力量附魔$()、$(thing)战斗评价$()影响。$()" +
                                "$(li)高评价时剑技的$(thing)攻击范围$()和$(thing)视觉效果$()会增强。$()" +
                                "$(li)熟练掌握剑技取消是$(thing)高阶连招$()的基础。$()$(br2)" +
                                "$(thing)坠落保护机制详解$()：$()$(br)" +
                                "$(li)使用任意$(thing)空中连击$()或$(thing)空坠斩$()时，游戏会$(thing)重置坠落高度计算$()。$()" +
                                "$(li)这意味着即使从极高处跳下，只要在落地前使用这些技能，就不会受到坠落伤害。$()" +
                                "$(li)这是拔刀剑重要的$(thing)生存机制$()和$(thing)移动技巧$()。$()$(br2)" +
                                "$(o)提示：拔刀剑的战斗核心是流畅的连招，发挥创造力组合出属于自己的战斗风格！$()", pageBuilder -> {
                        })
        );
    }
}
