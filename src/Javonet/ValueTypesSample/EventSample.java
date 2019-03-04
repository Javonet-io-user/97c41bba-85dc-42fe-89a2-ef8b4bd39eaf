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
import jio.System.*;

public class EventSample {
  protected NObject javonetHandle;

  public EventSample() {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.EventSample");
      javonetHandle.addEventListener(
          "MyEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SomeEventHandler handler : _MyEventListeners) {
                handler.Invoke(Convert(objects[0], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MyEventWithResult",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SomeEventWithResultHandler handler : _MyEventWithResultListeners) {
                handler.Invoke(Convert(objects[0], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SampleEvent2",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventExampleHandler2 handler : _SampleEvent2Listeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], java.lang.String.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SampleEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventExampleHandler handler : _SampleEventListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], java.lang.String.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EventSample(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void EventInvoke() {
    try {
      javonetHandle.invoke("EventInvoke");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void TriggerEvent(java.lang.String arg) {
    try {
      javonetHandle.invoke("TriggerEvent", arg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String TriggerEventWithResult(java.lang.String arg) {
    try {
      java.lang.String res = javonetHandle.invoke("TriggerEventWithResult", arg);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String TriggerEventWithResultHang(java.lang.String arg) {
    try {
      java.lang.String res = javonetHandle.invoke("TriggerEventWithResultHang", arg);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Event */

  private java.util.ArrayList<SomeEventHandler> _MyEventListeners =
      new java.util.ArrayList<SomeEventHandler>();

  public void addMyEvent(SomeEventHandler toAdd) {
    _MyEventListeners.add(toAdd);
  }

  public void removeMyEvent(SomeEventHandler toRemove) {
    _MyEventListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SomeEventWithResultHandler> _MyEventWithResultListeners =
      new java.util.ArrayList<SomeEventWithResultHandler>();

  public void addMyEventWithResult(SomeEventWithResultHandler toAdd) {
    _MyEventWithResultListeners.add(toAdd);
  }

  public void removeMyEventWithResult(SomeEventWithResultHandler toRemove) {
    _MyEventWithResultListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventExampleHandler2> _SampleEvent2Listeners =
      new java.util.ArrayList<EventExampleHandler2>();

  public void addSampleEvent2(EventExampleHandler2 toAdd) {
    _SampleEvent2Listeners.add(toAdd);
  }

  public void removeSampleEvent2(EventExampleHandler2 toRemove) {
    _SampleEvent2Listeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventExampleHandler> _SampleEventListeners =
      new java.util.ArrayList<EventExampleHandler>();

  public void addSampleEvent(EventExampleHandler toAdd) {
    _SampleEventListeners.add(toAdd);
  }

  public void removeSampleEvent(EventExampleHandler toRemove) {
    _SampleEventListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
