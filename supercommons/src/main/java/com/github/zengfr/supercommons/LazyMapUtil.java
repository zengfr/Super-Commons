package com.zengfr.supercommons;
import org.apache.commons.collections4.map.LazyMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LazyMapUtil{ 
public static <K,V> org.apache.commons.collections4.map.LazyMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Factory<? extends V> p1){
return LazyMap.lazyMap(p0,p1);
}
public static <V,K> org.apache.commons.collections4.map.LazyMap<K, V> lazyMap(java.util.Map<K, V> p0,org.apache.commons.collections4.Transformer<? super K, ? extends V> p1){
return LazyMap.lazyMap(p0,p1);
}
}