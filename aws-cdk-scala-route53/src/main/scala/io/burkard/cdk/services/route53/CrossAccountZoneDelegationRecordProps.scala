package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CrossAccountZoneDelegationRecordProps {

  def apply(
    delegationRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    parentHostedZoneName: Option[String] = None,
    delegatedZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    parentHostedZoneId: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps =
    (new software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps.Builder)
      .delegationRole(delegationRole.orNull)
      .parentHostedZoneName(parentHostedZoneName.orNull)
      .delegatedZone(delegatedZone.orNull)
      .parentHostedZoneId(parentHostedZoneId.orNull)
      .ttl(ttl.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
