package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioPrincipalAssociation {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    principalArn: Option[String] = None,
    acceptLanguage: Option[String] = None,
    principalType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .principalArn(principalArn.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .principalType(principalType.orNull)
      .build()
}
