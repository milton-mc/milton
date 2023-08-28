package com.milton.mixin;


import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.milton.MiltonMod.LOGGER;

@Mixin(PlayerEntity.class)
public class GetPlayerDamageMixin {

	@Inject(at = @At("RETURN"), method = "damage")
	private void onDamage(DamageSource source, float amount, CallbackInfoReturnable info) {
		LOGGER.info("DamageSource: " + source.getName());
		LOGGER.info("Damage: " + amount);
	}
}
