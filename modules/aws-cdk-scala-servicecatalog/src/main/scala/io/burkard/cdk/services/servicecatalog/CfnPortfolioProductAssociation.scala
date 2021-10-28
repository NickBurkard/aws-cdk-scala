package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPortfolioProductAssociation {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    sourcePortfolioId: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .sourcePortfolioId(sourcePortfolioId.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .build()
}
