package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteCalculator {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    calculatorName: Option[String] = None,
    dataSource: Option[String] = None,
    pricingPlan: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnRouteCalculator =
    software.amazon.awscdk.services.location.CfnRouteCalculator.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .calculatorName(calculatorName.orNull)
      .dataSource(dataSource.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
