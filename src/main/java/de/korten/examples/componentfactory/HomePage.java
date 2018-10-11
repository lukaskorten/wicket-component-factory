package de.korten.examples.componentfactory;

import de.korten.examples.componentfactory.webbase.BasePage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.ResourceModel;
import org.wicketstuff.annotation.mount.MountPath;

/**
 * The home page of the "hello-world"-application.
 */
@MountPath("/")
public class HomePage extends BasePage {

    public HomePage() {

        add(new Label("greeting", new ResourceModel("greeting.helloWorld")));

    }
}
