package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossAccountZoneDelegationRecord {

  def apply(
    internalResourceId: String,
    delegationRole: software.amazon.awscdk.services.iam.IRole,
    delegatedZone: software.amazon.awscdk.services.route53.IHostedZone,
    parentHostedZoneName: Option[String] = None,
    parentHostedZoneId: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord =
    software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord.Builder
      .create(stackCtx, internalResourceId)
      .delegationRole(delegationRole)
      .delegatedZone(delegatedZone)
      .parentHostedZoneName(parentHostedZoneName.orNull)
      .parentHostedZoneId(parentHostedZoneId.orNull)
      .ttl(ttl.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
