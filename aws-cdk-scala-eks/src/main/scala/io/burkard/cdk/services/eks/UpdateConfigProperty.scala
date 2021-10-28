package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UpdateConfigProperty {

  def apply(
    maxUnavailablePercentage: Option[Number] = None,
    maxUnavailable: Option[Number] = None
  ): software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnNodegroup.UpdateConfigProperty.Builder)
      .maxUnavailablePercentage(maxUnavailablePercentage.orNull)
      .maxUnavailable(maxUnavailable.orNull)
      .build()
}
