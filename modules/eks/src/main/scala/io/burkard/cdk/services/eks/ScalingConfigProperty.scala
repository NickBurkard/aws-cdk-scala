package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingConfigProperty {

  def apply(
    desiredSize: Option[Number] = None,
    maxSize: Option[Number] = None,
    minSize: Option[Number] = None
  ): software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnNodegroup.ScalingConfigProperty.Builder)
      .desiredSize(desiredSize.orNull)
      .maxSize(maxSize.orNull)
      .minSize(minSize.orNull)
      .build()
}
