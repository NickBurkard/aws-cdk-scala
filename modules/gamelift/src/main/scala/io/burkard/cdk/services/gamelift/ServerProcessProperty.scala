package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerProcessProperty {

  def apply(
    concurrentExecutions: Number,
    launchPath: String,
    parameters: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty.Builder)
      .concurrentExecutions(concurrentExecutions)
      .launchPath(launchPath)
      .parameters(parameters.orNull)
      .build()
}
