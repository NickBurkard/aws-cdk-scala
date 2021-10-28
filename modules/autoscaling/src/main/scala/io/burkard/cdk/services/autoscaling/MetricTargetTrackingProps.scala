package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricTargetTrackingProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    metric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    targetValue: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps =
    (new software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .metric(metric.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .targetValue(targetValue.orNull)
      .build()
}
