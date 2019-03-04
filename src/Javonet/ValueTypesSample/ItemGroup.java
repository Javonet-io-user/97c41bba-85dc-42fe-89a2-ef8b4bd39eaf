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

public class ItemGroup {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setItem1(Item value) {
    try {
      javonetHandle.set("Item1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Item getItem1() {
    try {
      Object res = javonetHandle.<NObject>get("Item1");
      if (res == null) return null;
      return new Item((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setItem2(Item value) {
    try {
      javonetHandle.set("Item2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Item getItem2() {
    try {
      Object res = javonetHandle.<NObject>get("Item2");
      if (res == null) return null;
      return new Item((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ItemGroup(Item item, Item item2) {
    try {
      javonetHandle = Javonet.New("Javonet.ValueTypesSample.ItemGroup", item, item2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemGroup(NObject handle) {
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
