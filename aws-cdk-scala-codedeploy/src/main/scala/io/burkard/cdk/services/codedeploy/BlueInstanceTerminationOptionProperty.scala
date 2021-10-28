package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlueInstanceTerminationOptionProperty {

  def apply(
    terminationWaitTimeInMinutes: Option[Number] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.Builder)
      .terminationWaitTimeInMinutes(terminationWaitTimeInMinutes.orNull)
      .action(action.orNull)
      .build()
}
