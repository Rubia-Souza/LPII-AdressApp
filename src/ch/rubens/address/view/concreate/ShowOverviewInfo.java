package ch.rubens.address.view.concreate;

import ch.rubens.address.util.abstracts.IFormater;
import ch.rubens.address.util.concreate.LocalDateFormater;
import ch.rubens.address.view.PersonOverviewController;
import ch.rubens.address.view.abstracts.IShowPersonInfo;
import ch.rubens.address.model.abstracts.IPerson;

/**
 * Esta classe é a implementação de IShowPersonInfo de acordo com a forma que deve
 * ser exibida pela modal aberta para editar alguma pessoa cadastrada.
 * 
 * @author rubens
 */
public class ShowOverviewInfo implements IShowPersonInfo {
    
    private PersonOverviewController controller;
    
    public ShowOverviewInfo(PersonOverviewController controller) {
        
        setController(controller);
        
    }
    
    @Override
    public void loadInfo(IPerson person) {
        
        if (person != null) {
            
            IFormater dateFormater = new LocalDateFormater("dd/MM/yyyy");
            
            controller.getFirstNameLabel().setText(person.getFirstName());
            controller.getLastNameLabel().setText(person.getLastName());
            controller.getStreetLabel().setText(person.getStreet());
            controller.getPostalCodeLabel().setText(Integer.toString(person.getPostalCode()));
            controller.getCityLabel().setText(person.getCity());
            controller.getBirthdayLabel().setText(dateFormater.format(person.getBirthday()));
            
        }
        else {
            
            hideInfo();
            
        }
        
    }    
    
    @Override
    public void hideInfo() {
        
        controller.getFirstNameLabel().setText("");
        controller.getLastNameLabel().setText("");
        controller.getStreetLabel().setText("");
        controller.getPostalCodeLabel().setText("");
        controller.getCityLabel().setText("");
        controller.getBirthdayLabel().setText("");
        
    }
    
    public PersonOverviewController getController() {
        return controller;
    }
    
    private void setController(PersonOverviewController controller) {
        this.controller = controller;
    }
    
}
