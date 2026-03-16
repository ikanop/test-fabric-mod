package org.ikanop.test.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class TaterEffect extends MobEffect {
    public TaterEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xe9b8b3);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        if (entity instanceof Player) {
            ((Player) entity).giveExperiencePoints(1 << amplifier);
        }

        return super.applyEffectTick(level, entity, amplifier);
    }
}
