package jio.System.Windows.Controls;

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
import jio.System.Windows.Controls.*;
import jio.System.Windows.Media.Animation.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;
import jio.System.Windows.Markup.*;
import jio.System.*;

public class ContentControl extends Control
    implements IAnimatable,
        IInputElement,
        IFrameworkInputElement,
        ISupportInitialize,
        IQueryAmbient,
        IAddChild {
  protected NObject javonetHandle;

  public ContentControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Controls.ContentControl");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ContentControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void AddChild(Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Markup.IAddChild")
          .invoke("AddChild", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddText(java.lang.String text) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Markup.IAddChild")
          .invoke("AddText", text);
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
