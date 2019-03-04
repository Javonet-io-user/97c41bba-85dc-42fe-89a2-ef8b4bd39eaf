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

public class ExplicitMethodSample implements itf {
  protected NObject javonetHandle;

  public ExplicitMethodSample() {
    try {
      javonetHandle = Javonet.New("ValueTypesSample.ExplicitMethodSample");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExplicitMethodSample(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public <T> T MyGenericMethod(T genericArgument, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(genericArgument), getReturnObjectName(returnType))
              .explicitInterface("ValueTypesSample.itf")
              .invoke("MyGenericMethod", genericArgument);
      if (res == null) return null;
      return (T) Convert(res, returnType);
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
