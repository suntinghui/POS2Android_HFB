package com.hfb.pos.dynamic.template.os.layout;

import java.util.Vector;

import com.hfb.pos.dynamic.component.Component;
import com.hfb.pos.dynamic.component.ViewException;

import android.view.View;

public interface ILayoutTemplate {
	
	public View rewind(Vector<Component> components) throws ViewException;

}
