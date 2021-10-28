package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DBInstanceRoleProperty {

  def apply(
    featureName: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty =
    (new software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty.Builder)
      .featureName(featureName.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
