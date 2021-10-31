package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteCalculatorProps {

  def apply(
    description: Option[String] = None,
    calculatorName: Option[String] = None,
    dataSource: Option[String] = None,
    pricingPlan: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnRouteCalculatorProps =
    (new software.amazon.awscdk.services.location.CfnRouteCalculatorProps.Builder)
      .description(description.orNull)
      .calculatorName(calculatorName.orNull)
      .dataSource(dataSource.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
