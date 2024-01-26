package com.example.bottomnav.ui.theme.components

sealed class Routes(val route: String) {
    object Endurance : Routes("endurance") {
        object YoYoTest: Routes("endurance/yoyotest")
        object OneMileJogTest: Routes("endurance/onemilejogtest")
        object BalkeTest: Routes("endurance/balketest")
        object CooperTest: Routes("endurance/coopertest")
    }
    object Flexibility : Routes("flexibility") {
        object SitReachTest: Routes("flexibility/sitreachtest")
        object HipFlexionTest: Routes("flexibility/hipflexiontest")
        object BackScratchTest: Routes("flexibility/backscratchtest")
        object ShoulderFlexibilityTest: Routes("flexibility/shoulderflexibiltytest")
    }
    object Strength : Routes("strength") {
        object StaticMuscularEnduranceTest: Routes("strength/staticmuscularendurancetest")
        object DynamicMuscularEnduranceTest: Routes("strength/dynamicmuscularendurancetest")
        object ElasticStrengthTest: Routes("strength/elasticstrengthtest")
    }
    object Speed : Routes("speed") {
        object TenMeterStrideTest: Routes("speed/tenmeterstridetest")
        object ThirtyMeterAccTest: Routes("speed/thirtymeteracctest")
        object SixtyMeterSpeedTest: Routes("speed/siztymeterspeedtest")
        object FiveTenFiveTest: Routes("speed/fivetenfivetest")
    }
    object Balance : Routes("balance") {
        object FunctionalReachTest: Routes("balance/functionalreachtest")
        object ParallelStanceTest: Routes("balance/parallelstancetest")
        object SingleLegStanceTest: Routes("balance/singlelegstancetest")
        object TandemStanceTest: Routes("balance/tandemstancetest")
    }
}


