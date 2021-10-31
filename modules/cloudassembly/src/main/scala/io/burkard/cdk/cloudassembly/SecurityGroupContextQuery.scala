package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroupContextQuery {

  def apply(
    securityGroupId: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.Builder)
      .securityGroupId(securityGroupId.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
