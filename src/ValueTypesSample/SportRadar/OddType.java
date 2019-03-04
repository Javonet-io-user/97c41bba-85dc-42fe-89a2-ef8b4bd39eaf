package ValueTypesSample.SportRadar;

public enum OddType {
  TypeA(0L),
  TypeB(1L),
  ;
  private long numVal;

  OddType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
