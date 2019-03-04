package jio.System.Windows;

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
import jio.System.Windows.*;
import jio.System.Windows.Media.Animation.*;
import jio.System.ComponentModel.*;
import jio.System.Windows.Markup.*;

public class FrameworkElement extends UIElement
    implements IAnimatable,
        IInputElement,
        IFrameworkInputElement,
        ISupportInitialize,
        IQueryAmbient {
  protected NObject javonetHandle;

  public FrameworkElement() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.FrameworkElement");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FrameworkElement(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean IsAmbientPropertyAvailable(java.lang.String propertyName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Windows.Markup.IQueryAmbient")
              .invoke("IsAmbientPropertyAvailable", propertyName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
