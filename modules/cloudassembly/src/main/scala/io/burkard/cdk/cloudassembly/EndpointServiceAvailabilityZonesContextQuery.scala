package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointServiceAvailabilityZonesContextQuery {

  def apply(
    serviceName: String,
    region: String,
    account: String,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery.Builder)
      .serviceName(serviceName)
      .region(region)
      .account(account)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
