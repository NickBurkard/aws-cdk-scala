package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioShareProps {

  def apply(
    portfolioId: String,
    accountId: String,
    shareTagOptions: Option[Boolean] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps.Builder)
      .portfolioId(portfolioId)
      .accountId(accountId)
      .shareTagOptions(shareTagOptions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
