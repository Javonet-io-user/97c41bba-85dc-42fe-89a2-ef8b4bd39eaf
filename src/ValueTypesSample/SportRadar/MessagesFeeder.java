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

public class MessagesFeeder {
  protected NObject javonetHandle;

  public MessagesFeeder() {
    try {
      javonetHandle = Javonet.New("ValueTypesSample.SportRadar.MessagesFeeder");
      javonetHandle.addEventListener(
          "MergeSingleHeaderWithOddsEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MergeSingleHeaderWithOddsEventHandler handler :
                  _MergeSingleHeaderWithOddsEventListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.Long.class),
                    Convert(objects[1], Message.class),
                    Convert(objects[2], java.lang.Boolean.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MessagesFeeder(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void StartFeeding(
      java.lang.Integer count,
      java.lang.Integer oddsCount,
      java.lang.Integer oddsFieldsCount,
      java.lang.Integer take) {
    try {
      javonetHandle.invoke("StartFeeding", count, oddsCount, oddsFieldsCount, take);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<MergeSingleHeaderWithOddsEventHandler>
      _MergeSingleHeaderWithOddsEventListeners =
          new java.util.ArrayList<MergeSingleHeaderWithOddsEventHandler>();

  public void addMergeSingleHeaderWithOddsEvent(MergeSingleHeaderWithOddsEventHandler toAdd) {
    _MergeSingleHeaderWithOddsEventListeners.add(toAdd);
  }

  public void removeMergeSingleHeaderWithOddsEvent(MergeSingleHeaderWithOddsEventHandler toRemove) {
    _MergeSingleHeaderWithOddsEventListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
