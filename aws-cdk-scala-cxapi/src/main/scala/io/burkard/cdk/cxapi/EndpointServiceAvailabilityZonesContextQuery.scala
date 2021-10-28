package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointServiceAvailabilityZonesContextQuery {

  def apply(
    serviceName: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery =
    (new software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery.Builder)
      .serviceName(serviceName.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}
