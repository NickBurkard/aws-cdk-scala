package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostedZoneContextQuery {

  def apply(
    vpcId: Option[String] = None,
    domainName: Option[String] = None,
    region: Option[String] = None,
    privateZone: Option[Boolean] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery.Builder)
      .vpcId(vpcId.orNull)
      .domainName(domainName.orNull)
      .region(region.orNull)
      .privateZone(privateZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
