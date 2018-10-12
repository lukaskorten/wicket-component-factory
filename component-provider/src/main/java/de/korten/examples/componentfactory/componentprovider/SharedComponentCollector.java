package de.korten.examples.componentfactory.componentprovider;

import org.apache.wicket.Component;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Set;

@Service
class SharedComponentCollector {

    private HashMap<ComponentId, Class<? extends Component>> sharedComponents;

    @PostConstruct
    public void init() {

        sharedComponents = new HashMap<>();

        Reflections reflections = new Reflections("de.korten.examples.componentfactory");
        Set<Class<?>> sharedComponentClasses = reflections.getTypesAnnotatedWith(SharedComponent.class);
        sharedComponentClasses.forEach(componentsClass -> {
            ComponentId componentId = componentsClass.getAnnotation(SharedComponent.class).value();
            if (Component.class.isAssignableFrom(componentsClass)) {
                sharedComponents.put(componentId, (Class<? extends Component>) componentsClass);
            }
        });

    }

    public Class<? extends Component> getComponentsClass(ComponentId componentId) {
        return sharedComponents.get(componentId);
    }


}
