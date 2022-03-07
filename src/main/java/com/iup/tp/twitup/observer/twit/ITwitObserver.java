package com.iup.tp.twitup.observer.twit;

import com.iup.tp.twitup.datamodel.User;

public interface ITwitObserver {

    void notifycreatetwit(User user, String contenu);
}
