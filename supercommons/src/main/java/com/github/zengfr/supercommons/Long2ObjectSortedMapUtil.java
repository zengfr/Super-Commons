package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Long2ObjectSortedMapUtil{ 
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> emptyMap(){
return Long2ObjectSortedMaps.emptyMap();
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1){
return Long2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1){
return Long2ObjectSortedMaps.singleton(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(java.lang.Long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> singleton(long p0,V p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
return Long2ObjectSortedMaps.singleton(p0,p1,p2);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> unmodifiable(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> p0){
return Long2ObjectSortedMaps.unmodifiable(p0);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> p0,java.lang.Object p1){
return Long2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> p0){
return Long2ObjectSortedMaps.synchronize(p0);
}
}