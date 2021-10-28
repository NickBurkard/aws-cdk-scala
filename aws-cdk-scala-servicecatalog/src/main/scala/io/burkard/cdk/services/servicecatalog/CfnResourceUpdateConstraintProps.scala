package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceUpdateConstraintProps {

  def apply(
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    tagUpdateOnProvisionedProduct: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps.Builder)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .build()
}
