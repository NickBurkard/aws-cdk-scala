package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UtilizationScalingOptions {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    utilizationTarget: Option[Number] = None,
    policyName: Option[String] = None,
    scaleOutCooldown: Option[software.amazon.awscdk.Duration] = None,
    scaleInCooldown: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.lambda.UtilizationScalingOptions =
    (new software.amazon.awscdk.services.lambda.UtilizationScalingOptions.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .utilizationTarget(utilizationTarget.orNull)
      .policyName(policyName.orNull)
      .scaleOutCooldown(scaleOutCooldown.orNull)
      .scaleInCooldown(scaleInCooldown.orNull)
      .build()
}
