package de.korten.examples.componentfactory.webbase;

import org.apache.wicket.markup.html.WebPage;

import javax.inject.Inject;

public class BasePage extends WebPage {

    @Inject
    private ISharedComponentFactory componentFactory;

    public BasePage() {

        add(componentFactory.createLoginComponent("login"));
    }
}
