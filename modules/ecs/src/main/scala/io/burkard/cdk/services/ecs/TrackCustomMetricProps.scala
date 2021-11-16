package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrackCustomMetricProps {

  def apply(
    metric: software.amazon.awscdk.services.cloudwatch.IMetric,
    targetValue: Number,
    disableScaleIn: Option[Boolean] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.TrackCustomMetricProps =
    (new software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder)
      .metric(metric)
      .targetValue(targetValue)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .build()
}
