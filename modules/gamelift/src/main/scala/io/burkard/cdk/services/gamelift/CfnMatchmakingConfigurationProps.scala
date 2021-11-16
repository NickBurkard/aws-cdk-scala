package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMatchmakingConfigurationProps {

  def apply(
    name: String,
    requestTimeoutSeconds: Number,
    acceptanceRequired: Boolean,
    ruleSetName: String,
    gameSessionQueueArns: Option[List[String]] = None,
    flexMatchMode: Option[String] = None,
    description: Option[String] = None,
    additionalPlayerCount: Option[Number] = None,
    gameProperties: Option[List[_]] = None,
    customEventData: Option[String] = None,
    gameSessionData: Option[String] = None,
    notificationTarget: Option[String] = None,
    acceptanceTimeoutSeconds: Option[Number] = None,
    backfillMode: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps =
    (new software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps.Builder)
      .name(name)
      .requestTimeoutSeconds(requestTimeoutSeconds)
      .acceptanceRequired(acceptanceRequired)
      .ruleSetName(ruleSetName)
      .gameSessionQueueArns(gameSessionQueueArns.map(_.asJava).orNull)
      .flexMatchMode(flexMatchMode.orNull)
      .description(description.orNull)
      .additionalPlayerCount(additionalPlayerCount.orNull)
      .gameProperties(gameProperties.map(_.asJava).orNull)
      .customEventData(customEventData.orNull)
      .gameSessionData(gameSessionData.orNull)
      .notificationTarget(notificationTarget.orNull)
      .acceptanceTimeoutSeconds(acceptanceTimeoutSeconds.orNull)
      .backfillMode(backfillMode.orNull)
      .build()
}
