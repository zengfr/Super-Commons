package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Object2ReferenceFunctionUtil{ 
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.singleton(K,V)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> singleton(K p0,V p1){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.singleton(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V>,java.lang.Object)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.synchronize(p0,p1);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.synchronize(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.unmodifiable(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> unmodifiable(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions.unmodifiable(p0);
}
}
