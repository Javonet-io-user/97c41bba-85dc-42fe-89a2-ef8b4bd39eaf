package ValueTypesSample;

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
import jio.System.*;
import ValueTypesSample.*;
import jio.System.Collections.Generic.*;

public class TestStruct extends ValueType {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setDecimalField(java.math.BigDecimal value) {
    try {
      javonetHandle.set("DecimalField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.math.BigDecimal getDecimalField() {
    try {
      java.math.BigDecimal res = javonetHandle.get("DecimalField");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.math.BigDecimal[][] getTwoDimArray(Class<?> returnArrayType) {
    try {
      Object[][] res = javonetHandle.<NObject[][]>get("TwoDimArray");
      if (res == null) return null;
      return (java.math.BigDecimal[][])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public List<TestStruct> getStructList() {
    try {
      Object res = javonetHandle.<NObject>get("StructList");
      if (res == null) return null;
      return new List<TestStruct>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDoubleField(java.lang.Double value) {
    try {
      javonetHandle.set("DoubleField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Double getDoubleField() {
    try {
      java.lang.Double res = javonetHandle.get("DoubleField");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  public void setFloatField(java.lang.Float value) {
    try {
      javonetHandle.set("FloatField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Float getFloatField() {
    try {
      java.lang.Float res = javonetHandle.get("FloatField");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUShortField(java.lang.Integer value) {
    try {
      javonetHandle.set("UShortField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getUShortField() {
    try {
      java.lang.Integer res = javonetHandle.get("UShortField");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setUIntField(java.lang.Long value) {
    try {
      javonetHandle.set("UIntField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getUIntField() {
    try {
      java.lang.Long res = javonetHandle.get("UIntField");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setULongField(java.math.BigInteger value) {
    try {
      javonetHandle.set("ULongField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.math.BigInteger getULongField() {
    try {
      java.math.BigInteger res = javonetHandle.get("ULongField");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setShortField(java.lang.Short value) {
    try {
      javonetHandle.set("ShortField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Short getShortField() {
    try {
      java.lang.Short res = javonetHandle.get("ShortField");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setIntField(java.lang.Integer value) {
    try {
      javonetHandle.set("IntField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getIntField() {
    try {
      java.lang.Integer res = javonetHandle.get("IntField");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setLongField(java.lang.Long value) {
    try {
      javonetHandle.set("LongField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getLongField() {
    try {
      java.lang.Long res = javonetHandle.get("LongField");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSByteField(java.lang.Byte value) {
    try {
      javonetHandle.set("SByteField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Byte getSByteField() {
    try {
      java.lang.Byte res = javonetHandle.get("SByteField");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setByteField(java.lang.Byte value) {
    try {
      javonetHandle.set("ByteField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Byte getByteField() {
    try {
      java.lang.Byte res = javonetHandle.get("ByteField");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCharField(java.lang.Character value) {
    try {
      javonetHandle.set("CharField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Character getCharField() {
    try {
      java.lang.Character res = javonetHandle.get("CharField");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setStringField(java.lang.String value) {
    try {
      javonetHandle.set("StringField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getStringField() {
    try {
      java.lang.String res = javonetHandle.get("StringField");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBoolField(java.lang.Boolean value) {
    try {
      javonetHandle.set("BoolField", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBoolField() {
    try {
      java.lang.Boolean res = javonetHandle.get("BoolField");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public TestStruct(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer[][] GetTwoDimArray(Class<?> returnArrayType) {
    try {
      Object[][] res = javonetHandle.invoke("GetTwoDimArray");
      if (res == null) return null;
      return (java.lang.Integer[][])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
