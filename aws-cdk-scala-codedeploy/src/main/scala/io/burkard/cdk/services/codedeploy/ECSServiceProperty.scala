package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ECSServiceProperty {

  def apply(
    serviceName: Option[String] = None,
    clusterName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ECSServiceProperty.Builder)
      .serviceName(serviceName.orNull)
      .clusterName(clusterName.orNull)
      .build()
}
