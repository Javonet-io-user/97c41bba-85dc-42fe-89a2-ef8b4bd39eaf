package ValueTypesSample;

public enum LongEnum {
  ONE(1L),
  TWO(2L),
  ;
  private long numVal;

  LongEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
