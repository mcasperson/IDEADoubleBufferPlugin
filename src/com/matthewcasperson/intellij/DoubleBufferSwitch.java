package com.matthewcasperson.intellij;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 12/11/12
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class DoubleBufferSwitch extends AnAction {

    private boolean dbEnabled = true;

    public DoubleBufferSwitch() {
          super("Toggle Double Buffering");
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        dbEnabled = !dbEnabled;
        RepaintManager.currentManager(null).setDoubleBufferingEnabled(dbEnabled);
    }
}
