package Javonet.ValueTypesSample.SportRadar;

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
import Javonet.ValueTypesSample.SportRadar.*;
import jio.System.Collections.Generic.*;

public class Message {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setScore(java.lang.String value) {
    try {
      javonetHandle.set("Score", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getScore() {
    try {
      java.lang.String res = javonetHandle.get("Score");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setTypeOfMessage(MessageType value) {
    try {
      javonetHandle.set("TypeOfMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public MessageType getTypeOfMessage() {
    try {
      Object res = javonetHandle.<NObject>get("TypeOfMessage");
      if (res == null) return null;
      return new MessageType((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEventHeader(Header value) {
    try {
      javonetHandle.set("EventHeader", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Header getEventHeader() {
    try {
      Object res = javonetHandle.<NObject>get("EventHeader");
      if (res == null) return null;
      return new Header((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOdds(List<Odd> value) {
    try {
      javonetHandle.set("Odds", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public List<Odd> getOdds() {
    try {
      Object res = javonetHandle.<NObject>get("Odds");
      if (res == null) return null;
      return new List<Odd>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Message() {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.SportRadar.Message");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Message(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public MessageType GetType() {
    try {
      Object res = javonetHandle.invoke("GetType");
      if (res == null) return null;
      return new MessageType((NObject) res);
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
