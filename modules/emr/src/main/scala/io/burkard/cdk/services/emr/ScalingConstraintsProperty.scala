package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingConstraintsProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    minCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
