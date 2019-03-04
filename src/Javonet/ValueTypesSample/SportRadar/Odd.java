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
import jio.System.Collections.Generic.*;

public class Odd {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setId(java.lang.String value) {
    try {
      javonetHandle.set("Id", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getId() {
    try {
      java.lang.String res = javonetHandle.get("Id");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setType(OddType value) {
    try {
      javonetHandle.set("Type", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public OddType getType() {
    try {
      Object res = javonetHandle.<NEnum>get("Type");
      if (res == null) return null;
      return OddType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSpecialOddsValue(java.lang.String value) {
    try {
      javonetHandle.set("SpecialOddsValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSpecialOddsValue() {
    try {
      java.lang.String res = javonetHandle.get("SpecialOddsValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setTypeId(java.lang.Long value) {
    try {
      javonetHandle.set("TypeId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getTypeId() {
    try {
      java.lang.Long res = javonetHandle.get("TypeId");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSubType(java.lang.Long value) {
    try {
      javonetHandle.set("SubType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getSubType() {
    try {
      java.lang.Long res = javonetHandle.get("SubType");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** SetProperty */

  public void setOddFields(Dictionary<java.lang.String, OddField> value) {
    try {
      javonetHandle.set("OddFields", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, OddField> getOddFields() {
    try {
      Object res = javonetHandle.<NObject>get("OddFields");
      if (res == null) return null;
      return new Dictionary<java.lang.String, OddField>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Odd() {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.SportRadar.Odd");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Odd(NObject handle) {
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
