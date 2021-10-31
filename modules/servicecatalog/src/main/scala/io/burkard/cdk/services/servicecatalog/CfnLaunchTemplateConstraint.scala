package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchTemplateConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None,
    rules: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .rules(rules.orNull)
      .build()
}
