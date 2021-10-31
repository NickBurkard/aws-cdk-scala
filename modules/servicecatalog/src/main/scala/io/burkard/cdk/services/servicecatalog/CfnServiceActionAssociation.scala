package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceActionAssociation {

  def apply(
    internalResourceId: String,
    serviceActionId: Option[String] = None,
    provisioningArtifactId: Option[String] = None,
    productId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation.Builder
      .create(stackCtx, internalResourceId)
      .serviceActionId(serviceActionId.orNull)
      .provisioningArtifactId(provisioningArtifactId.orNull)
      .productId(productId.orNull)
      .build()
}
