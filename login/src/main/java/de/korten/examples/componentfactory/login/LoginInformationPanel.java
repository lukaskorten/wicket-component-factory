package de.korten.examples.componentfactory.login;

import de.korten.examples.componentfactory.componentprovider.ComponentId;
import de.korten.examples.componentfactory.componentprovider.SharedComponent;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;

import static org.wicketstuff.lazymodel.LazyModel.from;
import static org.wicketstuff.lazymodel.LazyModel.model;

@SharedComponent(ComponentId.LOGIN)
public class LoginInformationPanel extends GenericPanel<UserInformation> {

    public LoginInformationPanel(String id) {
        super(id, new UserInformationModel());

        add(new Label("firstname", model(from(UserInformation.class).getFirstname()).bind(getModel())));
        add(new Label("lastname", model(from(UserInformation.class).getLastname()).bind(getModel())));

    }
}
