package br.com.scarduelli.monitor;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;

import static br.com.scarduelli.monitor.ProcessList.COLUMN_PROCESS_NAME;
import static br.com.scarduelli.monitor.ProcessList.COLUMN_PROCESS_PROP;

public class MonitorApp extends Application
{
    // actual store of statistics
    private final ArrayList<HashMap<String,Object>> processList = new ArrayList<HashMap<String,Object>>();

    // fast-access index by package name (used for lookup)
    private ArrayList<String> packages = new ArrayList<String>();

    public MonitorApp() {
        final HashMap<String, Object> process = new HashMap<String, Object>();
        process.put(COLUMN_PROCESS_NAME, "Teste 1");
        process.put(COLUMN_PROCESS_PROP, "Teste 2");
        processList.add(process);

        packages.add("Teste 3");
    }

    public ArrayList<HashMap<String,Object>> getProcessList()
    {
        return processList;
    }

    public ArrayList<String> getPackages()
    {
        return packages;
    }

    // TODO: you need to save and load the instance data
    // TODO: you need to address synchronization issues
}
