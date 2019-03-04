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
import jio.System.*;

public class ScenarioReader {
  protected NObject javonetHandle;

  public ScenarioReader() {
    try {
      javonetHandle = Javonet.New("ValueTypesSample.ScenarioReader");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScenarioReader(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static Scenario ReadScenario(
      java.lang.String filename,
      FuncTResult<java.lang.String> askForPassword,
      IProgressFeedback progress) {
    try {
      Object res =
          Javonet.getType("ScenarioReader")
              .invoke("ReadScenario", filename, askForPassword, progress);
      if (res == null) return null;
      return new Scenario((NObject) res);
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
