package ValueTypesSample;

public enum DWProductTypes {
  One(0L),
  Two(1L),
  Three(2L),
  ;
  private long numVal;

  DWProductTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
