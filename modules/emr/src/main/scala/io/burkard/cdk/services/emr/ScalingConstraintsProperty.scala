package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingConstraintsProperty {

  def apply(
    maxCapacity: Number,
    minCapacity: Number
  ): software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder)
      .maxCapacity(maxCapacity)
      .minCapacity(minCapacity)
      .build()
}
