package dev.loosername.example.items

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class FabricItem(val settings: Settings): Item(settings) {
    override fun use(world: World?, user: PlayerEntity, hand: Hand?): TypedActionResult<ItemStack> {
        user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F)
        return TypedActionResult(ActionResult.SUCCESS, user.getStackInHand(hand))
    }
}