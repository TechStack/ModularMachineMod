package com.projectreddog.modularmachinemod.items;

import java.util.ArrayList;
import java.util.List;

import com.projectreddog.modularmachinemod.blocks.MachineModuleBlock;
import com.projectreddog.modularmachinemod.reference.Reference;
import com.projectreddog.modularmachinemod.utilties.BlockInteractions;

import net.minecraft.block.Block;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WrenchItem extends MachineModuleItem {

	public WrenchItem() {
		super();
		setRegistryName(Reference.REGISTRY_NAME_WRENCH_ITEM);
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getPlayer().world;
		if (!world.isRemote) {
			// server

			BlockPos blockPos = context.getPos();
// DIRECTION IF NEEDED LATER .. HOW TO
			// Direction d = Direction.getFacingFromVector(context.getPlayer().getLookVec().getX(), 0, context.getPlayer().getLookVec().getZ());

			Block b = world.getBlockState(blockPos).getBlock();
			if (b instanceof MachineModuleBlock) {
				// ONE OF US
				List<BlockPos> bpl = new ArrayList<BlockPos>();
				bpl = BlockInteractions.FindConnectedMachineModules(world, blockPos, bpl);
				// BlockInteractions.SetBlock(world, blockPos, Blocks.AIR.getDefaultState());
// SEND this to BPL (block position List ) for processing in a entity creation method that reads the blocks and loads it up into the entity information.

				// Entity size. Including center
				// Reletative block positions
				// seat position
				// Block attributes contribute to entity attributes

				return ActionResultType.SUCCESS;
			}
		}

		return ActionResultType.FAIL;

	}
}
