package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuntimeConfigurationProperty {

  def apply(
    serverProcesses: Option[List[_]] = None,
    maxConcurrentGameSessionActivations: Option[Number] = None,
    gameSessionActivationTimeoutSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty.Builder)
      .serverProcesses(serverProcesses.map(_.asJava).orNull)
      .maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations.orNull)
      .gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds.orNull)
      .build()
}
