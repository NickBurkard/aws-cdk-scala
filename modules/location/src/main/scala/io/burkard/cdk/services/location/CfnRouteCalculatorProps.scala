package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteCalculatorProps {

  def apply(
    calculatorName: String,
    dataSource: String,
    pricingPlan: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnRouteCalculatorProps =
    (new software.amazon.awscdk.services.location.CfnRouteCalculatorProps.Builder)
      .calculatorName(calculatorName)
      .dataSource(dataSource)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .build()
}
