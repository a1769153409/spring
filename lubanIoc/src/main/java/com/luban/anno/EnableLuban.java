package com.luban.anno;

import com.luban.imports.MyImportSelector;
import com.sun.istack.internal.Interned;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
@EnableAspectJAutoProxy
public @interface EnableLuban {
}
