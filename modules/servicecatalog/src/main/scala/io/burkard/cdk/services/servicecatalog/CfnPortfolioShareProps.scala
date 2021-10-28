package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPortfolioShareProps {

  def apply(
    portfolioId: Option[String] = None,
    shareTagOptions: Option[Boolean] = None,
    accountId: Option[String] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps.Builder)
      .portfolioId(portfolioId.orNull)
      .shareTagOptions(shareTagOptions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accountId(accountId.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
