package com.zengfr.supercommons;
import org.apache.commons.math3.analysis.FunctionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultivariateDifferentiableVectorFunctionUtil{ 
public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction toMultivariateDifferentiableVectorFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction p0){
return FunctionUtils.toMultivariateDifferentiableVectorFunction(p0);
}
public static org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction p0){
return FunctionUtils.toDifferentiableMultivariateVectorFunction(p0);
}
}
