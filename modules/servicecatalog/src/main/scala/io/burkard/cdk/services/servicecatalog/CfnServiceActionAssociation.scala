package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceActionAssociation {

  def apply(
    internalResourceId: String,
    serviceActionId: String,
    provisioningArtifactId: String,
    productId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation.Builder
      .create(stackCtx, internalResourceId)
      .serviceActionId(serviceActionId)
      .provisioningArtifactId(provisioningArtifactId)
      .productId(productId)
      .build()
}
