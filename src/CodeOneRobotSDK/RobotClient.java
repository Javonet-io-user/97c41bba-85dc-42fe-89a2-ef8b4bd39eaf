package CodeOneRobotSDK;

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
import CodeOneRobotSDK.*;

public class RobotClient {
  protected NObject javonetHandle;

  public RobotClient() {
    try {
      javonetHandle = Javonet.New("CodeOneRobotSDK.RobotClient");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RobotClient(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void RotateBase(java.lang.Integer percentage) {
    try {
      javonetHandle.invoke("RotateBase", percentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void BendBottomAxis(java.lang.Integer percentage) {
    try {
      javonetHandle.invoke("BendBottomAxis", percentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void BendMiddleAxis(java.lang.Integer percentage) {
    try {
      javonetHandle.invoke("BendMiddleAxis", percentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void BendTopAxis(java.lang.Integer percentage) {
    try {
      javonetHandle.invoke("BendTopAxis", percentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RotateGripper(java.lang.Integer percentage) {
    try {
      javonetHandle.invoke("RotateGripper", percentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MoveGripper(java.lang.Integer percentage) {
    try {
      javonetHandle.invoke("MoveGripper", percentage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MoveAll(
      java.lang.Byte pos1,
      java.lang.Byte pos2,
      java.lang.Byte pos3,
      java.lang.Byte pos4,
      java.lang.Byte pos5,
      java.lang.Byte pos6) {
    try {
      javonetHandle.invoke("MoveAll", pos1, pos2, pos3, pos4, pos5, pos6);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Connect() {
    try {
      javonetHandle.invoke("Connect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Disconnect() {
    try {
      javonetHandle.invoke("Disconnect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EnablePower(java.lang.Boolean value) {
    try {
      javonetHandle.invoke("EnablePower", value);
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
