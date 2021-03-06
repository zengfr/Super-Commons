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
public final class FloatComparatorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.floats.FloatComparators#asFloatComparator(java.util.Comparator<? super java.lang.Float>)}
*@see it.unimi.dsi.fastutil.floats.FloatComparators#asFloatComparator(java.util.Comparator<? super java.lang.Float>)
*<code>public static it.unimi.dsi.fastutil.floats.FloatComparator it.unimi.dsi.fastutil.floats.FloatComparators.asFloatComparator(java.util.Comparator<? super java.lang.Float>)
*asFloatComparator(java.util.Comparator<? super java.lang.Float> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatComparator asFloatComparator(java.util.Comparator<? super java.lang.Float> p0){
	return it.unimi.dsi.fastutil.floats.FloatComparators.asFloatComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(float[],float,it.unimi.dsi.fastutil.floats.FloatComparator)
*binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(float[] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],int,int,float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#binarySearch(float[],int,int,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(float[],int,int,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int binarySearch(float[] p0,int p1,int p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#binarySearch(float[][],long,long,float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#binarySearch(float[][],long,long,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static long it.unimi.dsi.fastutil.floats.FloatBigArrays.binarySearch(float[][],long,long,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*binarySearch(float[][] p0,long p1,long p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(float[][] p0,long p1,long p2,float p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#binarySearch(float[][],float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#binarySearch(float[][],float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static long it.unimi.dsi.fastutil.floats.FloatBigArrays.binarySearch(float[][],float,it.unimi.dsi.fastutil.floats.FloatComparator)
*binarySearch(float[][] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long binarySearch(float[][] p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.FloatBigArrays.binarySearch(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatHeaps#downHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatHeaps#downHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatHeaps.downHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	return it.unimi.dsi.fastutil.floats.FloatHeaps.downHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#downHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#downHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.downHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
	return it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#downHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#downHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.downHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int downHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static java.util.Comparator<? super java.util.Map$Entry<java.lang.Float, ?>> it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<? super java.util.Map.Entry<java.lang.Float, ?>> entryComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.entryComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#front(float[],int[],int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#front(float[],int[],int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.front(float[],int[],int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int front(float[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatHeaps#makeHeap(float[],int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatHeaps#makeHeap(float[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatHeaps.makeHeap(float[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	 it.unimi.dsi.fastutil.floats.FloatHeaps.makeHeap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int,int,int[],int[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int,int,int[],int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(float[],int,int,int[],int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
	 it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#makeHeap(float[],int[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(float[],int[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	 it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int[] it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] makeHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(float[],int[],int,it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#makeHeap(float[],int,int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(float[],int,int,int[],it.unimi.dsi.fastutil.floats.FloatComparator)
*makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void makeHeap(float[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	 it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator,float...)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator,float...)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator,float[])
*mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3,float... p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#mergeSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void mergeSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.mergeSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatComparators#oppositeComparator(it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatComparators#oppositeComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatComparator it.unimi.dsi.fastutil.floats.FloatComparators.oppositeComparator(it.unimi.dsi.fastutil.floats.FloatComparator)
*oppositeComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatComparator oppositeComparator(it.unimi.dsi.fastutil.floats.FloatComparator p0){
	return it.unimi.dsi.fastutil.floats.FloatComparators.oppositeComparator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelQuickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelQuickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#quickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#quickSort(float[][],long,long,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#quickSort(float[][],long,long,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatBigArrays.quickSort(float[][],long,long,it.unimi.dsi.fastutil.floats.FloatComparator)
*quickSort(float[][] p0,long p1,long p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[][] p0,long p1,long p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#quickSort(float[][],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#quickSort(float[][],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatBigArrays.quickSort(float[][],it.unimi.dsi.fastutil.floats.FloatComparator)
*quickSort(float[][] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void quickSort(float[][] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatBigArrays.quickSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps#singleton(java.lang.Float,java.lang.Byte,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps#singleton(java.lang.Float,java.lang.Byte,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps.singleton(java.lang.Float,java.lang.Byte,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(java.lang.Float p0,java.lang.Byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps#singleton(float,byte,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps#singleton(float,byte,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps.singleton(float,byte,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap singleton(float p0,byte p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#singleton(java.lang.Float,java.lang.Character,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#singleton(java.lang.Float,java.lang.Character,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.singleton(java.lang.Float,java.lang.Character,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#singleton(float,char,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#singleton(float,char,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.singleton(float,char,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,char p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(float p0,char p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps#singleton(java.lang.Float,java.lang.Double,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps#singleton(java.lang.Float,java.lang.Double,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps.singleton(java.lang.Float,java.lang.Double,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(java.lang.Float p0,java.lang.Double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps#singleton(float,double,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps#singleton(float,double,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps.singleton(float,double,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap singleton(float p0,double p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps#singleton(java.lang.Float,java.lang.Float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps#singleton(java.lang.Float,java.lang.Float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps.singleton(java.lang.Float,java.lang.Float,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(java.lang.Float p0,java.lang.Float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps#singleton(float,float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps#singleton(float,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps.singleton(float,float,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(float p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2IntSortedMaps#singleton(java.lang.Float,java.lang.Integer,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2IntSortedMaps#singleton(java.lang.Float,java.lang.Integer,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap it.unimi.dsi.fastutil.floats.Float2IntSortedMaps.singleton(java.lang.Float,java.lang.Integer,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Integer p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(java.lang.Float p0,java.lang.Integer p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2IntSortedMaps#singleton(float,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2IntSortedMaps#singleton(float,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap it.unimi.dsi.fastutil.floats.Float2IntSortedMaps.singleton(float,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap singleton(float p0,int p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2LongSortedMaps#singleton(java.lang.Float,java.lang.Long,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2LongSortedMaps#singleton(java.lang.Float,java.lang.Long,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap it.unimi.dsi.fastutil.floats.Float2LongSortedMaps.singleton(java.lang.Float,java.lang.Long,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(java.lang.Float p0,java.lang.Long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2LongSortedMaps#singleton(float,long,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2LongSortedMaps#singleton(float,long,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap it.unimi.dsi.fastutil.floats.Float2LongSortedMaps.singleton(float,long,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap singleton(float p0,long p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps#singleton(java.lang.Float,V,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps#singleton(java.lang.Float,V,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(java.lang.Float,V,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(java.lang.Float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps#singleton(float,V,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps#singleton(float,V,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(float,V,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> singleton(float p0,V p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps#singleton(java.lang.Float,java.lang.Short,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps#singleton(java.lang.Float,java.lang.Short,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps.singleton(java.lang.Float,java.lang.Short,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(java.lang.Float p0,java.lang.Short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps#singleton(float,short,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps#singleton(float,short,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps.singleton(float,short,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap singleton(float p0,short p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSortedSets#singleton(java.lang.Object,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatSortedSet it.unimi.dsi.fastutil.floats.FloatSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	return it.unimi.dsi.fastutil.floats.FloatSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSortedSets#singleton(float,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSortedSets#singleton(float,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatSortedSet it.unimi.dsi.fastutil.floats.FloatSortedSets.singleton(float,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(float p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	return it.unimi.dsi.fastutil.floats.FloatSortedSets.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*stableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#stableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*stableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void stableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.stableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*unstableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#unstableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(float[],it.unimi.dsi.fastutil.floats.FloatComparator)
*unstableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void unstableSort(float[] p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
	 it.unimi.dsi.fastutil.floats.FloatArrays.unstableSort(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatHeaps#upHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatHeaps#upHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatHeaps.upHeap(float[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(float[] p0,int p1,int p2,it.unimi.dsi.fastutil.floats.FloatComparator p3){
	return it.unimi.dsi.fastutil.floats.FloatHeaps.upHeap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#upHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatIndirectHeaps#upHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.upHeap(float[],int[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(float[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.floats.FloatComparator p5){
	return it.unimi.dsi.fastutil.floats.FloatIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#upHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps#upHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.upHeap(float[],int[],int,int,it.unimi.dsi.fastutil.floats.FloatComparator)
*upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int upHeap(float[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.floats.FloatComparator p4){
	return it.unimi.dsi.fastutil.floats.FloatSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
