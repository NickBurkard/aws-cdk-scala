package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmProperty.Builder)
      .name(name.orNull)
      .build()
}
