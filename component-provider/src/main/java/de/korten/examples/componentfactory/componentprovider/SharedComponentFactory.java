package de.korten.examples.componentfactory.componentprovider;

import org.apache.wicket.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Service
public class SharedComponentFactory {

    private final SharedComponentCollector componentCollector;

    @Autowired
    public SharedComponentFactory(SharedComponentCollector componentCollector) {
        this.componentCollector = componentCollector;
    }

    public Component create(ComponentId componentId, String wicketId) {

        Class<? extends Component> componentsClass = componentCollector.getComponentsClass(componentId);

        try {
            Constructor<? extends Component> componentsConstructor = componentsClass.getConstructor(String.class);
            return componentsConstructor.newInstance(wicketId);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Die zu initialisierende Komponente hat keinen Wicket-Standard-Konstruktor", e);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new IllegalStateException("Die Komponente konnte nicht initalisiert werden", e);
        }

    }
}
