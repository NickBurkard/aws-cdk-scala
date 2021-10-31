package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingConfigurationProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    autoPause: Option[Boolean] = None,
    minCapacity: Option[Number] = None,
    secondsUntilAutoPause: Option[Number] = None
  ): software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty =
    (new software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .autoPause(autoPause.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minCapacity(minCapacity.orNull)
      .secondsUntilAutoPause(secondsUntilAutoPause.orNull)
      .build()
}
