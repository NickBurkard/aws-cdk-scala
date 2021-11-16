package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricTargetTrackingProps {

  def apply(
    metric: software.amazon.awscdk.services.cloudwatch.IMetric,
    targetValue: Number,
    disableScaleIn: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps =
    (new software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder)
      .metric(metric)
      .targetValue(targetValue)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .build()
}
