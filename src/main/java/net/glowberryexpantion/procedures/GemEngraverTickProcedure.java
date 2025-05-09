package net.glowberryexpantion.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.glowberryexpantion.init.GlowberryExpantionModItems;
import net.glowberryexpantion.GlowberryExpantionMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class GemEngraverTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean IsCrafting = false;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.LAPIS_LAZULI && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == GlowberryExpantionModItems.BLUE_GLOWBERRY_EXTRACT.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == GlowberryExpantionModItems.CHISEL.get() && (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Crafting")) == false && (0 == new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) || new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) <= 63)) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("Crafting", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 3;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							if (_stk.hurt(_amount, RandomSource.create(), null)) {
								_stk.shrink(1);
								_stk.setDamageValue(0);
							}
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("craftingProgress", 200);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowberry_expantion:engraver_use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowberry_expantion:engraver_use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			GlowberryExpantionMod.queueServerWork(20, () -> {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", 400);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				GlowberryExpantionMod.queueServerWork(20, () -> {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingProgress", 600);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					GlowberryExpantionMod.queueServerWork(20, () -> {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craftingProgress", 800);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						GlowberryExpantionMod.queueServerWork(20, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("craftingProgress", 1000);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							GlowberryExpantionMod.queueServerWork(20, () -> {
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("craftingProgress", 1200);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								GlowberryExpantionMod.queueServerWork(20, () -> {
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
										if (_ent != null) {
											final int _slotid = 1;
											final ItemStack _setstack = new ItemStack(GlowberryExpantionModItems.LAPIS_LAUNCH_GEM.get()).copy();
											_setstack.setCount((int) (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
									if (!world.isClientSide()) {
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (!world.isClientSide()) {
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putBoolean("Crafting", false);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
								});
							});
						});
					});
				});
			});
		} else {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.DIAMOND && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == GlowberryExpantionModItems.BLUE_GLOWBERRY_EXTRACT.get() && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == GlowberryExpantionModItems.CHISEL.get() && (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Crafting")) == false && (0 == new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 1) || new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 1) <= 63)) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("Crafting", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 2;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								if (_stk.hurt(_amount, RandomSource.create(), null)) {
									_stk.shrink(1);
									_stk.setDamageValue(0);
								}
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", 200);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowberry_expantion:engraver_use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowberry_expantion:engraver_use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				GlowberryExpantionMod.queueServerWork(20, () -> {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingProgress", 400);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					GlowberryExpantionMod.queueServerWork(20, () -> {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craftingProgress", 600);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						GlowberryExpantionMod.queueServerWork(20, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("craftingProgress", 800);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							GlowberryExpantionMod.queueServerWork(20, () -> {
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("craftingProgress", 1000);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								GlowberryExpantionMod.queueServerWork(20, () -> {
									if (!world.isClientSide()) {
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putDouble("craftingProgress", 1200);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									GlowberryExpantionMod.queueServerWork(20, () -> {
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = 1;
												final ItemStack _setstack = new ItemStack(GlowberryExpantionModItems.INGRAVED_DIAMOND.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										if (!world.isClientSide()) {
											BlockPos _bp = BlockPos.containing(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = BlockPos.containing(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putBoolean("Crafting", false);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									});
								});
							});
						});
					});
				});
			} else {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.AMETHYST_SHARD && (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == GlowberryExpantionModItems.PURPLE_GLOWBERRY_EXTRACT.get() && (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == GlowberryExpantionModItems.CHISEL.get() && (new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "Crafting")) == false && (0 == new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 1) || new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 1) <= 63)) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("Crafting", true);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 3;
							final int _amount = 1;
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final int _amount = 1;
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 2;
							final int _amount = 1;
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									if (_stk.hurt(_amount, RandomSource.create(), null)) {
										_stk.shrink(1);
										_stk.setDamageValue(0);
									}
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingProgress", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowberry_expantion:engraver_use")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowberry_expantion:engraver_use")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					GlowberryExpantionMod.queueServerWork(20, () -> {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craftingProgress", 400);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						GlowberryExpantionMod.queueServerWork(20, () -> {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("craftingProgress", 600);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							GlowberryExpantionMod.queueServerWork(20, () -> {
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("craftingProgress", 800);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								GlowberryExpantionMod.queueServerWork(20, () -> {
									if (!world.isClientSide()) {
										BlockPos _bp = BlockPos.containing(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putDouble("craftingProgress", 1000);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									GlowberryExpantionMod.queueServerWork(20, () -> {
										if (!world.isClientSide()) {
											BlockPos _bp = BlockPos.containing(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("craftingProgress", 1200);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										GlowberryExpantionMod.queueServerWork(20, () -> {
											{
												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
												if (_ent != null) {
													final int _slotid = 1;
													final ItemStack _setstack = new ItemStack(GlowberryExpantionModItems.INGRAVED_AMETHYST.get()).copy();
													_setstack.setCount((int) (new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
											if (!world.isClientSide()) {
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											if (!world.isClientSide()) {
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putBoolean("Crafting", false);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										});
									});
								});
							});
						});
					});
				}
			}
		}
	}
}
