package com.arkinion.momod.util.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

@EventBusSubscriber
public class PlayerHandler
{
	@SubscribeEvent
	public static void onLivingJumpEvent(LivingJumpEvent livingJumpEvent)
	{
		if (livingJumpEvent.getEntity() != null &&
			livingJumpEvent.getEntity() instanceof EntityPlayer)
		{
			livingJumpEvent.getEntity().addVelocity(0, 0.05, 0);
		}
	}
	
	@SubscribeEvent
	public static void onSpacePressed(InputEvent.KeyInputEvent keyPressEvent)
	{
		
	}
}
