package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PushbackIteratorUtil{ 
/**
*public static <E> org.apache.commons.collections4.iterators.PushbackIterator<E> org.apache.commons.collections4.iterators.PushbackIterator.pushbackIterator(java.util.Iterator<? extends E>)
*/ 
public static <E> org.apache.commons.collections4.iterators.PushbackIterator<E> pushbackIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.iterators.PushbackIterator.pushbackIterator(p0);
}
}
