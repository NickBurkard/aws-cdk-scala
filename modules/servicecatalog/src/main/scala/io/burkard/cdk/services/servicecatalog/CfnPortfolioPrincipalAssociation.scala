package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioPrincipalAssociation {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    principalArn: String,
    principalType: String,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .principalArn(principalArn)
      .principalType(principalType)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
