package com.payulatam.prototype.view.exception;

public class IllegalTemplateException extends Exception {

    public IllegalTemplateException(String menuItemLabel) {
        super("Unable to load zk template for menu item. Menu label: " + menuItemLabel);
    }

}
