package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrackCustomMetricProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    metric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None,
    targetValue: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.TrackCustomMetricProps =
    (new software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .metric(metric.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .targetValue(targetValue.orNull)
      .build()
}
