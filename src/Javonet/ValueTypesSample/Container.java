package Javonet.ValueTypesSample;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Javonet.ValueTypesSample.*;

public class Container {
  protected NObject javonetHandle;

  public Container() {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.Container");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Container(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public enum RunTypes {
    Expired(0L),
    Trial(1L),
    Full(2L),
    UnKnown(-99L),
    UnAuthorizedTry(-1L),
    ;
    private long numVal;

    RunTypes(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public static class Nested {
    public NObject javonetHandle;

    public Nested() {
      try {
        javonetHandle = Javonet.New("Javonet.ValueTypesSample.Container+Nested");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Nested(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
