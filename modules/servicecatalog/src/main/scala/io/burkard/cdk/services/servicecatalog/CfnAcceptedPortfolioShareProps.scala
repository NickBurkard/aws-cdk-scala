package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAcceptedPortfolioShareProps {

  def apply(
    portfolioId: String,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps.Builder)
      .portfolioId(portfolioId)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
