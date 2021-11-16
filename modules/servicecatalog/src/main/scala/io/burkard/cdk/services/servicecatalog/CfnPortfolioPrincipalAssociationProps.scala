package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolioPrincipalAssociationProps {

  def apply(
    portfolioId: String,
    principalArn: String,
    principalType: String,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps.Builder)
      .portfolioId(portfolioId)
      .principalArn(principalArn)
      .principalType(principalType)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
