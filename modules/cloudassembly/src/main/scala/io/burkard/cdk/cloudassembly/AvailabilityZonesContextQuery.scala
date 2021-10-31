package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AvailabilityZonesContextQuery {

  def apply(
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.Builder)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
