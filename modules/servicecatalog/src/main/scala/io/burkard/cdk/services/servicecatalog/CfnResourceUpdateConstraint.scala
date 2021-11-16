package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceUpdateConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    tagUpdateOnProvisionedProduct: String,
    productId: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
      .productId(productId)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
