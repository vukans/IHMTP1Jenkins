package com.iup.tp.twitup.component;

import javax.swing.*;
import java.awt.*;

public class TwitComponent extends JPanel {
    public TwitComponent(String contenu) {
        super();

        JLabel myTwit = new JLabel("contenu" + contenu , JLabel.CENTER);

        add(myTwit);
    }
}
