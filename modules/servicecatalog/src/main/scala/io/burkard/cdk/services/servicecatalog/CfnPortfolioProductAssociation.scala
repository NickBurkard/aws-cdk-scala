package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioProductAssociation {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    productId: String,
    sourcePortfolioId: Option[String] = None,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .productId(productId)
      .sourcePortfolioId(sourcePortfolioId.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
