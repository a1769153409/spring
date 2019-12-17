package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("b")
public class B {
	@Autowired
	private A a;
}
