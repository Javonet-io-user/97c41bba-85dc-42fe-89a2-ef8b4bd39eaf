package Javonet.ValueTypesSample;

public enum DefaultEnum {
  ONE(1L),
  TWO(2L),
  ;
  private long numVal;

  DefaultEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
