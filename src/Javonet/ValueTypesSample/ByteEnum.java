package Javonet.ValueTypesSample;

public enum ByteEnum {
  ONE(1L),
  TWO(2L),
  ;
  private long numVal;

  ByteEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
