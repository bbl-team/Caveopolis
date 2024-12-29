package com.benbenlaw.caveopolis.screen;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.screen.util.CoreButtons;
import com.benbenlaw.core.screen.util.TooltipArea;
import com.benbenlaw.core.util.MouseUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;



public class WorktableScreen extends AbstractContainerScreen<WorktableMenu> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "textures/gui/worktable.png");

    public WorktableScreen(WorktableMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        this.imageHeight = 165;
        this.imageWidth = 175;
    }


    int x = (width - imageWidth) / 2;
    int y = (height - imageHeight) / 2;


    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void containerTick() {
        this.clearWidgets();
    }
    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

    }

    @Override
    public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        renderBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
        renderSlotTooltips(guiGraphics, mouseX, mouseY, x, y);
    }

    private void renderSlotTooltips(GuiGraphics guiGraphics, int mouseX, int mouseY, int x, int y) {

        TooltipArea[] tooltipAreas = {
                new TooltipArea(8, 16, 16, 16, "worktable.gui.input_slot"),
                new TooltipArea(8, 52, 16, 16, "worktable.gui.spray_slot"),
        };

        for (TooltipArea area : tooltipAreas) {
            if (MouseUtil.isMouseAboveArea(mouseX, mouseY, x, y, area.offsetX, area.offsetY, area.width, area.height)) {
                if (this.menu.getCarried().isEmpty() && this.hoveredSlot != null && !this.hoveredSlot.hasItem()) {
                    guiGraphics.renderTooltip(this.font, Component.translatable(area.translationKey), mouseX, mouseY);
                }
            }
        }

    }


}