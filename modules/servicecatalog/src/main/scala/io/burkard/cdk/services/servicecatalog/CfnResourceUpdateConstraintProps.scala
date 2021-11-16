package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceUpdateConstraintProps {

  def apply(
    portfolioId: String,
    tagUpdateOnProvisionedProduct: String,
    productId: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps.Builder)
      .portfolioId(portfolioId)
      .tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
      .productId(productId)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
