package Javonet.ValueTypesSample.SportRadar;

public enum BetStatus {
  Started(0L),
  Stopped(1L),
  ;
  private long numVal;

  BetStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
