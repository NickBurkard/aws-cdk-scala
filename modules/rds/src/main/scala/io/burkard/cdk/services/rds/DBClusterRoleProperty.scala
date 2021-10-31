package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DBClusterRoleProperty {

  def apply(
    featureName: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty =
    (new software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.Builder)
      .featureName(featureName.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
