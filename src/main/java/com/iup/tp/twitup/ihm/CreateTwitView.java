package com.iup.tp.twitup.ihm;


import com.iup.tp.twitup.datamodel.User;
import com.iup.tp.twitup.observer.twit.ITwitObserver;

import javax.swing.*;
import java.awt.*;

public class CreateTwitView extends ViewBase implements ITwitObserver {

    private final JTextField twit;

    public CreateTwitView() {
        super();

        setLayout(new GridBagLayout());
        JLabel title = new JLabel("créer un twit");
        title.setFont(title.getFont().deriveFont(48.0F));

        JLabel twitText = new JLabel("Contenu du twit :", JLabel.CENTER);
        twitText.setFont(title.getFont().deriveFont(14.0F));
        twit = new JTextField(20);

        add(title);
        add(twitText);
        add(twit);

    }
    @Override
    public void notifycreatetwit(User user, String contenu) {

    }
}
