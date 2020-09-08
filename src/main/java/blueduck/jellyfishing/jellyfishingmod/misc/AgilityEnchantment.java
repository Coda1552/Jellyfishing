package blueduck.jellyfishing.jellyfishingmod.misc;

import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingEnchantments;
import blueduck.jellyfishing.jellyfishingmod.registry.JellyfishingItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

public class AgilityEnchantment extends Enchantment {


    public AgilityEnchantment(Rarity rarityIn, EquipmentSlotType[] slots) {
        super(rarityIn, JellyfishingEnchantments.ENCHANTMENT_TYPE, slots);
    }
    public int getMinEnchantability(int enchantmentLevel) {
        return 0;
    }

    public int getMaxEnchantability(int enchantmentLevel) {
        return 50;
    }


    public int getMinLevel() {
        return 1;
    }
    /**
     * Returns the maximum level that the enchantment can have.
     */
    public int getMaxLevel() {
        return 1;
    }
}
