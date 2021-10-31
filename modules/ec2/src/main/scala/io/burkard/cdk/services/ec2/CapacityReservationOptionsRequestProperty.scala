package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityReservationOptionsRequestProperty {

  def apply(
    usageStrategy: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder)
      .usageStrategy(usageStrategy.orNull)
      .build()
}
