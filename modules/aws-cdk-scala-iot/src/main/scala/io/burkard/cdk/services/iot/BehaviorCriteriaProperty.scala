package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BehaviorCriteriaProperty {

  def apply(
    mlDetectionConfig: Option[software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty] = None,
    consecutiveDatapointsToAlarm: Option[Number] = None,
    comparisonOperator: Option[String] = None,
    statisticalThreshold: Option[software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty] = None,
    consecutiveDatapointsToClear: Option[Number] = None,
    value: Option[software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty] = None,
    durationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.BehaviorCriteriaProperty.Builder)
      .mlDetectionConfig(mlDetectionConfig.orNull)
      .consecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .statisticalThreshold(statisticalThreshold.orNull)
      .consecutiveDatapointsToClear(consecutiveDatapointsToClear.orNull)
      .value(value.orNull)
      .durationSeconds(durationSeconds.orNull)
      .build()
}
