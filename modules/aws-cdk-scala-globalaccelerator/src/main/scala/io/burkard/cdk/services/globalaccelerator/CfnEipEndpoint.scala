package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEipEndpoint {

  def apply(
    eip: software.amazon.awscdk.services.ec2.CfnEIP,
    weight: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint =
    software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint.Builder
      .create(eip)
      .weight(weight.orNull)
      .build()
}
