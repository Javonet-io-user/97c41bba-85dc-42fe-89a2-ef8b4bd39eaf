package Javonet.ValueTypesSample.SportRadar;

public enum Status {
  StatusA(0L),
  StatusB(1L),
  ;
  private long numVal;

  Status(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
