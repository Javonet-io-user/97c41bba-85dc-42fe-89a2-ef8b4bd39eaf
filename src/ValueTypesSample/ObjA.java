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
import ValueTypesSample.*;
import jio.System.*;

public class ObjA {
  protected NObject javonetHandle;

  public ObjA() {
    try {
      javonetHandle = Javonet.New("ValueTypesSample.ObjA");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjA(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void GetInstance(
      RootBaseOneSourceNode arg0,
      FuncT1T2TResult<MyType<MySubType>, MyOtherType, MyAnotherType> arg,
      MyAnotherType arg1,
      java.lang.Integer arg2) {
    try {
      Javonet.getType("ObjA").invoke("GetInstance", arg0, arg, arg1, arg2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public RootBaseOneSourceNode GetRoot() {
    try {
      Object res = javonetHandle.invoke("GetRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
