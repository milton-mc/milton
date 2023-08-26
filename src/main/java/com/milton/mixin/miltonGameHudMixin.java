package com.milton.mixin;


import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class miltonGameHudMixin {
	@Inject(method = "render", at = @At("RETURN"), cancellable = true)
	private void onRender(DrawContext context, float tickDelta, CallbackInfo ci) {}
}
