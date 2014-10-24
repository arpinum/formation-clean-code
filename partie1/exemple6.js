
public class Customer {

  public Customer(Date birthDate) {
    if(birthdate.isAfter(new Date())) {
      throw new IllegalArgumentException();
    }
    this.birthDate = birthDate;
  }

  private Date birthDate;

}

////////

Date pastDate = /* une date dans le passé*/;
Customer customer = new Customer(pastDate);

pastDate.setTime(/* une valeur dans le futur*/)







public class UserValidator {

  private Cryptographer cryptographer;

  public boolean checkPassword(String userName, String password) {
    User user = UserGateway.findByName(userName);
    if(user != null) {
      String encodedPhrase = user.getPhraseEncodedByPassword();
      String phrase = cryptographer.decrypt(encodedPhrase, password);
      if("Valid Password".equals(phrase)) {
        Session.initialize();
        return true;
      }
    }
    return false;
  }

}
