package io.burkard.cdk.services.neptune

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DBClusterRoleProperty {

  def apply(
    roleArn: String,
    featureName: Option[String] = None
  ): software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty =
    (new software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty.Builder)
      .roleArn(roleArn)
      .featureName(featureName.orNull)
      .build()
}
