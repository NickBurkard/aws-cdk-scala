package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioShare {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    accountId: String,
    shareTagOptions: Option[Boolean] = None,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare =
    software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .accountId(accountId)
      .shareTagOptions(shareTagOptions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
