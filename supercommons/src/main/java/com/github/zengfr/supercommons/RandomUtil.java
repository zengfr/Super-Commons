package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RandomUtil{ 
/**
*public static java.util.Random org.apache.commons.math3.random.RandomAdaptor.createAdaptor(org.apache.commons.math3.random.RandomGenerator)
*/ 
public static java.util.Random createAdaptor(org.apache.commons.math3.random.RandomGenerator p0){
	return org.apache.commons.math3.random.RandomAdaptor.createAdaptor(p0);
}
/**
*public static org.apache.commons.math3.random.RandomGenerator org.apache.commons.math3.random.RandomGeneratorFactory.createRandomGenerator(java.util.Random)
*/ 
public static org.apache.commons.math3.random.RandomGenerator createRandomGenerator(java.util.Random p0){
	return org.apache.commons.math3.random.RandomGeneratorFactory.createRandomGenerator(p0);
}
/**
*public static boolean org.apache.commons.lang.math.RandomUtils.nextBoolean(java.util.Random)
*/ 
public static boolean nextBoolean(java.util.Random p0){
	return org.apache.commons.lang.math.RandomUtils.nextBoolean(p0);
}
/**
*public static double org.apache.commons.lang.math.RandomUtils.nextDouble(java.util.Random)
*/ 
public static double nextDouble(java.util.Random p0){
	return org.apache.commons.lang.math.RandomUtils.nextDouble(p0);
}
/**
*public static float org.apache.commons.lang.math.RandomUtils.nextFloat(java.util.Random)
*/ 
public static float nextFloat(java.util.Random p0){
	return org.apache.commons.lang.math.RandomUtils.nextFloat(p0);
}
/**
*public static int org.apache.commons.lang.math.RandomUtils.nextInt(java.util.Random,int)
*/ 
public static int nextInt(java.util.Random p0,int p1){
	return org.apache.commons.lang.math.RandomUtils.nextInt(p0,p1);
}
/**
*public static int org.apache.commons.lang.math.RandomUtils.nextInt(java.util.Random)
*/ 
public static int nextInt(java.util.Random p0){
	return org.apache.commons.lang.math.RandomUtils.nextInt(p0);
}
/**
*public static long org.apache.commons.lang.math.RandomUtils.nextLong(java.util.Random)
*/ 
public static long nextLong(java.util.Random p0){
	return org.apache.commons.lang.math.RandomUtils.nextLong(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean,char[],java.util.Random)
*/ 
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static boolean[] it.unimi.dsi.fastutil.booleans.BooleanArrays.shuffle(boolean[],int,int,java.util.Random)
*/ 
public static boolean[] shuffle(boolean[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.booleans.BooleanArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static boolean[] it.unimi.dsi.fastutil.booleans.BooleanArrays.shuffle(boolean[],java.util.Random)
*/ 
public static boolean[] shuffle(boolean[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.booleans.BooleanArrays.shuffle(p0,p1);
}
/**
*public static boolean[][] it.unimi.dsi.fastutil.booleans.BooleanBigArrays.shuffle(boolean[][],long,long,java.util.Random)
*/ 
public static boolean[][] shuffle(boolean[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.booleans.BooleanBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static boolean[][] it.unimi.dsi.fastutil.booleans.BooleanBigArrays.shuffle(boolean[][],java.util.Random)
*/ 
public static boolean[][] shuffle(boolean[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.booleans.BooleanBigArrays.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanBigList it.unimi.dsi.fastutil.booleans.BooleanBigLists.shuffle(it.unimi.dsi.fastutil.booleans.BooleanBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigList shuffle(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.booleans.BooleanBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanLists.shuffle(it.unimi.dsi.fastutil.booleans.BooleanList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList shuffle(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.booleans.BooleanLists.shuffle(p0,p1);
}
/**
*public static byte[] it.unimi.dsi.fastutil.bytes.ByteArrays.shuffle(byte[],int,int,java.util.Random)
*/ 
public static byte[] shuffle(byte[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.bytes.ByteArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static byte[] it.unimi.dsi.fastutil.bytes.ByteArrays.shuffle(byte[],java.util.Random)
*/ 
public static byte[] shuffle(byte[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.bytes.ByteArrays.shuffle(p0,p1);
}
/**
*public static byte[][] it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(byte[][],java.util.Random)
*/ 
public static byte[][] shuffle(byte[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(p0,p1);
}
/**
*public static byte[][] it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(byte[][],long,long,java.util.Random)
*/ 
public static byte[][] shuffle(byte[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.bytes.ByteBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteBigList it.unimi.dsi.fastutil.bytes.ByteBigLists.shuffle(it.unimi.dsi.fastutil.bytes.ByteBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigList shuffle(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.bytes.ByteBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.shuffle(it.unimi.dsi.fastutil.bytes.ByteList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList shuffle(it.unimi.dsi.fastutil.bytes.ByteList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.bytes.ByteLists.shuffle(p0,p1);
}
/**
*public static char[] it.unimi.dsi.fastutil.chars.CharArrays.shuffle(char[],int,int,java.util.Random)
*/ 
public static char[] shuffle(char[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.chars.CharArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static char[] it.unimi.dsi.fastutil.chars.CharArrays.shuffle(char[],java.util.Random)
*/ 
public static char[] shuffle(char[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.chars.CharArrays.shuffle(p0,p1);
}
/**
*public static char[][] it.unimi.dsi.fastutil.chars.CharBigArrays.shuffle(char[][],java.util.Random)
*/ 
public static char[][] shuffle(char[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.chars.CharBigArrays.shuffle(p0,p1);
}
/**
*public static char[][] it.unimi.dsi.fastutil.chars.CharBigArrays.shuffle(char[][],long,long,java.util.Random)
*/ 
public static char[][] shuffle(char[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.chars.CharBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharBigList it.unimi.dsi.fastutil.chars.CharBigLists.shuffle(it.unimi.dsi.fastutil.chars.CharBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.chars.CharBigList shuffle(it.unimi.dsi.fastutil.chars.CharBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.chars.CharBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.shuffle(it.unimi.dsi.fastutil.chars.CharList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.chars.CharList shuffle(it.unimi.dsi.fastutil.chars.CharList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.chars.CharLists.shuffle(p0,p1);
}
/**
*public static double[] it.unimi.dsi.fastutil.doubles.DoubleArrays.shuffle(double[],int,int,java.util.Random)
*/ 
public static double[] shuffle(double[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.doubles.DoubleArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static double[] it.unimi.dsi.fastutil.doubles.DoubleArrays.shuffle(double[],java.util.Random)
*/ 
public static double[] shuffle(double[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.doubles.DoubleArrays.shuffle(p0,p1);
}
/**
*public static double[][] it.unimi.dsi.fastutil.doubles.DoubleBigArrays.shuffle(double[][],long,long,java.util.Random)
*/ 
public static double[][] shuffle(double[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.doubles.DoubleBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static double[][] it.unimi.dsi.fastutil.doubles.DoubleBigArrays.shuffle(double[][],java.util.Random)
*/ 
public static double[][] shuffle(double[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.doubles.DoubleBigArrays.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleBigList it.unimi.dsi.fastutil.doubles.DoubleBigLists.shuffle(it.unimi.dsi.fastutil.doubles.DoubleBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleBigList shuffle(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.doubles.DoubleBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleLists.shuffle(it.unimi.dsi.fastutil.doubles.DoubleList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList shuffle(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.doubles.DoubleLists.shuffle(p0,p1);
}
/**
*public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(float[],int,int,java.util.Random)
*/ 
public static float[] shuffle(float[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static float[] it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(float[],java.util.Random)
*/ 
public static float[] shuffle(float[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.floats.FloatArrays.shuffle(p0,p1);
}
/**
*public static float[][] it.unimi.dsi.fastutil.floats.FloatBigArrays.shuffle(float[][],long,long,java.util.Random)
*/ 
public static float[][] shuffle(float[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.floats.FloatBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static float[][] it.unimi.dsi.fastutil.floats.FloatBigArrays.shuffle(float[][],java.util.Random)
*/ 
public static float[][] shuffle(float[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.floats.FloatBigArrays.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatBigList it.unimi.dsi.fastutil.floats.FloatBigLists.shuffle(it.unimi.dsi.fastutil.floats.FloatBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatBigList shuffle(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.floats.FloatBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatLists.shuffle(it.unimi.dsi.fastutil.floats.FloatList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList shuffle(it.unimi.dsi.fastutil.floats.FloatList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.floats.FloatLists.shuffle(p0,p1);
}
/**
*public static int[] it.unimi.dsi.fastutil.ints.IntArrays.shuffle(int[],int,int,java.util.Random)
*/ 
public static int[] shuffle(int[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.ints.IntArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static int[] it.unimi.dsi.fastutil.ints.IntArrays.shuffle(int[],java.util.Random)
*/ 
public static int[] shuffle(int[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.ints.IntArrays.shuffle(p0,p1);
}
/**
*public static int[][] it.unimi.dsi.fastutil.ints.IntBigArrays.shuffle(int[][],java.util.Random)
*/ 
public static int[][] shuffle(int[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.ints.IntBigArrays.shuffle(p0,p1);
}
/**
*public static int[][] it.unimi.dsi.fastutil.ints.IntBigArrays.shuffle(int[][],long,long,java.util.Random)
*/ 
public static int[][] shuffle(int[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.ints.IntBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntBigList it.unimi.dsi.fastutil.ints.IntBigLists.shuffle(it.unimi.dsi.fastutil.ints.IntBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.ints.IntBigList shuffle(it.unimi.dsi.fastutil.ints.IntBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.ints.IntBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.shuffle(it.unimi.dsi.fastutil.ints.IntList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.ints.IntList shuffle(it.unimi.dsi.fastutil.ints.IntList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.ints.IntLists.shuffle(p0,p1);
}
/**
*public static long[] it.unimi.dsi.fastutil.longs.LongArrays.shuffle(long[],int,int,java.util.Random)
*/ 
public static long[] shuffle(long[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.longs.LongArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static long[] it.unimi.dsi.fastutil.longs.LongArrays.shuffle(long[],java.util.Random)
*/ 
public static long[] shuffle(long[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.longs.LongArrays.shuffle(p0,p1);
}
/**
*public static long[][] it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(long[][],java.util.Random)
*/ 
public static long[][] shuffle(long[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(p0,p1);
}
/**
*public static long[][] it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(long[][],long,long,java.util.Random)
*/ 
public static long[][] shuffle(long[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.longs.LongBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongBigList it.unimi.dsi.fastutil.longs.LongBigLists.shuffle(it.unimi.dsi.fastutil.longs.LongBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.longs.LongBigList shuffle(it.unimi.dsi.fastutil.longs.LongBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.longs.LongBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongLists.shuffle(it.unimi.dsi.fastutil.longs.LongList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.longs.LongList shuffle(it.unimi.dsi.fastutil.longs.LongList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.longs.LongLists.shuffle(p0,p1);
}
/**
*public static <K> K[] it.unimi.dsi.fastutil.objects.ObjectArrays.shuffle(K[],java.util.Random)
*/ 
public static <K> K[] shuffle(K[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectArrays.shuffle(p0,p1);
}
/**
*public static <K> K[] it.unimi.dsi.fastutil.objects.ObjectArrays.shuffle(K[],int,int,java.util.Random)
*/ 
public static <K> K[] shuffle(K[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.objects.ObjectArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(K[][],long,long,java.util.Random)
*/ 
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(K[][],java.util.Random)
*/ 
public static <K> K[][] shuffle(K[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> it.unimi.dsi.fastutil.objects.ObjectBigLists.shuffle(it.unimi.dsi.fastutil.objects.ObjectBigList<K>,java.util.Random)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigLists.shuffle(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> it.unimi.dsi.fastutil.objects.ObjectLists.shuffle(it.unimi.dsi.fastutil.objects.ObjectList<K>,java.util.Random)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectLists.shuffle(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> it.unimi.dsi.fastutil.objects.ReferenceBigLists.shuffle(it.unimi.dsi.fastutil.objects.ReferenceBigList<K>,java.util.Random)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ReferenceBigLists.shuffle(p0,p1);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> it.unimi.dsi.fastutil.objects.ReferenceLists.shuffle(it.unimi.dsi.fastutil.objects.ReferenceList<K>,java.util.Random)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ReferenceLists.shuffle(p0,p1);
}
/**
*public static short[] it.unimi.dsi.fastutil.shorts.ShortArrays.shuffle(short[],int,int,java.util.Random)
*/ 
public static short[] shuffle(short[] p0,int p1,int p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.shorts.ShortArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static short[] it.unimi.dsi.fastutil.shorts.ShortArrays.shuffle(short[],java.util.Random)
*/ 
public static short[] shuffle(short[] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.shorts.ShortArrays.shuffle(p0,p1);
}
/**
*public static short[][] it.unimi.dsi.fastutil.shorts.ShortBigArrays.shuffle(short[][],java.util.Random)
*/ 
public static short[][] shuffle(short[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.shorts.ShortBigArrays.shuffle(p0,p1);
}
/**
*public static short[][] it.unimi.dsi.fastutil.shorts.ShortBigArrays.shuffle(short[][],long,long,java.util.Random)
*/ 
public static short[][] shuffle(short[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.shorts.ShortBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortBigList it.unimi.dsi.fastutil.shorts.ShortBigLists.shuffle(it.unimi.dsi.fastutil.shorts.ShortBigList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortBigList shuffle(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.shorts.ShortBigLists.shuffle(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortLists.shuffle(it.unimi.dsi.fastutil.shorts.ShortList,java.util.Random)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList shuffle(it.unimi.dsi.fastutil.shorts.ShortList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.shorts.ShortLists.shuffle(p0,p1);
}
}
