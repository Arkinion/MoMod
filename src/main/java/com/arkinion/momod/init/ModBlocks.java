package com.arkinion.momod.init;

import java.util.ArrayList;
import java.util.List;

import com.arkinion.momod.blocks.DirtyBlock;
import com.arkinion.momod.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block DIRTY_BLOCK = new DirtyBlock("dirty_block", Material.SAND);
}
