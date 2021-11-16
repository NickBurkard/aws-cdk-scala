package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HostedZoneContextQuery {

  def apply(
    domainName: String,
    region: String,
    account: String,
    vpcId: Option[String] = None,
    privateZone: Option[Boolean] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery.Builder)
      .domainName(domainName)
      .region(region)
      .account(account)
      .vpcId(vpcId.orNull)
      .privateZone(privateZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
