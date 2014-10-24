

public class RabbitMqClient {

    private Channel createChannel(String name, Connection connection) throws IOException {
            Channel channel = connection.createChannel();
            channel.queueDeclare(nomCanal, true, false, false, null);
            return channel;
        }
}



/////

if(deletePage(page) == E_OK) {
  if(registry.deleteReference(page.name) == E_OK) {
    if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
      logger.log("page deleted");
    } else {
        logger.log("config key not deleted")
    }
  } else {
      logger.log("deleteReference not deleted");
  }
} else {
  logger.log("delete failed");
  return E_ERROR;
}

// VS

try {
  deletePage(page);
  registry.deleteReference(page.name);
  configKeys.deleteKey(page.name.makeKey);
} catch(Exception e) {
  logger.log(e.getMessage());
}
