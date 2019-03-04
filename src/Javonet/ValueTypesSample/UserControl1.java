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
import jio.System.Windows.Controls.*;
import Javonet.ValueTypesSample.*;
import jio.System.Windows.Media.Animation.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;
import jio.System.Windows.Markup.*;
import jio.System.*;

public class UserControl1 extends UserControl
    implements IAnimatable,
        IInputElement,
        IFrameworkInputElement,
        ISupportInitialize,
        IQueryAmbient,
        IAddChild,
        IComponentConnector {
  protected NObject javonetHandle;

  public UserControl1() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.UserControl1");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UserControl1(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void InitializeComponent() {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Markup.IComponentConnector")
          .invoke("InitializeComponent");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Connect(java.lang.Integer connectionId, Object target) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Markup.IComponentConnector")
          .invoke("Connect", connectionId, target);
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
