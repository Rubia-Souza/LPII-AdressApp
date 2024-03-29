package ch.rubens.address.util.concreate;

import ch.rubens.address.util.abstracts.IAddressValidation;

/**
 * Esta classe é a implementação da interface IAddressValidation de acordo com a
 * antiga forma feita pelo PersonEditDialogController. (DIP)
 * 
 * @author rubens
 */
public class AddressValidation implements IAddressValidation {
    
    @Override
    public boolean isStreetValid(String street) {
        return !(street == null || street.length() == 0);
    }

    @Override
    public boolean isPostalCodeValid(String postalCode) {
        return !(postalCode == null || postalCode.length() == 0);
    }

    @Override
    public boolean isCityValid(String city) {
        return !(city == null || city.length() == 0);
    }
    
}
