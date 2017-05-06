// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2017 DCRG, University of Newcastle, All rights reserved 
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package au.edu.newcastle.engg1500;

import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.common.YaVersion;
import com.google.appinventor.components.runtime.util.ErrorMessages;

import android.content.Context;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.telephony.TelephonyManager;

import java.io.File;
import java.util.Date;

/**
 * Component for accessing mobile device properties, or simulations. 
 *
 *
 */
@DesignerComponent(version = 1,
   description = "A component to access raw device properties or simulations " +
        "if you are running in the emulator.",
   category = ComponentCategory.EXTENSION,
   nonVisible = true,
   iconName = "images/extension.png")
@SimpleObject(external = true)
@UsesPermissions(permissionNames = "android.permission.READ_PHONE_STATE")
public class PseudoDevice extends AndroidNonvisibleComponent
    implements ActivityResultListener, Component {

  private final ComponentContainer container;
  private Context context;

  /**
   * Creates a PseudoDevice component.
   *
   * @param container container, component will be placed in
   */
  public PseudoDevice(ComponentContainer container) {
    super(container.$form());
    this.container = container;
    context = (Context) container.$context();
  }

  /**
   * Returns the device IMEI 
   *
   * @return the device IMEI, or a random simulated value 
   */
  @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "obtain device IMEI")
  public String IMEI() {
    TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);

    String imei = telephonyManager.getDeviceId();
    if ("000000000000000".equals(imei))
       return "SIMU1234";
    else
       return imei;
  }

  @Override
  public void resultReturned(int requestCode, int resultCode, Intent data) {
    return;
  }
}
