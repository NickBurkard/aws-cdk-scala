package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DBInstanceRoleProperty {

  def apply(
    featureName: String,
    roleArn: String
  ): software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty =
    (new software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty.Builder)
      .featureName(featureName)
      .roleArn(roleArn)
      .build()
}
