package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityReservationTargetProperty {

  def apply(
    capacityReservationId: Option[String] = None,
    capacityReservationResourceGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty.Builder)
      .capacityReservationId(capacityReservationId.orNull)
      .capacityReservationResourceGroupArn(capacityReservationResourceGroupArn.orNull)
      .build()
}
