package Javonet.ValueTypesSample.SportRadar;

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
import Javonet.ValueTypesSample.SportRadar.*;
import jio.System.*;

public class OddField {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTypeId(java.lang.Integer value) {
    try {
      javonetHandle.set("TypeId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTypeId() {
    try {
      java.lang.Integer res = javonetHandle.get("TypeId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setValue(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("Value", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Nullable<java.math.BigDecimal> getValue() {
    try {
      Object res = javonetHandle.<NObject>get("Value");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOutcome(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("Outcome", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Nullable<java.lang.Boolean> getOutcome() {
    try {
      Object res = javonetHandle.<NObject>get("Outcome");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setVoidFactor(java.lang.Double value) {
    try {
      javonetHandle.set("VoidFactor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Double getVoidFactor() {
    try {
      java.lang.Double res = javonetHandle.get("VoidFactor");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  public void setActive(java.lang.Boolean value) {
    try {
      javonetHandle.set("Active", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getActive() {
    try {
      java.lang.Boolean res = javonetHandle.get("Active");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public OddField() {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.SportRadar.OddField");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OddField(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
