package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2IntMapUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> emptyMap(){
return Reference2IntMaps.emptyMap();
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> singleton(K p0,int p1){
return Reference2IntMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> singleton(K p0,java.lang.Integer p1){
return Reference2IntMaps.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0){
return Reference2IntMaps.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0,java.lang.Object p1){
return Reference2IntMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0){
return Reference2IntMaps.synchronize(p0);
}
}