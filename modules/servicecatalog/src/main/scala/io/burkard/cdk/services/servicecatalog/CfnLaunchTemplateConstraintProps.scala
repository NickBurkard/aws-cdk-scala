package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchTemplateConstraintProps {

  def apply(
    portfolioId: String,
    productId: String,
    rules: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps.Builder)
      .portfolioId(portfolioId)
      .productId(productId)
      .rules(rules)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
