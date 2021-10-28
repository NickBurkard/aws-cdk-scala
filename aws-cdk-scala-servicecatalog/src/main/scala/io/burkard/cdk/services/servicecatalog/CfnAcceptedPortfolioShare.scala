package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAcceptedPortfolioShare {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare =
    software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
