package com.arkinion.momod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DirtyBlock extends FallingBlockBase
{
	public DirtyBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setHardness(1.0f);
		setResistance(1.0f);
		setHarvestLevel("shovel", 0);
		setLightLevel(0.0f);
	}
}
