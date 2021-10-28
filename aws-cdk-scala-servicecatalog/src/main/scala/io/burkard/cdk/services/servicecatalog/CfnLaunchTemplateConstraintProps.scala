package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLaunchTemplateConstraintProps {

  def apply(
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None,
    rules: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps.Builder)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .rules(rules.orNull)
      .build()
}
