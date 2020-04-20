package com.projectreddog.modularmachinemod.utilties;

import java.util.List;

import com.projectreddog.modularmachinemod.ModularMachineMod;
import com.projectreddog.modularmachinemod.blocks.MachineModuleBlock;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockInteractions {

	public static Boolean SetBlock(World world, BlockPos blockPos, BlockState blockState) {
		Boolean rtnvalue = world.setBlockState(blockPos, blockState);
		world.notifyBlockUpdate(blockPos, world.getBlockState(blockPos), world.getBlockState(blockPos), 3);
		return rtnvalue;

	}

	public static Boolean isBlockMachineModule(World world, BlockPos blockPos) {
		if (world.getBlockState(blockPos).getBlock() instanceof MachineModuleBlock) {
			return true;
		} else {
			return false;
		}
	}

	public static List<BlockPos> FindConnectedMachineModules(World world, BlockPos blockPos, List<BlockPos> bpl) {
		// bpl = new ArrayList<BlockPos>();
		if (isBlockMachineModule(world, blockPos)) {
			if (!bpl.contains(blockPos)) {
				// not already in list so start adding
				bpl.add(blockPos);
				ModularMachineMod.LOGGER.info("Added block at : " + blockPos + " it is of type " + world.getBlockState(blockPos).getBlock().getRegistryName());
				// scan adjacent blocks
				// up 9 blocks
				bpl = FindConnectedMachineModules(world, blockPos.up(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().north(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().north().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().north().west(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().south(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().south().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().south().west(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.up().west(), bpl);

				// same level

				bpl = FindConnectedMachineModules(world, blockPos.north(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.north().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.north().west(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.south(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.south().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.south().west(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.west(), bpl);

				// down

				bpl = FindConnectedMachineModules(world, blockPos.down(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().north(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().north().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().north().west(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().south(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().south().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().south().west(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().east(), bpl);
				bpl = FindConnectedMachineModules(world, blockPos.down().west(), bpl);
			}
		}

		return bpl;
	}

}
