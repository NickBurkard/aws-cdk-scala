package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPortfolioPrincipalAssociationProps {

  def apply(
    portfolioId: Option[String] = None,
    principalArn: Option[String] = None,
    acceptLanguage: Option[String] = None,
    principalType: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps.Builder)
      .portfolioId(portfolioId.orNull)
      .principalArn(principalArn.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .principalType(principalType.orNull)
      .build()
}
