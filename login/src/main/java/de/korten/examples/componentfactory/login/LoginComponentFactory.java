package de.korten.examples.componentfactory.login;

import de.korten.examples.componentfactory.webbase.ISharedComponentFactory;
import org.apache.wicket.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginComponentFactory implements ISharedComponentFactory {

    @Override
    public Component createLoginComponent(String markupId) {
        return new LoginInformationPanel(markupId);
    }
}
