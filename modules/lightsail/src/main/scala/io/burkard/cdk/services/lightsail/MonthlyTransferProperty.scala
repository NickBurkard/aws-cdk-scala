package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonthlyTransferProperty {

  def apply(
    gbPerMonthAllocated: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty.Builder)
      .gbPerMonthAllocated(gbPerMonthAllocated.orNull)
      .build()
}
