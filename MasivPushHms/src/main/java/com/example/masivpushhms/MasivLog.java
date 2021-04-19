package com.example.masivpushhms;

import android.util.Log;

public class MasivLog {

    String _loggerString;
    String _TAG = "MasivLogger";

    public MasivLog(String loggerString) {
        this._loggerString = loggerString;
    }

    public void logString() {
        Log.i(_TAG, _loggerString);
    }
}
