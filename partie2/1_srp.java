public interface Modem {

  public void dial(String number);

  public void hangup();

  public void send(byte[] data);

  public byte read();
  
}
