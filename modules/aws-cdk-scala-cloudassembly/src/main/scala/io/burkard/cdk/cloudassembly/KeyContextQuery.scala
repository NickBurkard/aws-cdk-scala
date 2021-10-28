package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyContextQuery {

  def apply(
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None,
    aliasName: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.KeyContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.KeyContextQuery.Builder)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .aliasName(aliasName.orNull)
      .build()
}
