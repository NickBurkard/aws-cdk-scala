package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAcceptedPortfolioShare {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare =
    software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
