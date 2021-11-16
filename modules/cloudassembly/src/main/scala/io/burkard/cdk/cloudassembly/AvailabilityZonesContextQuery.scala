package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AvailabilityZonesContextQuery {

  def apply(
    region: String,
    account: String,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery.Builder)
      .region(region)
      .account(account)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
