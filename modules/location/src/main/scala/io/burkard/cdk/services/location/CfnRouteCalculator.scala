package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteCalculator {

  def apply(
    internalResourceId: String,
    calculatorName: String,
    dataSource: String,
    pricingPlan: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnRouteCalculator =
    software.amazon.awscdk.services.location.CfnRouteCalculator.Builder
      .create(stackCtx, internalResourceId)
      .calculatorName(calculatorName)
      .dataSource(dataSource)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .build()
}
