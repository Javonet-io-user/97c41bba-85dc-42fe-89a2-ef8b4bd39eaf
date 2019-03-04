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

public class DelegateSample {
  protected NObject javonetHandle;

  public DelegateSample() {
    try {
      javonetHandle = Javonet.New("ValueTypesSample.DelegateSample");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DelegateSample(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Sum(SomeDelegate computationCompletedCallBack, java.lang.Integer arg) {
    try {
      javonetHandle.invoke("Sum", computationCompletedCallBack, arg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer SumAndAdd(
      SomeDelegateWithResult computationCompletedCallBack, java.lang.Integer arg) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SumAndAdd", computationCompletedCallBack, arg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public <TTypeOne, TTypeTwo> java.lang.Integer SumAndAdd(
      SomeGenericDelegate<TTypeOne, TTypeTwo> computationCompletedCallBack,
      TTypeOne arg,
      TTypeTwo arg2) {
    try {
      java.lang.Integer res =
          javonetHandle
              .generic(getGetObjectName(arg), getGetObjectName(arg2))
              .invoke("SumAndAdd", computationCompletedCallBack, arg, arg2);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public <TTypeOne, TTypeTwo> void SumAndAddVoid(
      SomeGenericDelegateVoid<TTypeOne, TTypeTwo> computationCompletedCallBack,
      TTypeOne arg,
      TTypeTwo arg2) {
    try {
      javonetHandle
          .generic(getGetObjectName(arg), getGetObjectName(arg2))
          .invoke("SumAndAddVoid", computationCompletedCallBack, arg, arg2);
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
