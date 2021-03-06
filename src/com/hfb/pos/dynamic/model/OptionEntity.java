package com.hfb.pos.dynamic.model;

import com.hfb.pos.dynamic.component.ViewException;
import com.hfb.pos.dynamic.core.ViewPage;
import com.hfb.pos.dynamic.parse.ParseView;

public class OptionEntity {
	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue(ViewPage viewPage) throws ViewException {
		if (ParseView.isComponentTarget(this.value)) {
			return (String) viewPage.getRegexValue(this.value);
		}
		
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
