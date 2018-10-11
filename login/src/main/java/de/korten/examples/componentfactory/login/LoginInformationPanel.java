package de.korten.examples.componentfactory.login;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;

import static org.wicketstuff.lazymodel.LazyModel.from;
import static org.wicketstuff.lazymodel.LazyModel.model;

public class LoginInformationPanel extends GenericPanel<UserInformation> {

    public LoginInformationPanel(String id) {
        super(id, new UserInformationModel());

        add(new Label("firstname", model(from(UserInformation.class).getFirstname()).bind(getModel())));
        add(new Label("lastname", model(from(UserInformation.class).getLastname()).bind(getModel())));


    }
}
