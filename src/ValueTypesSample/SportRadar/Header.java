package ValueTypesSample.SportRadar;

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
import ValueTypesSample.SportRadar.*;

public class Header {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setBetStatus(BetStatus value) {
    try {
      javonetHandle.set("BetStatus", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public BetStatus getBetStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("BetStatus");
      if (res == null) return null;
      return BetStatus.valueOf(((NEnum) res).getValueName());
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

  public void setStatus(Status value) {
    try {
      javonetHandle.set("Status", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Status getStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("Status");
      if (res == null) return null;
      return Status.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Header() {
    try {
      javonetHandle = Javonet.New("ValueTypesSample.SportRadar.Header");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Header(NObject handle) {
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
