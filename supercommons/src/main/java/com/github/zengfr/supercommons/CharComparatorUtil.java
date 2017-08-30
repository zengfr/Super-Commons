package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharComparatorUtil{ 
/**
*public static it.unimi.dsi.fastutil.chars.CharComparator it.unimi.dsi.fastutil.chars.CharComparators.asCharComparator(java.util.Comparator<? super java.lang.Character>)
*/ 
public static it.unimi.dsi.fastutil.chars.CharComparator asCharComparator(java.util.Comparator<? super java.lang.Character> p0){
	return it.unimi.dsi.fastutil.chars.CharComparators.asCharComparator(p0);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharArrays.binarySearch(char[],char,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int binarySearch(char[] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.CharArrays.binarySearch(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharArrays.binarySearch(char[],int,int,char,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int binarySearch(char[] p0,int p1,int p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	return it.unimi.dsi.fastutil.chars.CharArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*public static long it.unimi.dsi.fastutil.chars.CharBigArrays.binarySearch(char[][],long,long,char,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static long binarySearch(char[][] p0,long p1,long p2,char p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	return it.unimi.dsi.fastutil.chars.CharBigArrays.binarySearch(p0,p1,p2,p3,p4);
}
/**
*public static long it.unimi.dsi.fastutil.chars.CharBigArrays.binarySearch(char[][],char,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static long binarySearch(char[][] p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.CharBigArrays.binarySearch(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharHeaps.downHeap(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int downHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	return it.unimi.dsi.fastutil.chars.CharHeaps.downHeap(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIndirectHeaps.downHeap(char[],int[],int[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int downHeap(char[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
	return it.unimi.dsi.fastutil.chars.CharIndirectHeaps.downHeap(p0,p1,p2,p3,p4,p5);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.downHeap(char[],int[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int downHeap(char[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	return it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.downHeap(p0,p1,p2,p3,p4);
}
/**
*public static java.util.Comparator<? super java.util.Map.java.util.Map$Entry<java.lang.Character, ?>> it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.entryComparator(it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static java.util.Comparator<? super Entry<java.lang.Character, ?>> entryComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.entryComparator(p0);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.front(char[],int[],int,int[],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int front(char[] p0,int[] p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	return it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.front(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharHeaps.makeHeap(char[],int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void makeHeap(char[] p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	 it.unimi.dsi.fastutil.chars.CharHeaps.makeHeap(p0,p1,p2);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharIndirectHeaps.makeHeap(char[],int,int,int[],int[],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,int[] p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
	 it.unimi.dsi.fastutil.chars.CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4,p5);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharIndirectHeaps.makeHeap(char[],int[],int[],int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void makeHeap(char[] p0,int[] p1,int[] p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	 it.unimi.dsi.fastutil.chars.CharIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*public static int[] it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.makeHeap(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int[] makeHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	return it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.makeHeap(char[],int[],int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void makeHeap(char[] p0,int[] p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	 it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.makeHeap(char[],int,int,int[],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void makeHeap(char[] p0,int p1,int p2,int[] p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	 it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.makeHeap(p0,p1,p2,p3,p4);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.mergeSort(char[],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void mergeSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	 it.unimi.dsi.fastutil.chars.CharArrays.mergeSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.mergeSort(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void mergeSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	 it.unimi.dsi.fastutil.chars.CharArrays.mergeSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.mergeSort(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator,char[])
*/ 
public static void mergeSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3,char... p4){
	 it.unimi.dsi.fastutil.chars.CharArrays.mergeSort(p0,p1,p2,p3,p4);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharComparator it.unimi.dsi.fastutil.chars.CharComparators.oppositeComparator(it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharComparator oppositeComparator(it.unimi.dsi.fastutil.chars.CharComparator p0){
	return it.unimi.dsi.fastutil.chars.CharComparators.oppositeComparator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.parallelQuickSort(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void parallelQuickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	 it.unimi.dsi.fastutil.chars.CharArrays.parallelQuickSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.parallelQuickSort(char[],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void parallelQuickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	 it.unimi.dsi.fastutil.chars.CharArrays.parallelQuickSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.quickSort(char[],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void quickSort(char[] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	 it.unimi.dsi.fastutil.chars.CharArrays.quickSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharArrays.quickSort(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void quickSort(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	 it.unimi.dsi.fastutil.chars.CharArrays.quickSort(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharBigArrays.quickSort(char[][],it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void quickSort(char[][] p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	 it.unimi.dsi.fastutil.chars.CharBigArrays.quickSort(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.chars.CharBigArrays.quickSort(char[][],long,long,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static void quickSort(char[][] p0,long p1,long p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	 it.unimi.dsi.fastutil.chars.CharBigArrays.quickSort(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(char,boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.singleton(java.lang.Character,java.lang.Byte,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.singleton(char,byte,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(char p0,byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.singleton(java.lang.Character,java.lang.Character,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(java.lang.Character p0,java.lang.Character p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.singleton(char,char,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(char p0,char p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.singleton(java.lang.Character,java.lang.Double,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.singleton(char,double,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(char p0,double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.singleton(java.lang.Character,java.lang.Float,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.singleton(char,float,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(char p0,float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.singleton(java.lang.Character,java.lang.Integer,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.singleton(char,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(char p0,int p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(java.lang.Character,java.lang.Long,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(char,long,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(java.lang.Character,V,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(char,V,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(char p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.singleton(java.lang.Character,java.lang.Short,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.singleton(char,short,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(char p0,short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharSortedSet it.unimi.dsi.fastutil.chars.CharSortedSets.singleton(java.lang.Object,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	return it.unimi.dsi.fastutil.chars.CharSortedSets.singleton(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharSortedSet it.unimi.dsi.fastutil.chars.CharSortedSets.singleton(char,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(char p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
	return it.unimi.dsi.fastutil.chars.CharSortedSets.singleton(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharHeaps.upHeap(char[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int upHeap(char[] p0,int p1,int p2,it.unimi.dsi.fastutil.chars.CharComparator p3){
	return it.unimi.dsi.fastutil.chars.CharHeaps.upHeap(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharIndirectHeaps.upHeap(char[],int[],int[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int upHeap(char[] p0,int[] p1,int[] p2,int p3,int p4,it.unimi.dsi.fastutil.chars.CharComparator p5){
	return it.unimi.dsi.fastutil.chars.CharIndirectHeaps.upHeap(p0,p1,p2,p3,p4,p5);
}
/**
*public static int it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.upHeap(char[],int[],int,int,it.unimi.dsi.fastutil.chars.CharComparator)
*/ 
public static int upHeap(char[] p0,int[] p1,int p2,int p3,it.unimi.dsi.fastutil.chars.CharComparator p4){
	return it.unimi.dsi.fastutil.chars.CharSemiIndirectHeaps.upHeap(p0,p1,p2,p3,p4);
}
}
