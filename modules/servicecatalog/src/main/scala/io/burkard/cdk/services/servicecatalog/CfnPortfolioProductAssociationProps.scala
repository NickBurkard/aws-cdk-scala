package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioProductAssociationProps {

  def apply(
    portfolioId: String,
    productId: String,
    sourcePortfolioId: Option[String] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps.Builder)
      .portfolioId(portfolioId)
      .productId(productId)
      .sourcePortfolioId(sourcePortfolioId.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
