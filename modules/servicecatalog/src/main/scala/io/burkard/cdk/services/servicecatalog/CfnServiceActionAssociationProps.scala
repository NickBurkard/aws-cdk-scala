package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceActionAssociationProps {

  def apply(
    serviceActionId: String,
    provisioningArtifactId: String,
    productId: String
  ): software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps.Builder)
      .serviceActionId(serviceActionId)
      .provisioningArtifactId(provisioningArtifactId)
      .productId(productId)
      .build()
}
