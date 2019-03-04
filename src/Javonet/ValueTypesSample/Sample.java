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
import jio.System.Collections.Generic.*;
import jio.System.*;

public class Sample implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public DefaultEnum getEnumProperty() {
    try {
      Object res = javonetHandle.<NEnum>get("EnumProperty");
      if (res == null) return null;
      return DefaultEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMeasureEventsTime(java.lang.Long value) {
    try {
      javonetHandle.set("MeasureEventsTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getMeasureEventsTime() {
    try {
      java.lang.Long res = javonetHandle.get("MeasureEventsTime");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDefaultEnum(DefaultEnum value) {
    try {
      javonetHandle.set("DefaultEnum", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DefaultEnum getDefaultEnum() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultEnum");
      if (res == null) return null;
      return DefaultEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLongEnum(LongEnum value) {
    try {
      javonetHandle.set("LongEnum", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LongEnum getLongEnum() {
    try {
      Object res = javonetHandle.<NEnum>get("LongEnum");
      if (res == null) return null;
      return LongEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setByteEnum(ByteEnum value) {
    try {
      javonetHandle.set("ByteEnum", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ByteEnum getByteEnum() {
    try {
      Object res = javonetHandle.<NEnum>get("ByteEnum");
      if (res == null) return null;
      return ByteEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setShortEnum(ShortEnum value) {
    try {
      javonetHandle.set("ShortEnum", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ShortEnum getShortEnum() {
    try {
      Object res = javonetHandle.<NEnum>get("ShortEnum");
      if (res == null) return null;
      return ShortEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCarriers(java.lang.Integer[] value) {
    try {
      javonetHandle.set("Carriers", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer[] getCarriers(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Carriers");
      if (res == null) return null;
      return (java.lang.Integer[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getTestInt() {
    try {
      java.lang.Integer res = javonetHandle.get("TestInt");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Short getTestShort() {
    try {
      java.lang.Short res = javonetHandle.get("TestShort");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Long getTestLong() {
    try {
      java.lang.Long res = javonetHandle.get("TestLong");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Float getTestFloat() {
    try {
      java.lang.Float res = javonetHandle.get("TestFloat");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getTestBool() {
    try {
      java.lang.Boolean res = javonetHandle.get("TestBool");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Integer getTestUShort() {
    try {
      java.lang.Integer res = javonetHandle.get("TestUShort");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Character getTestChar() {
    try {
      java.lang.Character res = javonetHandle.get("TestChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Byte getTestByte() {
    try {
      java.lang.Byte res = javonetHandle.get("TestByte");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Byte getTestSByte() {
    try {
      java.lang.Byte res = javonetHandle.get("TestSByte");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Long getTestUInt() {
    try {
      java.lang.Long res = javonetHandle.get("TestUInt");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.math.BigInteger getTestULong() {
    try {
      java.math.BigInteger res = javonetHandle.get("TestULong");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Double getTestDouble() {
    try {
      java.lang.Double res = javonetHandle.get("TestDouble");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** GetProperty */

  public java.math.BigDecimal getTestDecimal() {
    try {
      java.math.BigDecimal res = javonetHandle.get("TestDecimal");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGetSetInt(java.lang.Integer value) {
    try {
      javonetHandle.set("GetSetInt", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getGetSetInt() {
    try {
      java.lang.Integer res = javonetHandle.get("GetSetInt");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setGetSetLong(java.lang.Long value) {
    try {
      javonetHandle.set("GetSetLong", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Long getGetSetLong() {
    try {
      java.lang.Long res = javonetHandle.get("GetSetLong");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGetSetChar(java.lang.Character value) {
    try {
      javonetHandle.set("GetSetChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Character getGetSetChar() {
    try {
      java.lang.Character res = javonetHandle.get("GetSetChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGetSetShort(java.lang.Short value) {
    try {
      javonetHandle.set("GetSetShort", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Short getGetSetShort() {
    try {
      java.lang.Short res = javonetHandle.get("GetSetShort");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public Sample() {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.Sample");
      javonetHandle.addEventListener(
          "TestEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ShowResultHandler handler : _TestEventListeners) {
                handler.Invoke(
                    Convert(objects[0], java.math.BigDecimal.class),
                    Convert(objects[1], Sample.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Sample(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetByteArray(AtomicReference<java.lang.Byte[]> array) {
    try {
      javonetHandle.invoke(
          "GetByteArray",
          new NOut(array, JavonetHelper.JavaToDotnetType.get(java.lang.Byte[].class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public List<Document> GetDocs() {
    try {
      Object res = javonetHandle.invoke("GetDocs");
      if (res == null) return null;
      return new List<Document>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void DisplayDocs(Document[] docs) {
    try {
      javonetHandle.invoke("DisplayDocs", new Object[] {docs});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DisplayDocs(List<Document> docs) {
    try {
      javonetHandle.invoke("DisplayDocs", docs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EnumArg(DefaultEnum arg) {
    try {
      javonetHandle.invoke("EnumArg", NEnum.fromJavaEnum(arg));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EmptyMethod() {
    try {
      javonetHandle.invoke("EmptyMethod");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void TenArgs(
      java.lang.String arg1,
      java.lang.Integer arg2,
      java.lang.String arg3,
      java.lang.Integer arg4,
      java.lang.String arg5,
      java.lang.Integer arg6,
      java.lang.Integer arg7,
      java.lang.Integer arg8,
      java.lang.Integer arg9,
      java.lang.Integer arg10) {
    try {
      javonetHandle.invoke("TenArgs", arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public DefaultEnum EnumResult() {
    try {
      Object res = javonetHandle.invoke("EnumResult");
      if (res == null) return null;
      return DefaultEnum.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean GetOutMultipleStrings(
      AtomicReference<java.lang.String> str1,
      AtomicReference<java.lang.String> str2,
      AtomicReference<java.lang.String> str3,
      AtomicReference<java.lang.String> str4,
      AtomicReference<java.lang.String> str5) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "GetOutMultipleStrings",
              new NOut(str1, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(str2, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(str3, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(str4, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(str5, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean GetDateTime(DateTime date) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("GetDateTime", date);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean GetOutString(AtomicReference<java.lang.String> date) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "GetOutString",
              new NOut(date, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean GetOutList(List<CashierEntity> date) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("GetOutList", date);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean MethodWithIntArg(ITestInt testint) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("MethodWithIntArg", testint);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void PassTypeArg(jio.System.Type myType) {
    try {
      javonetHandle.invoke("PassTypeArg", myType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GenerateEvents() {
    try {
      javonetHandle.invoke("GenerateEvents");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Callback() {
    try {
      javonetHandle.invoke("Callback");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Test() {
    try {
      javonetHandle.invoke("Test");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RunCalculate(java.lang.Integer count) {
    try {
      javonetHandle.invoke("RunCalculate", count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RunCalculatePrime(java.lang.Integer count) {
    try {
      javonetHandle.invoke("RunCalculatePrime", count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IsPrimeNumber(java.lang.Integer num) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsPrimeNumber", num);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer Calculate(java.lang.Integer i, java.lang.Integer result) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Calculate", i, result);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void RunCalculate() {
    try {
      javonetHandle.invoke("RunCalculate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Calculate() {
    try {
      javonetHandle.invoke("Calculate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MeasureEvents() {
    try {
      javonetHandle.invoke("MeasureEvents");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetRandomInt() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetRandomInt");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public <T> java.lang.String GetRandom(T param) {
    try {
      java.lang.String res =
          javonetHandle.generic(getGetObjectName(param)).invoke("GetRandom", param);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static void StaticSetRef(AtomicReference<java.lang.String> arg) {
    try {
      Javonet.getType("Sample").invoke("StaticSetRef", new NRef(arg));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticSetRefArray(AtomicReference<java.lang.String[]> arg) {
    try {
      Javonet.getType("Sample").invoke("StaticSetRefArray", new NRef(arg));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticSetRefArray(Item[] arg) {
    try {
      Javonet.getType("Sample").invoke("StaticSetRefArray", new Object[] {arg});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void PopulateOutArray(Item[] arg) {
    try {
      javonetHandle.invoke("PopulateOutArray", new Object[] {arg});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticSetOut(AtomicReference<java.lang.String> arg) {
    try {
      Javonet.getType("Sample")
          .invoke(
              "StaticSetOut",
              new NOut(arg, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticSetOutInt(AtomicReference<java.lang.Integer> arg) {
    try {
      Javonet.getType("Sample")
          .invoke(
              "StaticSetOutInt",
              new NOut(arg, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static <T> void StaticSetRef(T arg, T value) {
    try {
      Javonet.getType("Sample")
          .generic(getGetObjectName(arg), getGetObjectName(value))
          .invoke("StaticSetRef", arg, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void StaticSetRefItem(Item arg, Item value) {
    try {
      Javonet.getType("Sample").invoke("StaticSetRefItem", arg, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static <T> void StaticSetOut(T arg, T value) {
    try {
      Javonet.getType("Sample")
          .generic(getGetObjectName(arg), getGetObjectName(value))
          .invoke("StaticSetOut", arg, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetRef(AtomicReference<java.lang.String> arg) {
    try {
      javonetHandle.invoke("SetRef", new NRef(arg));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetRefArray(AtomicReference<java.lang.String[]> arg) {
    try {
      javonetHandle.invoke("SetRefArray", new NRef(arg));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetRefArray(Item[] arg) {
    try {
      javonetHandle.invoke("SetRefArray", new Object[] {arg});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetOut(AtomicReference<java.lang.String> arg) {
    try {
      javonetHandle.invoke(
          "SetOut", new NOut(arg, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetOutInt(AtomicReference<java.lang.Integer> arg) {
    try {
      javonetHandle.invoke(
          "SetOutInt", new NOut(arg, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T> void SetRef(T arg, T value) {
    try {
      javonetHandle
          .generic(getGetObjectName(arg), getGetObjectName(value))
          .invoke("SetRef", arg, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetRefItem(Item arg, Item value) {
    try {
      javonetHandle.invoke("SetRefItem", arg, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T> void SetOut(T arg, T value) {
    try {
      javonetHandle
          .generic(getGetObjectName(arg), getGetObjectName(value))
          .invoke("SetOut", arg, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T> T GetRandom(Object arg1, Object arg2, Class<?> returnType) {
    try {
      Object res =
          javonetHandle.generic(getReturnObjectName(returnType)).invoke("GetRandom", arg1, arg2);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static <T> T GetStaticRandom(Object arg1, Object arg2, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Sample")
              .generic(getReturnObjectName(returnType))
              .invoke("GetStaticRandom", arg1, arg2);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String[] GetItems(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetItems");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Item[] GetRefItems(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetRefItems");
      if (res == null) return null;
      return (Item[]) JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void DisplayArray(java.lang.String[] items) {
    try {
      javonetHandle.invoke("DisplayArray", new Object[] {items});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DisplayArray(Item[] items) {
    try {
      javonetHandle.invoke("DisplayArray", new Object[] {items});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer AddInt(java.lang.Integer a, java.lang.Integer b) {
    try {
      java.lang.Integer res = javonetHandle.invoke("AddInt", a, b);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Character ReturnChar(java.lang.Character c) {
    try {
      java.lang.Character res = javonetHandle.invoke("ReturnChar", c);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Long AddLong(java.lang.Long a, java.lang.Long b) {
    try {
      java.lang.Long res = javonetHandle.invoke("AddLong", a, b);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Float AddFloat(java.lang.Float a, java.lang.Float b) {
    try {
      java.lang.Float res = javonetHandle.invoke("AddFloat", a, b);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Double AddDouble(java.lang.Double a, java.lang.Double b) {
    try {
      java.lang.Double res = javonetHandle.invoke("AddDouble", a, b);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  public java.lang.String ShowInt() {
    try {
      java.lang.String res = javonetHandle.invoke("ShowInt");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ShowLong() {
    try {
      java.lang.String res = javonetHandle.invoke("ShowLong");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ShowChar() {
    try {
      java.lang.String res = javonetHandle.invoke("ShowChar");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ShowShort() {
    try {
      java.lang.String res = javonetHandle.invoke("ShowShort");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public <T> T MyGenericMethod(T genericArgument, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(genericArgument), getReturnObjectName(returnType))
              .invoke("MyGenericMethod", genericArgument);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> void MyGenericMethodVoid(T genericArgument) {
    try {
      javonetHandle
          .generic(getGetObjectName(genericArgument))
          .invoke("MyGenericMethodVoid", genericArgument);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static <T> T MyGenericMethodStatic(T genericArgument, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Sample")
              .generic(getGetObjectName(genericArgument), getReturnObjectName(returnType))
              .invoke("MyGenericMethodStatic", genericArgument);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T MyGenericMethod(T genericArgument, java.lang.Integer a, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(genericArgument), getReturnObjectName(returnType))
              .invoke("MyGenericMethod", genericArgument, a);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T MyGenericMethod(T genericArgument, java.lang.String b, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(genericArgument), getReturnObjectName(returnType))
              .invoke("MyGenericMethod", genericArgument, b);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static <T> void MyGenericMethodVoidStatic(T genericArgument) {
    try {
      Javonet.getType("Sample")
          .generic(getGetObjectName(genericArgument))
          .invoke("MyGenericMethodVoidStatic", genericArgument);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Byte[] LoadFile(java.lang.String filePath, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("LoadFile", filePath);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Double[] IncreaseByTen(java.lang.Double[] inputArray, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("IncreaseByTen", new Object[] {inputArray});
      if (res == null) return null;
      return (java.lang.Double[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SaveFile(java.lang.Byte[] byteArray, java.lang.String filePath) {
    try {
      javonetHandle.invoke("SaveFile", new Object[] {byteArray}, filePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<ShowResultHandler> _TestEventListeners =
      new java.util.ArrayList<ShowResultHandler>();

  public void addTestEvent(ShowResultHandler toAdd) {
    _TestEventListeners.add(toAdd);
  }

  public void removeTestEvent(ShowResultHandler toRemove) {
    _TestEventListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
