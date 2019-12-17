package com.luban.imports;

import com.luban.anno.EnableLuban;
import com.luban.dao.IndexDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao3.class.getName()};
	}
}
