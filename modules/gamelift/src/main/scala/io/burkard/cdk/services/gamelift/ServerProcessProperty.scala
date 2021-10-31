package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerProcessProperty {

  def apply(
    concurrentExecutions: Option[Number] = None,
    launchPath: Option[String] = None,
    parameters: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty.Builder)
      .concurrentExecutions(concurrentExecutions.orNull)
      .launchPath(launchPath.orNull)
      .parameters(parameters.orNull)
      .build()
}
