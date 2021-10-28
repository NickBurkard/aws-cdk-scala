package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CrossAccountZoneDelegationRecord {

  def apply(
    internalResourceId: String,
    delegationRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    parentHostedZoneName: Option[String] = None,
    delegatedZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    parentHostedZoneId: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord =
    software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord.Builder
      .create(stackCtx, internalResourceId)
      .delegationRole(delegationRole.orNull)
      .parentHostedZoneName(parentHostedZoneName.orNull)
      .delegatedZone(delegatedZone.orNull)
      .parentHostedZoneId(parentHostedZoneId.orNull)
      .ttl(ttl.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
