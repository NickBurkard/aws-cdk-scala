package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPortfolioProductAssociationProps {

  def apply(
    portfolioId: Option[String] = None,
    sourcePortfolioId: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps.Builder)
      .portfolioId(portfolioId.orNull)
      .sourcePortfolioId(sourcePortfolioId.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .build()
}
