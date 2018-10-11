package de.korten.examples.componentfactory.webbase;


import org.apache.wicket.Component;

public interface ISharedComponentFactory {

    Component createLoginComponent(String markupId);

}
