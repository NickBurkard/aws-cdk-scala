package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcSubnet {

  def apply(
    routeTableId: Option[String] = None,
    cidr: Option[String] = None,
    availabilityZone: Option[String] = None,
    subnetId: Option[String] = None
  ): software.amazon.awscdk.cxapi.VpcSubnet =
    (new software.amazon.awscdk.cxapi.VpcSubnet.Builder)
      .routeTableId(routeTableId.orNull)
      .cidr(cidr.orNull)
      .availabilityZone(availabilityZone.orNull)
      .subnetId(subnetId.orNull)
      .build()
}
