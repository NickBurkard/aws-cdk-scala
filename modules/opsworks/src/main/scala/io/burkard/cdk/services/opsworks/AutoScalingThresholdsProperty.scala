package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingThresholdsProperty {

  def apply(
    thresholdsWaitTime: Option[Number] = None,
    cpuThreshold: Option[Number] = None,
    ignoreMetricsTime: Option[Number] = None,
    memoryThreshold: Option[Number] = None,
    instanceCount: Option[Number] = None,
    loadThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty =
    (new software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder)
      .thresholdsWaitTime(thresholdsWaitTime.orNull)
      .cpuThreshold(cpuThreshold.orNull)
      .ignoreMetricsTime(ignoreMetricsTime.orNull)
      .memoryThreshold(memoryThreshold.orNull)
      .instanceCount(instanceCount.orNull)
      .loadThreshold(loadThreshold.orNull)
      .build()
}
