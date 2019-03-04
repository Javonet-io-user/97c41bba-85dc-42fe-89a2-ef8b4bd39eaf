package ValueTypesSample;

public enum ShortEnum {
  ONE(1L),
  TWO(2L),
  ;
  private long numVal;

  ShortEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
