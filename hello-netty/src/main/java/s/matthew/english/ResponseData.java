package s.matthew.english;

public class ResponseData {
  private int intValue;

  public int getIntValue() {
    return intValue;
  }

  public void setIntValue(int intValue) {
    this.intValue = intValue;
  }

  public String toString() {
    return Integer.toString(intValue);
  }
}
