package de.korten.examples.componentfactory.webbase;

import de.korten.examples.componentfactory.componentprovider.ComponentId;
import de.korten.examples.componentfactory.componentprovider.SharedComponentFactory;
import org.apache.wicket.markup.html.WebPage;

import javax.inject.Inject;

public class BasePage extends WebPage {

    @Inject
    private SharedComponentFactory componentFactory;

    public BasePage() {

        add(componentFactory.create(ComponentId.LOGIN, "login"));
    }
}
