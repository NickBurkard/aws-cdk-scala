package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcSubnet {

  def apply(
    routeTableId: String,
    availabilityZone: String,
    subnetId: String,
    cidr: Option[String] = None
  ): software.amazon.awscdk.cxapi.VpcSubnet =
    (new software.amazon.awscdk.cxapi.VpcSubnet.Builder)
      .routeTableId(routeTableId)
      .availabilityZone(availabilityZone)
      .subnetId(subnetId)
      .cidr(cidr.orNull)
      .build()
}
