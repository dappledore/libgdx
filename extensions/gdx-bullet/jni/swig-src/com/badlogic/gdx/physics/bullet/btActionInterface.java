/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btActionInterface {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btActionInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btActionInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btActionInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void updateAction(btCollisionWorld collisionWorld, float deltaTimeStep) {
    gdxBulletJNI.btActionInterface_updateAction(swigCPtr, this, btCollisionWorld.getCPtr(collisionWorld), collisionWorld, deltaTimeStep);
  }

  public void debugDraw(btIDebugDraw debugDrawer) {
    gdxBulletJNI.btActionInterface_debugDraw(swigCPtr, this, btIDebugDraw.getCPtr(debugDrawer), debugDrawer);
  }

}