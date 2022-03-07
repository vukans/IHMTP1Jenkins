package com.iup.tp.twitup.ihm;

import com.iup.tp.twitup.component.ProfilComponent;
import com.iup.tp.twitup.observer.profiles.IGetProfilesObserver;
import com.iup.tp.twitup.observer.profiles.IProfilesObserver;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListProfilesView extends ViewBase implements IGetProfilesObserver {

	private final List<IProfilesObserver> profilesObservers;

	private int x = 1;

	public ListProfilesView() {
		super();

		profilesObservers = new ArrayList<>();

		setLayout(new GridBagLayout());

		JScrollPane scroller = new JScrollPane(this);
	}

	public void showProfiles() {
		profilesObservers.forEach(IProfilesObserver::notifyGetProfiles);
	}

	@Override
	public void notifyGotProfiles(String tag, String name, int follows, String avatar) {
		ProfilComponent profilComponent = new ProfilComponent(tag, name, follows, avatar);

		this.add(profilComponent, new GridBagConstraints(0, x, 1, 1, 0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(15, 15, 15, 15),
				0, 0));

		x++;
		revalidate();
		repaint();
	}

	public void addProfilesObserver(IProfilesObserver profilesObserver) {
		profilesObservers.add(profilesObserver);
	}
}
