package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointServiceAvailabilityZonesContextQuery {

  def apply(
    serviceName: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery.Builder)
      .serviceName(serviceName.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
