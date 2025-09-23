package net.minheur.potoflux.screen.tabs.all;

import net.minheur.potoflux.screen.tabs.BaseTab;

import javax.swing.*;
import java.awt.*;

public class HomeTab extends BaseTab {
    @Override
    protected void setPanel() {
        addDesc();
    }

    private void addDesc() {
        JLabel desc = new JLabel("Créé par Min_heur2000 - TechnoMastery");
        desc.setFont(new Font("Consolas", Font.PLAIN, 15));
        desc.setAlignmentX(Component.CENTER_ALIGNMENT);
        PANEL.add(desc);
    }

    @Override
    protected String getTitle() {
        return "PotoFlux - Home";
    }
}
