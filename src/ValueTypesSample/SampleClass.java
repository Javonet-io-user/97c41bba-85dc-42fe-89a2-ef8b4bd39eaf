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

public class SampleClass<T> {
  protected NObject javonetHandle;
  /** GenericConstructor */
  public SampleClass(Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("ValueTypesSample.SampleClass`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SampleClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public <K> void GenricMethod() {
    try {
      javonetHandle.invoke("GenricMethod");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MethodWithTypeArg(jio.System.Type arg) {
    try {
      javonetHandle.invoke("MethodWithTypeArg", arg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MethodWithNestedEnumArg(Container.RunTypes type) {
    try {
      javonetHandle.invoke("MethodWithNestedEnumArg", NEnum.fromJavaEnum(type));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
