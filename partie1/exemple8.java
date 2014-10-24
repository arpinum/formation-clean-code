
public class Customer() {

  // constructor
  public Customer() {

  }

  // returns age
  publit int getAge() {
    return age;
  }

  /** The name **/
  private String name;

  /** The name **/
  private int age;
}




 // ugly hack to support removing element by index
// see https://jira.mongodb.org/browse/SERVER-1014
if (pull != null) {
    LOGGER.debug("Cleaning array : {}  values: {}", q, pull);
    collection.update(q, new BasicDBObject(DbObjectDiff.Modifier.PULL.toString(), pull));
}
