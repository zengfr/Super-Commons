package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Short2CharMapUtil{ 
public static it.unimi.dsi.fastutil.shorts.Short2CharMap singleton(short p0,char p1){
return Short2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharMap singleton(java.lang.Short p0,java.lang.Character p1){
return Short2CharMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharMap unmodifiable(it.unimi.dsi.fastutil.shorts.Short2CharMap p0){
return Short2CharMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap p0){
return Short2CharMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap p0,java.lang.Object p1){
return Short2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap p0){
return Short2CharMaps.fastIterator(p0);
}
public static void fastForEach(it.unimi.dsi.fastutil.shorts.Short2CharMap p0,java.util.function.Consumer<? super it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> p1){
 Short2CharMaps.fastForEach(p0,p1);
}
public static it.unimi.dsi.fastutil.objects.ObjectIterable<it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> fastIterable(it.unimi.dsi.fastutil.shorts.Short2CharMap p0){
return Short2CharMaps.fastIterable(p0);
}
}
