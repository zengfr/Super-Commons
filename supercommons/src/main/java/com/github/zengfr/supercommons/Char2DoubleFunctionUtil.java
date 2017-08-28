package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2DoubleFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2DoubleFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(java.lang.Character p0,java.lang.Double p1){
return Char2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(char p0,double p1){
return Char2DoubleFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2DoubleFunction p0){
return Char2DoubleFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Double> p0){
return Char2DoubleFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction p0){
return Char2DoubleFunctions.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction p0,java.lang.Object p1){
return Char2DoubleFunctions.synchronize(p0,p1);
}
}
