package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DBClusterRoleProperty {

  def apply(
    roleArn: String,
    featureName: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty =
    (new software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.Builder)
      .roleArn(roleArn)
      .featureName(featureName.orNull)
      .build()
}
