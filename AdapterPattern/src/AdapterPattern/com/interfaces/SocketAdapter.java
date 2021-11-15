package AdapterPattern.com.interfaces;

import AdapterPattern.com.model.Volt;

public interface SocketAdapter {

    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volt();
}
