package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class TransformerUtil{ 
/**
*{@link org.apache.commons.collections.ClosureUtils#asClosure(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.ClosureUtils#asClosure(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.asClosure(org.apache.commons.collections.Transformer)
*asClosure(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure asClosure(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.ClosureUtils.asClosure(p0);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#asPredicate(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.PredicateUtils#asPredicate(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.asPredicate(org.apache.commons.collections.Transformer)
*asPredicate(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate asPredicate(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.PredicateUtils.asPredicate(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#asTransformer(org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.TransformerUtils#asTransformer(org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, java.lang.Boolean> org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.Predicate<? super T>)
*asTransformer(org.apache.commons.collections4.Predicate<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, java.lang.Boolean> asTransformer(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#asTransformer(org.apache.commons.collections4.Closure<? super T>)}
*@see org.apache.commons.collections4.TransformerUtils#asTransformer(org.apache.commons.collections4.Closure<? super T>)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.Closure<? super T>)
*asTransformer(org.apache.commons.collections4.Closure<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> asTransformer(org.apache.commons.collections4.Closure<? super T> p0){
	return org.apache.commons.collections4.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#asTransformer(org.apache.commons.collections4.Factory<? extends O>)}
*@see org.apache.commons.collections4.TransformerUtils#asTransformer(org.apache.commons.collections4.Factory<? extends O>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.asTransformer(org.apache.commons.collections4.Factory<? extends O>)
*asTransformer(org.apache.commons.collections4.Factory<? extends O> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> asTransformer(org.apache.commons.collections4.Factory<? extends O> p0){
	return org.apache.commons.collections4.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Factory)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Factory)
*asTransformer(org.apache.commons.collections.Factory p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Factory p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Predicate)
*asTransformer(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.TransformerUtils#asTransformer(org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.asTransformer(org.apache.commons.collections.Closure)
*asTransformer(org.apache.commons.collections.Closure p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Closure p0){
	return org.apache.commons.collections.TransformerUtils.asTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#chainedTransformer(org.apache.commons.collections4.Transformer<? super T, ? extends T>...)}
*@see org.apache.commons.collections4.TransformerUtils#chainedTransformer(org.apache.commons.collections4.Transformer<? super T, ? extends T>...)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.TransformerUtils.chainedTransformer(org.apache.commons.collections4.Transformer<? super T, ? extends T>...)
*chainedTransformer(org.apache.commons.collections4.Transformer<? super T, ? extends T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> chainedTransformer(org.apache.commons.collections4.Transformer<? super T, ? extends T>... p0){
	return org.apache.commons.collections4.TransformerUtils.chainedTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#chainedTransformer(java.util.Collection<? extends org.apache.commons.collections4.Transformer<? super T, ? extends T>>)}
*@see org.apache.commons.collections4.TransformerUtils#chainedTransformer(java.util.Collection<? extends org.apache.commons.collections4.Transformer<? super T, ? extends T>>)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.TransformerUtils.chainedTransformer(java.util.Collection<? extends org.apache.commons.collections4.Transformer<? super T, ? extends T>>)
*chainedTransformer(java.util.Collection<? extends org.apache.commons.collections4.Transformer<? super T, ? extends T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> chainedTransformer(java.util.Collection<? extends org.apache.commons.collections4.Transformer<? super T, ? extends T>> p0){
	return org.apache.commons.collections4.TransformerUtils.chainedTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#chainedTransformer(java.util.Collection)}
*@see org.apache.commons.collections.TransformerUtils#chainedTransformer(java.util.Collection)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.chainedTransformer(java.util.Collection)
*chainedTransformer(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer chainedTransformer(java.util.Collection p0){
	return org.apache.commons.collections.TransformerUtils.chainedTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#chainedTransformer(org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.TransformerUtils#chainedTransformer(org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.chainedTransformer(org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*chainedTransformer(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer chainedTransformer(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.TransformerUtils.chainedTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#chainedTransformer(org.apache.commons.collections.Transformer...)}
*@see org.apache.commons.collections.TransformerUtils#chainedTransformer(org.apache.commons.collections.Transformer...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.chainedTransformer(org.apache.commons.collections.Transformer[])
*chainedTransformer(org.apache.commons.collections.Transformer... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer chainedTransformer(org.apache.commons.collections.Transformer... p0){
	return org.apache.commons.collections.TransformerUtils.chainedTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.functors.CloneTransformer#cloneTransformer()}
*@see org.apache.commons.collections4.functors.CloneTransformer#cloneTransformer()
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.functors.CloneTransformer.cloneTransformer()
*cloneTransformer()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> cloneTransformer(){
	return org.apache.commons.collections4.functors.CloneTransformer.cloneTransformer();
}
/**
*{@link org.apache.commons.collections4.functors.ClosureTransformer#closureTransformer(org.apache.commons.collections4.Closure<? super T>)}
*@see org.apache.commons.collections4.functors.ClosureTransformer#closureTransformer(org.apache.commons.collections4.Closure<? super T>)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.functors.ClosureTransformer.closureTransformer(org.apache.commons.collections4.Closure<? super T>)
*closureTransformer(org.apache.commons.collections4.Closure<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> closureTransformer(org.apache.commons.collections4.Closure<? super T> p0){
	return org.apache.commons.collections4.functors.ClosureTransformer.closureTransformer(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Collection,org.apache.commons.collections.Transformer)
*collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer)
*collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Collection,org.apache.commons.collections.Transformer,java.util.Collection)
*collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Collection p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.collect(java.util.Iterator,org.apache.commons.collections.Transformer,java.util.Collection)
*collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection collect(java.util.Iterator p0,org.apache.commons.collections.Transformer p1,java.util.Collection p2){
	return org.apache.commons.collections.CollectionUtils.collect(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#constantTransformer(O)}
*@see org.apache.commons.collections4.TransformerUtils#constantTransformer(O)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.constantTransformer(O)
*constantTransformer(O p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> constantTransformer(O p0){
	return org.apache.commons.collections4.TransformerUtils.constantTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#constantTransformer(java.lang.Object)}
*@see org.apache.commons.collections.TransformerUtils#constantTransformer(java.lang.Object)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.constantTransformer(java.lang.Object)
*constantTransformer(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer constantTransformer(java.lang.Object p0){
	return org.apache.commons.collections.TransformerUtils.constantTransformer(p0);
}
/**
*{@link org.apache.commons.collections.bag.TransformedSortedBag#decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.bag.TransformedSortedBag#decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.TransformedSortedBag.decorate(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.bag.TransformedSortedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.bag.TransformedBag#decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.bag.TransformedBag#decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.TransformedBag.decorate(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.bag.TransformedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.collection.TransformedCollection#decorate(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.collection.TransformedCollection#decorate(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.collection.TransformedCollection.decorate(java.util.Collection,org.apache.commons.collections.Transformer)
*decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.collection.TransformedCollection.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.TransformedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedSortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.TransformedSortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedSortedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.TransformedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.map.TransformedMap.decorate(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.DefaultedMap#decorate(java.util.Map,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.map.DefaultedMap.decorate(java.util.Map,org.apache.commons.collections.Transformer)
*decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.map.DefaultedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.LazySortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.LazySortedMap#decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.LazySortedMap.decorate(java.util.SortedMap,org.apache.commons.collections.Transformer)
*decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.map.LazySortedMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.list.TransformedList#decorate(java.util.List,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.list.TransformedList#decorate(java.util.List,org.apache.commons.collections.Transformer)
*<code>public static java.util.List org.apache.commons.collections.list.TransformedList.decorate(java.util.List,org.apache.commons.collections.Transformer)
*decorate(java.util.List p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.list.TransformedList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TransformedSet#decorate(java.util.Set,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.set.TransformedSet#decorate(java.util.Set,org.apache.commons.collections.Transformer)
*<code>public static java.util.Set org.apache.commons.collections.set.TransformedSet.decorate(java.util.Set,org.apache.commons.collections.Transformer)
*decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.set.TransformedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TransformedSortedSet#decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.set.TransformedSortedSet#decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedSet org.apache.commons.collections.set.TransformedSortedSet.decorate(java.util.SortedSet,org.apache.commons.collections.Transformer)
*decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.set.TransformedSortedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.TransformedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.buffer.TransformedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.TransformedBuffer.decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.buffer.TransformedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.TransformedSortedMap#decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedSortedMap#decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.TransformedSortedMap.decorateTransform(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorateTransform(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedSortedMap.decorateTransform(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.TransformedMap#decorateTransform(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.map.TransformedMap#decorateTransform(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.map.TransformedMap.decorateTransform(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*decorateTransform(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorateTransform(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.map.TransformedMap.decorateTransform(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.functors.ExceptionTransformer#exceptionTransformer()}
*@see org.apache.commons.collections4.functors.ExceptionTransformer#exceptionTransformer()
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.functors.ExceptionTransformer.exceptionTransformer()
*exceptionTransformer()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> exceptionTransformer(){
	return org.apache.commons.collections4.functors.ExceptionTransformer.exceptionTransformer();
}
/**
*{@link org.apache.commons.collections4.functors.FactoryTransformer#factoryTransformer(org.apache.commons.collections4.Factory<? extends O>)}
*@see org.apache.commons.collections4.functors.FactoryTransformer#factoryTransformer(org.apache.commons.collections4.Factory<? extends O>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.functors.FactoryTransformer.factoryTransformer(org.apache.commons.collections4.Factory<? extends O>)
*factoryTransformer(org.apache.commons.collections4.Factory<? extends O> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> factoryTransformer(org.apache.commons.collections4.Factory<? extends O> p0){
	return org.apache.commons.collections4.functors.FactoryTransformer.factoryTransformer(p0);
}
/**
*{@link org.apache.commons.collections.functors.ConstantTransformer#getInstance(java.lang.Object)}
*@see org.apache.commons.collections.functors.ConstantTransformer#getInstance(java.lang.Object)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ConstantTransformer.getInstance(java.lang.Object)
*getInstance(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.Object p0){
	return org.apache.commons.collections.functors.ConstantTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.InstantiateTransformer#getInstance(java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.functors.InstantiateTransformer#getInstance(java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InstantiateTransformer.getInstance(java.lang.Class[],java.lang.Object[])
*getInstance(java.lang.Class[] p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.Class[] p0,java.lang.Object... p1){
	return org.apache.commons.collections.functors.InstantiateTransformer.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.InvokerTransformer#getInstance(java.lang.String)}
*@see org.apache.commons.collections.functors.InvokerTransformer#getInstance(java.lang.String)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InvokerTransformer.getInstance(java.lang.String)
*getInstance(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0){
	return org.apache.commons.collections.functors.InvokerTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.InvokerTransformer#getInstance(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.functors.InvokerTransformer#getInstance(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InvokerTransformer.getInstance(java.lang.String,java.lang.Class[],java.lang.Object[])
*getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InvokerTransformer.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.functors.TransformerClosure#getInstance(org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.functors.TransformerClosure#getInstance(org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.TransformerClosure.getInstance(org.apache.commons.collections.Transformer)
*getInstance(org.apache.commons.collections.Transformer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Transformer p0){
	return org.apache.commons.collections.functors.TransformerClosure.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ChainedTransformer#getInstance(org.apache.commons.collections.Transformer...)}
*@see org.apache.commons.collections.functors.ChainedTransformer#getInstance(org.apache.commons.collections.Transformer...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ChainedTransformer.getInstance(org.apache.commons.collections.Transformer[])
*getInstance(org.apache.commons.collections.Transformer... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Transformer... p0){
	return org.apache.commons.collections.functors.ChainedTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ChainedTransformer#getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.functors.ChainedTransformer#getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ChainedTransformer.getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.functors.ChainedTransformer.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.ChainedTransformer#getInstance(java.util.Collection)}
*@see org.apache.commons.collections.functors.ChainedTransformer#getInstance(java.util.Collection)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ChainedTransformer.getInstance(java.util.Collection)
*getInstance(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.util.Collection p0){
	return org.apache.commons.collections.functors.ChainedTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.MapTransformer#getInstance(java.util.Map)}
*@see org.apache.commons.collections.functors.MapTransformer#getInstance(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.MapTransformer.getInstance(java.util.Map)
*getInstance(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.util.Map p0){
	return org.apache.commons.collections.functors.MapTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.PredicateTransformer#getInstance(org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.functors.PredicateTransformer#getInstance(org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.PredicateTransformer.getInstance(org.apache.commons.collections.Predicate)
*getInstance(org.apache.commons.collections.Predicate p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate p0){
	return org.apache.commons.collections.functors.PredicateTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.ClosureTransformer#getInstance(org.apache.commons.collections.Closure)}
*@see org.apache.commons.collections.functors.ClosureTransformer#getInstance(org.apache.commons.collections.Closure)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ClosureTransformer.getInstance(org.apache.commons.collections.Closure)
*getInstance(org.apache.commons.collections.Closure p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Closure p0){
	return org.apache.commons.collections.functors.ClosureTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.CloneTransformer#getInstance()}
*@see org.apache.commons.collections.functors.CloneTransformer#getInstance()
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.CloneTransformer.getInstance()
*getInstance()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(){
	return org.apache.commons.collections.functors.CloneTransformer.getInstance();
}
/**
*{@link org.apache.commons.collections.functors.SwitchTransformer#getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.functors.SwitchTransformer#getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.SwitchTransformer.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.functors.SwitchTransformer.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.functors.TransformedPredicate#getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.functors.TransformedPredicate#getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.TransformedPredicate.getInstance(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.functors.TransformedPredicate.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.FactoryTransformer#getInstance(org.apache.commons.collections.Factory)}
*@see org.apache.commons.collections.functors.FactoryTransformer#getInstance(org.apache.commons.collections.Factory)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.FactoryTransformer.getInstance(org.apache.commons.collections.Factory)
*getInstance(org.apache.commons.collections.Factory p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Factory p0){
	return org.apache.commons.collections.functors.FactoryTransformer.getInstance(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#ifTransformer(org.apache.commons.collections4.Predicate<? super I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.TransformerUtils#ifTransformer(org.apache.commons.collections4.Predicate<? super I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.ifTransformer(org.apache.commons.collections4.Predicate<? super I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*ifTransformer(org.apache.commons.collections4.Predicate<? super I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> ifTransformer(org.apache.commons.collections4.Predicate<? super I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2){
	return org.apache.commons.collections4.TransformerUtils.ifTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#ifTransformer(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Transformer<? super T, ? extends T>)}
*@see org.apache.commons.collections4.TransformerUtils#ifTransformer(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Transformer<? super T, ? extends T>)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.TransformerUtils.ifTransformer(org.apache.commons.collections4.Predicate<? super T>,org.apache.commons.collections4.Transformer<? super T, ? extends T>)
*ifTransformer(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Transformer<? super T, ? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> ifTransformer(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Transformer<? super T, ? extends T> p1){
	return org.apache.commons.collections4.TransformerUtils.ifTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#instantiateTransformer()}
*@see org.apache.commons.collections4.TransformerUtils#instantiateTransformer()
*<code>public static <T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>, T> org.apache.commons.collections4.TransformerUtils.instantiateTransformer()
*instantiateTransformer()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>, T> instantiateTransformer(){
	return org.apache.commons.collections4.TransformerUtils.instantiateTransformer();
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#instantiateTransformer(java.lang.Class<?>[],java.lang.Object...)}
*@see org.apache.commons.collections4.TransformerUtils#instantiateTransformer(java.lang.Class<?>[],java.lang.Object...)
*<code>public static <T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>, T> org.apache.commons.collections4.TransformerUtils.instantiateTransformer(java.lang.Class<?>[],java.lang.Object[])
*instantiateTransformer(java.lang.Class<?>[] p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<java.lang.Class<? extends T>, T> instantiateTransformer(java.lang.Class<?>[] p0,java.lang.Object... p1){
	return org.apache.commons.collections4.TransformerUtils.instantiateTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#instantiateTransformer(java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.TransformerUtils#instantiateTransformer(java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.instantiateTransformer(java.lang.Class[],java.lang.Object[])
*instantiateTransformer(java.lang.Class[] p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer instantiateTransformer(java.lang.Class[] p0,java.lang.Object... p1){
	return org.apache.commons.collections.TransformerUtils.instantiateTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#invokerTransformer(java.lang.String,java.lang.Class<?>[],java.lang.Object...)}
*@see org.apache.commons.collections4.TransformerUtils#invokerTransformer(java.lang.String,java.lang.Class<?>[],java.lang.Object...)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.invokerTransformer(java.lang.String,java.lang.Class<?>[],java.lang.Object[])
*invokerTransformer(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> invokerTransformer(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object... p2){
	return org.apache.commons.collections4.TransformerUtils.invokerTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#invokerTransformer(java.lang.String)}
*@see org.apache.commons.collections4.TransformerUtils#invokerTransformer(java.lang.String)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.invokerTransformer(java.lang.String)
*invokerTransformer(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> invokerTransformer(java.lang.String p0){
	return org.apache.commons.collections4.TransformerUtils.invokerTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.TransformerUtils#invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object[])
*invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.TransformerUtils.invokerTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#lazyMap(java.util.Map,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#lazyMap(java.util.Map,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.lazyMap(java.util.Map,org.apache.commons.collections.Transformer)
*lazyMap(java.util.Map p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.MapUtils.lazyMap(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.lazySortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer)
*lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.MapUtils.lazySortedMap(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.MapTransformer#mapTransformer(java.util.Map<? super I, ? extends O>)}
*@see org.apache.commons.collections4.functors.MapTransformer#mapTransformer(java.util.Map<? super I, ? extends O>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.functors.MapTransformer.mapTransformer(java.util.Map<? super I, ? extends O>)
*mapTransformer(java.util.Map<? super I, ? extends O> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> mapTransformer(java.util.Map<? super I, ? extends O> p0){
	return org.apache.commons.collections4.functors.MapTransformer.mapTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#mapTransformer(java.util.Map)}
*@see org.apache.commons.collections.TransformerUtils#mapTransformer(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.mapTransformer(java.util.Map)
*mapTransformer(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer mapTransformer(java.util.Map p0){
	return org.apache.commons.collections.TransformerUtils.mapTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#nopTransformer()}
*@see org.apache.commons.collections4.TransformerUtils#nopTransformer()
*<code>public static <T> org.apache.commons.collections4.Transformer<T, T> org.apache.commons.collections4.TransformerUtils.nopTransformer()
*nopTransformer()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, T> nopTransformer(){
	return org.apache.commons.collections4.TransformerUtils.nopTransformer();
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#nullTransformer()}
*@see org.apache.commons.collections4.TransformerUtils#nullTransformer()
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.nullTransformer()
*nullTransformer()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> nullTransformer(){
	return org.apache.commons.collections4.TransformerUtils.nullTransformer();
}
/**
*{@link org.apache.commons.collections.IteratorUtils#objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.IteratorUtils#objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.objectGraphIterator(java.lang.Object,org.apache.commons.collections.Transformer)
*objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.objectGraphIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.PredicateTransformer#predicateTransformer(org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.functors.PredicateTransformer#predicateTransformer(org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> org.apache.commons.collections4.Transformer<T, java.lang.Boolean> org.apache.commons.collections4.functors.PredicateTransformer.predicateTransformer(org.apache.commons.collections4.Predicate<? super T>)
*predicateTransformer(org.apache.commons.collections4.Predicate<? super T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, java.lang.Boolean> predicateTransformer(org.apache.commons.collections4.Predicate<? super T> p0){
	return org.apache.commons.collections4.functors.PredicateTransformer.predicateTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#stringValueTransformer()}
*@see org.apache.commons.collections4.TransformerUtils#stringValueTransformer()
*<code>public static <T> org.apache.commons.collections4.Transformer<T, java.lang.String> org.apache.commons.collections4.TransformerUtils.stringValueTransformer()
*stringValueTransformer()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.collections4.Transformer<T, java.lang.String> stringValueTransformer(){
	return org.apache.commons.collections4.TransformerUtils.stringValueTransformer();
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#switchMapTransformer(java.util.Map<I, org.apache.commons.collections4.Transformer<I, O>>)}
*@see org.apache.commons.collections4.TransformerUtils#switchMapTransformer(java.util.Map<I, org.apache.commons.collections4.Transformer<I, O>>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.switchMapTransformer(java.util.Map<I, org.apache.commons.collections4.Transformer<I, O>>)
*switchMapTransformer(java.util.Map<I, org.apache.commons.collections4.Transformer<I, O>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchMapTransformer(java.util.Map<I, org.apache.commons.collections4.Transformer<I, O>> p0){
	return org.apache.commons.collections4.TransformerUtils.switchMapTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchMapTransformer(java.util.Map)}
*@see org.apache.commons.collections.TransformerUtils#switchMapTransformer(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchMapTransformer(java.util.Map)
*switchMapTransformer(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchMapTransformer(java.util.Map p0){
	return org.apache.commons.collections.TransformerUtils.switchMapTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.functors.SwitchTransformer#switchTransformer(org.apache.commons.collections4.Predicate<? super I>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.functors.SwitchTransformer#switchTransformer(org.apache.commons.collections4.Predicate<? super I>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.functors.SwitchTransformer.switchTransformer(org.apache.commons.collections4.Predicate<? super I>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*switchTransformer(org.apache.commons.collections4.Predicate<? super I>[] p0,org.apache.commons.collections4.Transformer<? super I, ? extends O>[] p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(org.apache.commons.collections4.Predicate<? super I>[] p0,org.apache.commons.collections4.Transformer<? super I, ? extends O>[] p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2){
	return org.apache.commons.collections4.functors.SwitchTransformer.switchTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.functors.SwitchTransformer#switchTransformer(java.util.Map<? extends org.apache.commons.collections4.Predicate<? super I>, ? extends org.apache.commons.collections4.Transformer<? super I, ? extends O>>)}
*@see org.apache.commons.collections4.functors.SwitchTransformer#switchTransformer(java.util.Map<? extends org.apache.commons.collections4.Predicate<? super I>, ? extends org.apache.commons.collections4.Transformer<? super I, ? extends O>>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.functors.SwitchTransformer.switchTransformer(java.util.Map<? extends org.apache.commons.collections4.Predicate<? super I>, ? extends org.apache.commons.collections4.Transformer<? super I, ? extends O>>)
*switchTransformer(java.util.Map<? extends org.apache.commons.collections4.Predicate<? super I>, ? extends org.apache.commons.collections4.Transformer<? super I, ? extends O>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(java.util.Map<? extends org.apache.commons.collections4.Predicate<? super I>, ? extends org.apache.commons.collections4.Transformer<? super I, ? extends O>> p0){
	return org.apache.commons.collections4.functors.SwitchTransformer.switchTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#switchTransformer(org.apache.commons.collections4.Predicate<? super I>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>...)}
*@see org.apache.commons.collections4.TransformerUtils#switchTransformer(org.apache.commons.collections4.Predicate<? super I>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>...)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.Predicate<? super I>[],org.apache.commons.collections4.Transformer<? super I, ? extends O>[])
*switchTransformer(org.apache.commons.collections4.Predicate<? super I>[] p0,org.apache.commons.collections4.Transformer<? super I, ? extends O>... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(org.apache.commons.collections4.Predicate<? super I>[] p0,org.apache.commons.collections4.Transformer<? super I, ? extends O>... p1){
	return org.apache.commons.collections4.TransformerUtils.switchTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#switchTransformer(java.util.Map<org.apache.commons.collections4.Predicate<I>, org.apache.commons.collections4.Transformer<I, O>>)}
*@see org.apache.commons.collections4.TransformerUtils#switchTransformer(java.util.Map<org.apache.commons.collections4.Predicate<I>, org.apache.commons.collections4.Transformer<I, O>>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.switchTransformer(java.util.Map<org.apache.commons.collections4.Predicate<I>, org.apache.commons.collections4.Transformer<I, O>>)
*switchTransformer(java.util.Map<org.apache.commons.collections4.Predicate<I>, org.apache.commons.collections4.Transformer<I, O>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(java.util.Map<org.apache.commons.collections4.Predicate<I>, org.apache.commons.collections4.Transformer<I, O>> p0){
	return org.apache.commons.collections4.TransformerUtils.switchTransformer(p0);
}
/**
*{@link org.apache.commons.collections4.TransformerUtils#switchTransformer(org.apache.commons.collections4.Predicate<? super I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)}
*@see org.apache.commons.collections4.TransformerUtils#switchTransformer(org.apache.commons.collections4.Predicate<? super I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*<code>public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.switchTransformer(org.apache.commons.collections4.Predicate<? super I>,org.apache.commons.collections4.Transformer<? super I, ? extends O>,org.apache.commons.collections4.Transformer<? super I, ? extends O>)
*switchTransformer(org.apache.commons.collections4.Predicate<? super I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> switchTransformer(org.apache.commons.collections4.Predicate<? super I> p0,org.apache.commons.collections4.Transformer<? super I, ? extends O> p1,org.apache.commons.collections4.Transformer<? super I, ? extends O> p2){
	return org.apache.commons.collections4.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer...)}
*@see org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[])
*switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer... p1){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchTransformer(java.util.Map)}
*@see org.apache.commons.collections.TransformerUtils#switchTransformer(java.util.Map)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(java.util.Map)
*switchTransformer(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(java.util.Map p0){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.TransformerUtils#switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#transform(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static void org.apache.commons.collections.CollectionUtils.transform(java.util.Collection,org.apache.commons.collections.Transformer)
*transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void transform(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	 org.apache.commons.collections.CollectionUtils.transform(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#transformedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.BagUtils#transformedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.transformedBag(org.apache.commons.collections.Bag,org.apache.commons.collections.Transformer)
*transformedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag transformedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BagUtils.transformedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#transformedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.BufferUtils#transformedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.transformedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*transformedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer transformedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BufferUtils.transformedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.CollectionUtils#transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.transformedCollection(java.util.Collection,org.apache.commons.collections.Transformer)
*transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection transformedCollection(java.util.Collection p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.CollectionUtils.transformedCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.ComparatorUtils#transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.ComparatorUtils#transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Comparator org.apache.commons.collections.ComparatorUtils.transformedComparator(java.util.Comparator,org.apache.commons.collections.Transformer)
*transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator transformedComparator(java.util.Comparator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.ComparatorUtils.transformedComparator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.IteratorUtils#transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)
*<code>public static java.util.Iterator org.apache.commons.collections.IteratorUtils.transformedIterator(java.util.Iterator,org.apache.commons.collections.Transformer)
*transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator transformedIterator(java.util.Iterator p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.IteratorUtils.transformedIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#transformedList(java.util.List,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.ListUtils#transformedList(java.util.List,org.apache.commons.collections.Transformer)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.transformedList(java.util.List,org.apache.commons.collections.Transformer)
*transformedList(java.util.List p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List transformedList(java.util.List p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.ListUtils.transformedList(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#transformedMap(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#transformedMap(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.transformedMap(java.util.Map,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*transformedMap(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map transformedMap(java.util.Map p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.MapUtils.transformedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.PredicateUtils#transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.transformedPredicate(org.apache.commons.collections.Transformer,org.apache.commons.collections.Predicate)
*transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.PredicateUtils.transformedPredicate(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#transformedSet(java.util.Set,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.SetUtils#transformedSet(java.util.Set,org.apache.commons.collections.Transformer)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.transformedSet(java.util.Set,org.apache.commons.collections.Transformer)
*transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set transformedSet(java.util.Set p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.SetUtils.transformedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.BagUtils#transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.transformedSortedBag(org.apache.commons.collections.SortedBag,org.apache.commons.collections.Transformer)
*transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag transformedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BagUtils.transformedSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.MapUtils#transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.transformedSortedMap(java.util.SortedMap,org.apache.commons.collections.Transformer,org.apache.commons.collections.Transformer)
*transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap transformedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.MapUtils.transformedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.SetUtils#transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.SetUtils#transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.transformedSortedSet(java.util.SortedSet,org.apache.commons.collections.Transformer)
*transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet transformedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.SetUtils.transformedSortedSet(p0,p1);
}
}
