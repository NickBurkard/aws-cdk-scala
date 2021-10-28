package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServiceActionAssociationProps {

  def apply(
    serviceActionId: Option[String] = None,
    provisioningArtifactId: Option[String] = None,
    productId: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps.Builder)
      .serviceActionId(serviceActionId.orNull)
      .provisioningArtifactId(provisioningArtifactId.orNull)
      .productId(productId.orNull)
      .build()
}
