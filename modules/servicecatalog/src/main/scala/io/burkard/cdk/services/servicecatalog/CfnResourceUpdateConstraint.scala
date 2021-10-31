package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceUpdateConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    tagUpdateOnProvisionedProduct: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .build()
}
