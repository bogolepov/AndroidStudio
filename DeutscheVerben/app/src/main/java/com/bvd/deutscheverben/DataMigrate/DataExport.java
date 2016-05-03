package com.bvd.deutscheverben.DataMigrate;

import android.Manifest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Vadim on 29.09.2015.
 */
public class DataExport {

    // Improving Code Inspection with Annotations
    // https://developer.android.com/intl/ru/tools/debugging/annotations.html
    // https://developer.android.com/intl/ru/reference/android/support/annotation/package-summary.html
    //
    // <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" android:maxSdkVersion="18" />
    // @RequeresPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    public void Export() {

        /*
        InputStream myInput = new FileInputStream("/data/data/pack_name/databases/databasename.db");

        File directory = new File("/sdcard/some_folder");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        OutputStream myOutput = new FileOutputStream(directory.getPath() + "/AppName.backup");

        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }

        myOutput.flush();
        myOutput.close();
        myInput.close();
        */
    }

    public void ExportToCSV() {
        // http://stackoverflow.com/questions/8724866/how-to-convert-data-base-records-into-csv-file-in-android
    }
}
