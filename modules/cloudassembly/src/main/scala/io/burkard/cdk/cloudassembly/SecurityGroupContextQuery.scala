package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroupContextQuery {

  def apply(
    region: String,
    account: String,
    securityGroupId: Option[String] = None,
    vpcId: Option[String] = None,
    securityGroupName: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.Builder)
      .region(region)
      .account(account)
      .securityGroupId(securityGroupId.orNull)
      .vpcId(vpcId.orNull)
      .securityGroupName(securityGroupName.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
