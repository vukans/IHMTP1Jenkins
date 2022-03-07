package com.iup.tp.twitup.core;


import com.iup.tp.twitup.datamodel.IDatabase;
import com.iup.tp.twitup.datamodel.Twit;
import com.iup.tp.twitup.datamodel.User;
import com.iup.tp.twitup.observer.session.ISignedInObserver;
import com.iup.tp.twitup.observer.twit.ITwitObserver;

import java.util.ArrayList;
import java.util.List;

public class TwitController implements ITwitObserver {
    private final EntityManager entityManager;
    private final IDatabase database;

    private final List<ISignedInObserver> signedInObservers;


    public TwitController(EntityManager entityManager, IDatabase database) {
        this.entityManager = entityManager;
        this.database = database;
        signedInObservers = new ArrayList<>();
    }
    @Override
    public void notifycreatetwit(User user, String contenu) {
        Twit twit = new Twit(user, contenu);

    }
}
