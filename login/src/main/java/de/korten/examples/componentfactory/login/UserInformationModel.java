package de.korten.examples.componentfactory.login;

import org.apache.wicket.model.LoadableDetachableModel;

public class UserInformationModel extends LoadableDetachableModel<UserInformation> {


    @Override
    protected UserInformation load() {
        UserInformation userInformation = new UserInformation();
        userInformation.setFirstname("Lukas");
        userInformation.setLastname("Korten");
        return userInformation;
    }
}
